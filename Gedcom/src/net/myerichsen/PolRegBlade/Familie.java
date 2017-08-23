package net.myerichsen.PolRegBlade;

import java.lang.String;
import net.myerichsen.PolRegBlade.Person;

import java.util.Iterator;
import java.util.Vector;

/**
 * Denne klasse implementerer en familie, der kan rumme hovedperson, ægtefælle
 * og børn
 * 
 * @author Michael Erichsen
 * @version 1.2 20/04/2011
 * 
 */
public class Familie {

	/**
	 * "FAM" tag
	 */
	private final static String tag = "FAM";

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return tag;
	}

	/**
	 * Ægtemand HUSB
	 */
	private Person husband;

	/**
	 * Hustru WIFE
	 */
	private Person wife;

	/**
	 * Liste over børn CHIL
	 * 
	 * @uml.annotations for <code>boerneListe</code>
	 *                  collection_type="net.myerichsen.PolRegBlade.Person"
	 */
	private Vector<Person> boerneListe = new Vector<Person>();

	/**
	 * Familie id
	 */
	private int id;

	/**
	 * @return the boerneListe
	 */
	public Vector<Person> getBoerneListe() {
		return boerneListe;
	}

	/**
	 * @return the husband
	 */
	public Person getHusband() {
		return husband;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the wife
	 */
	public Person getWife() {
		return wife;
	}

	/**
	 * @param boerneListe
	 *            the boerneListe to set
	 */
	public void setBoerneListe(final Vector<Person> boerneListe) {
		this.boerneListe = boerneListe;
	}

	/**
	 * @param husband
	 *            the husband to set
	 */
	public void setHusband(final Person husband) {
		this.husband = husband;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * @param wife
	 *            the wife to set
	 */
	public void setWife(final Person wife) {
		this.wife = wife;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();

		sb.append("0 @F" + getId() + "@ " + getTag() + "\n");

		if (getHusband() != null) {
			sb.append("1 HUSB @I" + getHusband().getId() + "@\n");
		}

		if (getWife() != null) {
			sb.append("1 WIFE @I" + getWife().getId() + "@\n");
		}

		final Iterator<Person> iter = boerneListe.iterator();

		while (iter.hasNext()) {
			sb.append("1 CHIL @I" + iter.next().getId() + "@\n");
		}

		if ((getHusband() != null) && (getWife() != null)) {
			sb.append("1 MARR\n");
		}
		return sb.toString();
	}
}