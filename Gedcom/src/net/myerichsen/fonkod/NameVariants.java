package net.myerichsen.fonkod;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Michael Erichsen
 * @version 1.0
 * 
 * Class representing a combination of names and their encoded representation.
 * 
 */
public class NameVariants {
	Vector<String> variants = new Vector<String>();
	String encodedName;

	/**
	 * @param encodedName
	 */
	public NameVariants(String encodedName) {
		super();
		this.encodedName = encodedName;
	}

	public String addVariant(String nameVariant) {
		for (Iterator<String> iterator = variants.iterator(); iterator
		.hasNext();) {
			if (iterator.next().trim().equalsIgnoreCase(nameVariant))
				return this.toString();
		}
		variants.addElement(nameVariant);
		return this.toString();
	}

	/**
	 * @param name
	 * @return
	 */
	public String getCodeForName(String name) {
		for (Iterator<String> iterator = variants.iterator(); iterator
		.hasNext();) {
			if (iterator.next().trim().equalsIgnoreCase(name))
				return getEncodedName();
		}
		return "";
	}

	/**
	 * @return the encodedName
	 */
	public String getEncodedName() {
		return encodedName;
	}

	/**
	 * @return the variants
	 */
	public Vector<String> getVariants() {
		return variants;
	}

	/**
	 * @param encodedName
	 *            the encodedName to set
	 */
	public void setEncodedName(String encodedName) {
		this.encodedName = encodedName;
	}

	/**
	 * @param variants
	 *            the variants to set
	 */
	public void setVariants(Vector<String> variants) {
		this.variants = variants;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(getEncodedName());
		for (Iterator<String> iterator = variants.iterator(); iterator
		.hasNext();) {
			sb.append(" " + iterator.next());
		}
		return sb.toString();
	}

}
