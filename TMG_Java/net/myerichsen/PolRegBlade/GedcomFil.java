package net.myerichsen.PolRegBlade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;

/**
 * Denne klasse implementerer en GEDCOM fil og kan rumme et antal Registerblade
 * 
 * @author merichse
 * @version 1.3.1 19/05/2011
 * 
 */

public class GedcomFil {

	private int individCounter;

	private int familieCounter;

	private Fornavn fn;

	private final KendteFornavne kf = KendteFornavne.getListe();

	/**
	 * Liste over familier
	 * 
	 */
	private Vector<Familie> familier;

	/**
	 * Liste over ægtefæller
	 * 
	 */
	private Vector<Person> aegteFaeller;

	/**
	 * Liste over børn
	 * 
	 */
	private Vector<Person> boern;

	/**
	 * Liste over adresser
	 * 
	 */
	private Vector<Adresse> adresser;

	/**
	 * Liste over akkumulerede registerblade
	 * 
	 */
	private Vector<RegisterBlad> registerBlade;

	/**
	 * Input fra clipboard
	 * 
	 */
	private String inputText;

	private String convertDate(final String slashDate) {
		final String[] sa = slashDate.split("-");

		if (sa.length != 3) {
			return slashDate;
		}

		return sa[0] + " " + convertMonth(sa[1]) + " " + sa[2];
	}

	private String convertMonth(final String month) {
		String s = "???";
		final int mnd = Integer.parseInt(month);

		switch (mnd) {
		case 1:
			s = "JAN";
			break;

		case 2:
			s = "FEB";
			break;

		case 3:
			s = "MAR";
			break;

		case 4:
			s = "APR";
			break;

		case 5:
			s = "MAY";
			break;

		case 6:
			s = "JUN";
			break;

		case 7:
			s = "JUL";
			break;

		case 8:
			s = "AUG";
			break;

		case 9:
			s = "SEP";
			break;

		case 10:
			s = "AUG";
			break;

		case 11:
			s = "NOV";
			break;

		case 12:
			s = "DEC";
			break;

		default:
			s = "???";
			break;
		}
		return s;
	}

	/**
	 * @return the adresser
	 */
	public Vector<Adresse> getAdresser() {
		return adresser;
	}

	/**
	 * @return the aegteFaeller
	 */
	public Vector<Person> getAegteFaeller() {
		return aegteFaeller;
	}

	/**
	 * @return the boern
	 */
	public Vector<Person> getBoern() {
		return boern;
	}

	/**
	 * @return the familier
	 */
	public Vector<Familie> getFamilier() {
		return familier;
	}

	/**
	 * @return the hovedPerson
	 */
	/*
	 * public Person getHovedPerson() { return hovedPerson; }
	 */
	/**
	 * @return the inputText
	 */
	public String getInputText() {
		return inputText;
	}

	/**
	 * @return the registerBlade
	 */
	public Vector<RegisterBlad> getRegisterBlade() {
		return registerBlade;
	}

	/**
	 * @param gedcomFile
	 * @return String
	 * @throws PolRegException
	 */
	public String hentGedcomTilVindue(final File gedcomFile)
			throws PolRegException {
		final StringBuffer sb = new StringBuffer();
		try {
			String line = null;
			final BufferedReader input = new BufferedReader(new FileReader(
					gedcomFile));
			while ((line = input.readLine()) != null) {
				sb.append(line + "\n");
			}

			return new String(sb.toString().getBytes(), "ANSEL");
		} catch (final Exception e) {
			throw new PolRegException(e);
		}
	}

	/**
	 * Parse the String in inputText
	 * 
	 * @param koen
	 * @param frame
	 * @throws PolRegException
	 */
	public void parse(final Koen koen, final JFrame frame) throws PolRegException {
		// Hvis vektoren ikke allerede eksisterer,
		// eller hvis der ikke skal appendes,
		// skal den oprettes
		final Session aSession = Session.getSession();

		if ((registerBlade == null) || (aSession.isAppend() == false)) {
			registerBlade = new Vector<RegisterBlad>();
			individCounter = 1;
			familieCounter = 1;
		}

		// Opret et nyt, tomt registerblad og andre lokale variable
		String line;
		Person hovedPerson = null;
		Person denneAegteFaelle = null;
		Person detteBarn = null;
		final RegisterBlad rb = new RegisterBlad();
		final int foersteFamilieIdPaaBlad = familieCounter;

		aegteFaeller = new Vector<Person>();
		boern = new Vector<Person>();
		familier = new Vector<Familie>();
		adresser = new Vector<Adresse>();

		BufferedReader reader;

		try {
			reader = new BufferedReader(new StringReader(getInputText()));

			while ((line = reader.readLine()) != null) {
				if (line.length() > 0) {
					// Test for afslutningslinie af betydende tekst
					if (line.startsWith("Husk at læse")) {
						break;
					}

					// Ignorer registrators kommentarer
					if (line.startsWith("Registrators kommentar:")) {
						continue;
					}

					// Hovedperson nyoprettes og hægtes på registerbladet
					if (line.equals("Hovedperson")) {
						hovedPerson = new Person();
						hovedPerson.setId(individCounter++);

						line = reader.readLine();

						final String[] subLine = line.split(" , ");
						hovedPerson.setNavn(subLine[0]);
						hovedPerson.setKoen(koen);
						hovedPerson.setFoedeDato(convertDate(subLine[1]));
						hovedPerson.setFoedeSted(subLine[2]);
						rb.setHovedPerson(hovedPerson);
						continue;
					}

					// TODO Skelner ikke mellem ægtefællers stillinger
					// TODO Ægtefælles død står under fødselen som død 2-10-1922   
					if (line.startsWith("Stillinger:")) {
						final String[] subLine = line.split(": ");
						if (hovedPerson == null) {
							throw new PolRegException(
									"Hovedperson ikke initialiseret før stillinger");
						}
						hovedPerson.setStillinger(subLine[1]);
						continue;
					}

					if (line.equals("Ægtefælle")) {
						denneAegteFaelle = new Person();
						denneAegteFaelle.setId(individCounter++);

						line = reader.readLine();

						final String[] subLine = line.split(" , ");
						String navn = subLine[0];

						if (navn.contains(" (født")) {
							navn = subLine[0].replace(" (født", "");
							navn = navn.replace(")", "");
						}

						denneAegteFaelle.setNavn(navn);

						if (koen == Koen.M) {
							denneAegteFaelle.setKoen(Koen.F);
						} else {
							denneAegteFaelle.setKoen(Koen.M);
						}

						if (subLine.length > 1) {
							denneAegteFaelle
									.setFoedeDato(convertDate(subLine[1]));
						}

						if (subLine.length > 2) {
							denneAegteFaelle.setFoedeSted(subLine[2]);
						}

						if (subLine.length > 3) {
							if (subLine[3].startsWith("død ")) {
								String dato = subLine[3].substring(3).trim();

								if (dato.endsWith("Ret")) {
									dato = dato.substring(0, dato.length() - 3)
											.trim();
								}

								denneAegteFaelle
										.setDoedsDato(convertDate(dato));
							}
						}

						aegteFaeller.add(denneAegteFaelle);
						rb.setAegteFaeller(aegteFaeller);
						continue;
					}

					if (line.equals("Barn")) {
						detteBarn = new Person();
						detteBarn.setId(individCounter++);

						line = reader.readLine();

						final String[] subLine = line.split(" , ");
						detteBarn.setNavn(subLine[0]);

						// Prøv at finde køn i properties
						final Koen k = kf.find(subLine[0]);

						// Hvis det findes, indsættes det
						if (k != null) {
							detteBarn.setKoen(k);
						} else {
							// Ellers vises en modal dialog til at vælge det
							fn = new Fornavn(subLine[0], "?");
							final KoenDialog kd = new KoenDialog(frame, this);
							kd.setVisible(true);

							detteBarn.setKoen(fn.getKoen());
						}

						detteBarn.setFoedeDato(convertDate(subLine[1]));
						boern.add(detteBarn);
						rb.setBoern(boern);
						continue;
					}

					if (line.equals("Adresser")) {
						line = reader.readLine();

						while ((line != null) && (line.length() > 0)) {
							if ((line.length() > 0)
									&& (!line.startsWith("Husk at læse"))) {
								Adresse adr = new Adresse();

								final String[] subLine = line.split(": ");
								adr.setDate(convertDate(subLine[0]));

								final String[] subLine1 = subLine[1]
										.split(" , ");
								adr.setPlace(subLine1[0]);

								if (subLine1[0].startsWith("Frameldt til ")) {
									adr.setPlace(subLine1[0].substring(13));
									adresser.add(adr);
								} else {
									if (subLine1[0].startsWith("Fra ")) {
										final String[] subLine2 = subLine1[0]
												.split(" til ");
										adr.setPlace(subLine2[1]);
										adresser.add(adr);

										adr = new Adresse();
										adr.setDate("Bef "
												+ convertDate(subLine[0]));
										adr.setPlace(subLine2[0].substring(4));
									}
									if (!subLine1[0].startsWith("Frameldt")) {

										adresser.add(adr);
									}
								}
								line = reader.readLine();
							}
						}

						rb.setAdresser(adresser);
						continue;
					}
				}
			}

			// Håndter familiebånd, hvis vi ved, at der er en familie

			if ((aegteFaeller.size() > 0) || (boern.size() > 0)) {
				Familie f = new Familie();
				f.setId(familieCounter++);

				// Behandl hovedperson

				if (hovedPerson == null) {
					throw new PolRegException(
							"Hovedperson ikke initialiseret før familier");
				}
				hovedPerson.getFamilieListe().add("FAMS @F" + f.getId() + "@");
				if (koen == Koen.M) {
					f.setHusband(hovedPerson);
				} else {
					f.setWife(hovedPerson);
				}

				familier.addElement(f);

				// Behandl ægtefæller

				Iterator<Person> iter = aegteFaeller.iterator();

				while (iter.hasNext()) {
					denneAegteFaelle = iter.next();

					// Første ægtefælle
					if (denneAegteFaelle.getId() == (hovedPerson.getId() + 1)) {
						if (koen == Koen.M) {
							familier.get(0).setWife(denneAegteFaelle);
						} else {
							familier.get(0).setHusband(denneAegteFaelle);
						}
						denneAegteFaelle.getFamilieListe().add(
								"FAMS @F" + f.getId() + "@");

					} else {
						// Yderligere ægtefæller
						f = new Familie();
						f.setId(familieCounter++);

						if (koen == Koen.M) {
							f.setHusband(hovedPerson);
							f.setWife(denneAegteFaelle);
						} else {
							f.setHusband(denneAegteFaelle);
							f.setWife(hovedPerson);
						}

						hovedPerson.getFamilieListe().add(
								"FAMS @F" + f.getId() + "@");
						denneAegteFaelle.getFamilieListe().add(
								"FAMS @F" + f.getId() + "@");
						familier.addElement(f);
					}
				}
				// Behandl børn

				iter = boern.iterator();

				while (iter.hasNext()) {
					detteBarn = iter.next();
					detteBarn.getFamilieListe().add(
							"FAMC @F" + foersteFamilieIdPaaBlad + "@");

					familier.get(0).getBoerneListe().add(detteBarn);
				}

				rb.setFamilier(familier);
			}

			// Tilføj det parsede blad til vektoren
			registerBlade.add(rb);
		} catch (final IOException excp) {
			throw new PolRegException(excp);
		}
	}

	/**
	 * @param adresser
	 *            the adresser to set
	 */
	public void setAdresser(final Vector<Adresse> adresser) {
		this.adresser = adresser;
	}

	/**
	 * @param aegteFaeller
	 *            the aegteFaeller to set
	 */
	public void setAegteFaeller(final Vector<Person> aegteFaeller) {
		this.aegteFaeller = aegteFaeller;
	}

	/**
	 * @param hovedPerson
	 *            the hovedPerson to set
	 */
	/*
	 * public void setHovedPerson(Person hovedPerson) { this.hovedPerson =
	 * hovedPerson; }
	 */

	/**
	 * @param boern
	 *            the boern to set
	 */
	public void setBoern(final Vector<Person> boern) {
		this.boern = boern;
	}

	/**
	 * @param familier
	 *            the familier to set
	 */
	public void setFamilier(final Vector<Familie> familier) {
		this.familier = familier;
	}

	/**
	 * @param inputText
	 *            the inputText to set
	 */
	public void setInputText(final String inputText) {
		this.inputText = inputText;
	}

	/**
	 * @param registerBlade
	 *            the registerBlade to set
	 */
	public void setRegisterBlade(final Vector<RegisterBlad> registerBlade) {
		this.registerBlade = registerBlade;
	}

	/**
	 * Udskriv alle personer og adresser som GEDCOM-fil
	 * 
	 * @param gedcomFile
	 * @param version
	 * @param fileName
	 * @throws PolRegException
	 */
	public void udskriv(final File gedcomFile, final String version)
			throws PolRegException {
		OutputStreamWriter fw = null;
		try {
			// Kræver AnselCharset-1.0.jar på classpath
			fw = new OutputStreamWriter(new FileOutputStream(gedcomFile),
					"ANSEL");

			writeHeader(fw, version);

			Iterator<RegisterBlad> iter = registerBlade.iterator();

			while (iter.hasNext()) {
				iter.next().udskrivIndivider(fw);
			}

			iter = registerBlade.iterator();

			while (iter.hasNext()) {
				iter.next().udskrivFamilier(fw);
			}

			writeTrailer(fw);
			fw.close();
		} catch (final IOException e) {
			throw new PolRegException(e);
		}
	}

	/**
	 * @param fw
	 * @param version
	 * @throws IOException
	 */
	private void writeHeader(final OutputStreamWriter fw, final String version)
			throws IOException {
		fw.write("0 HEAD\n");
		fw.write("1 SOUR PolReg2Ged\n");
		fw.write("2 VERS v " + version + "\n");
		fw.write("1 SUBM @SUB1@\n");
		fw.write("1 GEDC\n");
		fw.write("2 VERS 5.5\n");
		fw.write("2 FORM LINEAGE-LINKED\n");
		fw.write("1 DEST GED55\n");

		final Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		fw.write("1 DATE " + convertDate(sdf.format(cal.getTime())) + "\n");

		sdf = new SimpleDateFormat("hh:mm");
		fw.write("2 TIME " + sdf.format(cal.getTime()) + "\n");
		fw.write("1 CHAR ANSEL\n");
		fw.write("1 FILE "
				+ registerBlade.get(0).getHovedPerson().getTrimmedNavn()
				+ ".ged\n");
		fw.write("0 @SUB1@ SUBM\n");
		fw.write("1 NAME Københavns Stadsarkiv\n");
		fw.write("1 ADDR Københavns Rådhus 1599 Kbh. V\n");
	}

	/**
	 * @param fw
	 * @throws IOException
	 */
	private void writeTrailer(final OutputStreamWriter fw) throws IOException {
		// Source for places
		fw.write("0 @S1@ SOUR\n");
		fw.write("1 TITL Politiets registerblade. "
				+ "Data om Københavns beboere fra 1892 til 1923.\n");
		fw.write("1 AUTH Københavns Stadsarkiv\n");

		// Trailer
		fw.write("0 TRLR\n");
	}

	/**
	 * @return the fn
	 */
	public Fornavn getFn() {
		return fn;
	}

	/**
	 * @param fn
	 *            the fn to set
	 */
	public void setFn(final Fornavn fn) {
		this.fn = fn;
	}
}