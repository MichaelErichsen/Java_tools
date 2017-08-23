package net.myerichsen.fonkod;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Michael Erichsen
 * @version 1.0
 *
 * Hard coded name lists
 * 
 */
public class NameTable {
	Vector<NameVariants> nvv = new Vector<NameVariants>();

	/**
	 * 
	 */
	public NameTable() {
		super();
		initialize();
	}

	/**
	 * @return the nvv
	 */
	public Vector<NameVariants> getNvv() {
		return nvv;
	}

	public String getTableCode(String name) {
		NameVariants currentNv;
		String encodedName = "";

		for (Iterator<NameVariants> iterator = nvv.iterator(); iterator
				.hasNext();) {
			currentNv = iterator.next();

			encodedName = currentNv.getCodeForName(name);
			if (encodedName.length() > 0)
				return encodedName;
		}
		return encodedName;
	}

	private void initialize() {
		NameVariants nv;

		nv = new NameVariants("vilo	");
		nv.addVariant("Villaume");
		nv.addVariant("Vuillaume");
		nv.addVariant("Willaume");
		nvv.add(nv);

		nv = new NameVariants("vøli");
		nv.addVariant("Vøldike");
		nv.addVariant("von Wøldike");
		nv.addVariant("Woeldike");
		nv.addVariant("Woldike");
		nv.addVariant("Wöldike");
		nv.addVariant("Wøldike");
		nvv.add(nv);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Iterator<NameVariants> iterator = nvv.iterator(); iterator
				.hasNext();)
			sb.append(iterator.next().toString() + "\n");

		return super.toString();
	}

}
