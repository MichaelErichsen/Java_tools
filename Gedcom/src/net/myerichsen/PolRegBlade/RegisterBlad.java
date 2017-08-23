package net.myerichsen.PolRegBlade;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Vector;

/**
 * Denne klasse implementerer et screen-scrapet, digitaliseret registerblad
 * 
 * @author Michael Erichsen
 * @version 1.2.2 24/04/2011
 * 
 */
public class RegisterBlad {

	/**
	 * Hovedperson
	 */
	private Person hovedPerson;

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
	 * Inputstrengen fra clipboard
	 */
	private String inputText;

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
	public Person getHovedPerson() {
		return hovedPerson;
	}

	/**
	 * @return the inputText
	 */
	public String getInputText() {
		return inputText;
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
	 * @param hovedPerson
	 *            the hovedPerson to set
	 */
	public void setHovedPerson(final Person hovedPerson) {
		this.hovedPerson = hovedPerson;
	}

	/**
	 * @param inputText
	 *            the inputText to set
	 */
	public void setInputText(final String inputText) {
		this.inputText = inputText;
	}

	/**
	 * Udskriv alle pfamilier som GEDCOM-fil
	 * 
	 * @param fw
	 * 
	 * @param gedcomFile
	 * @param fileName
	 * @throws PolRegException
	 */
	public void udskrivFamilier(final OutputStreamWriter fw)
			throws PolRegException {
		Iterator<Familie> iter = null;

		try {
			if (getFamilier() != null) {
				iter = getFamilier().iterator();

				while (iter.hasNext()) {
					fw.write(iter.next().toString());
				}
			}
		} catch (final IOException e) {
			throw new PolRegException(e);
		}
	}

	/**
	 * Udskriv alle personer og adresser som GEDCOM-fil
	 * 
	 * @param fw
	 * @param hovedPerson
	 * @throws PolRegException
	 */
	public void udskrivIndivider(final OutputStreamWriter fw)
			throws PolRegException {
		Iterator<Person> iter = null;

		try {
			fw.write(hovedPerson.toString());

			if (getAdresser() != null) {
				final Iterator<Adresse> itr2 = getAdresser().iterator();
				while (itr2.hasNext()) {
					fw.write(itr2.next().toString());
				}
			}

			if (getAegteFaeller() != null) {
				iter = getAegteFaeller().iterator();
				while (iter.hasNext()) {
					fw.write(iter.next().toString());
				}
			}

			if (getBoern() != null) {
				iter = getBoern().iterator();
				while (iter.hasNext()) {
					fw.write(iter.next().toString());
				}
			}
		} catch (final IOException e) {
			throw new PolRegException(e);
		}
	}
}