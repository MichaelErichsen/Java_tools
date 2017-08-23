package net.myerichsen.PolRegBlade;

/**
 * Denne klasse implementerer en adresse, der rummes af en hovedperson
 * 
 * @author Michael Erichsen
 * @version 1.2.1 20. 11. 2011
 * 
 */
public class Adresse {

	/**
	 * Tag name
	 */
	private final static String tag = "RESI";

	/**
	 * 
	 */
	public Adresse() {
		super();
	}

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return tag;
	}

	/**
	 * Dato på adressen
	 */
	private String Date;

	/**
	 * Adressen
	 */
	private String Place;

	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}

	/**
	 * @return the place
	 */
	public String getPlace() {
		if (Place.endsWith("Ret")) {
			return Place.substring(0, Place.length() - 3).trim();
		}
		return Place;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(final String date) {
		Date = date;
	}

	/**
	 * @param place
	 *            the place to set
	 */
	public void setPlace(final String place) {
		Place = place;
	}

	/*
	 * Udskriv RESI, DATE og PLAC (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final Session aSession = Session.getSession();
		final StringBuffer sb = new StringBuffer();

		sb.append("1 " + getTag() + "\n");
		sb.append("2 DATE " + getDate() + "\n");
		sb.append("2 PLAC " + getPlace() + aSession.getKoebenhavn() + "\n");
		sb.append("2 SOUR @S1@\n");

		return sb.toString();
	}
}
