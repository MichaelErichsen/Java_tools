package net.myerichsen.PolRegBlade;

import java.util.Iterator;
import java.util.Vector;
import java.lang.String;

/**
 * Denne klasse implementerer en person, som kan være en hovedperson, en
 * ægtefælle eller et barn
 * 
 * @author Michael Erichsen
 * @version 1.2 20/04/2011
 */
public class Person {
	/**
	 * "INDI" tag
	 */
	private final static String tag = "INDI";

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return tag;
	}

	/**
	 * Fødselsdato 8-11-1882
	 */
	private String foedeDato;

	/**
	 * Fødested København
	 */
	private String foedeSted;

	/**
	 * Navn Villiam Henry Erichsen
	 */
	private String navn;

	/**
	 * Liste over familer, personen indgår i
	 */
	private Vector<String> familieListe = new Vector<String>();

	/**
	 * Individ nummer
	 */
	private int id;

	/**
	 * Køn, M eller F
	 */
	private Koen koen;

	/**
	 * Stillinger
	 */
	private java.lang.String stillinger;

	/**
	 * Dødsdato
	 */
	private String doedsDato;

	/**
	 * @return the doedsDato
	 */
	public String getDoedsDato() {
		return doedsDato;
	}

	/**
	 * @return the familieListe
	 */
	public Vector<String> getFamilieListe() {
		return familieListe;
	}

	/**
	 * @return the foedeDato
	 */
	public String getFoedeDato() {
		if (foedeDato.endsWith("Ret")) {
			return foedeDato.substring(0, foedeDato.length() - 3).trim();
		}
		return foedeDato;
	}

	/**
	 * @return the foedeSted
	 */
	public String getFoedeSted() {
		if ((foedeSted != null) && (foedeSted.endsWith("Ret"))) {
			return foedeSted.substring(0, foedeSted.length() - 3).trim();
		}
		return foedeSted;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the koen
	 */
	public Koen getKoen() {
		return koen;
	}

	/**
	 * @return the navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * @return the navn
	 */
	public String getSlashedNavn() {
		final StringBuffer nytNavn = new StringBuffer();
		final String[] delNavne = navn.split(" ");
		for (int i = 0; i < delNavne.length; i++) {
			if (i < delNavne.length - 1) {
				nytNavn.append(delNavne[i] + " ");
			} else {
				nytNavn.append("/" + delNavne[i] + "/");
			}
		}
		return nytNavn.toString();
	}

	/**
	 * @return the stillinger
	 */
	public java.lang.String getStillinger() {
		return stillinger;
	}

	/**
	 * @return the navn
	 */
	public String getTrimmedNavn() {
		final StringBuffer nytNavn = new StringBuffer();
		final String[] delNavne = navn.split(" ");
		for (String element : delNavne) {
			nytNavn.append(element);
		}
		return nytNavn.toString().trim();
	}

	/**
	 * @param doedsDato
	 *            the doedsDato to set
	 */
	public void setDoedsDato(final String doedsDato) {
		this.doedsDato = doedsDato;
	}

	/**
	 * @param familieListe
	 *            the familieListe to set
	 */
	public void setFamilieListe(final Vector<String> familieListe) {
		this.familieListe = familieListe;
	}

	/**
	 * @param foedeDato
	 *            the foedeDato to set
	 */
	public void setFoedeDato(final String foedeDato) {
		this.foedeDato = foedeDato;
	}

	/**
	 * @param foedeSted
	 *            the foedeSted to set
	 */
	public void setFoedeSted(final String foedeSted) {
		this.foedeSted = foedeSted;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param koen
	 *            the koen to set
	 */
	public void setKoen(final Koen koen) {
		this.koen = koen;
	}

	/**
	 * @param navn
	 *            the navn to set
	 */
	public void setNavn(final String navn) {
		this.navn = navn;
	}

	/**
	 * @param stillinger
	 *            the stillinger to set
	 */
	public void setStillinger(final java.lang.String stillinger) {
		this.stillinger = stillinger;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();

		sb.append("0 @I" + getId() + "@ " + getTag() + "\n");
		sb.append("1 NAME " + getSlashedNavn() + "\n");
		if (getKoen() == Koen.M) {
			sb.append("1 SEX M\n");
		} else if (getKoen() == Koen.F) {
			sb.append("1 SEX F\n");
		}

		sb.append("1 BIRT\n");
		sb.append("2 DATE " + getFoedeDato() + "\n");
		if (getFoedeSted() != null) {
			sb.append("2 PLAC " + getFoedeSted() + "\n");
		}

		if (getDoedsDato() != null) {
			sb.append("1 DEAT\n");
			sb.append("2 DATE " + getDoedsDato() + "\n");

		}

		if (getStillinger() != null) {
			sb.append("1 OCCU " + getStillinger() + "\n");
		}

		final Iterator<String> itr = getFamilieListe().iterator();

		while (itr.hasNext()) {
			sb.append("1 " + itr.next() + "\n");
		}

		return sb.toString();
	}
}