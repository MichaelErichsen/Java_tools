package net.myerichsen.PolRegBlade;

import java.io.File;
import javax.swing.filechooser.*;

/**
 * Denne klasse implementerer et file filter for .ged filer
 * 
 * @author Michael Erichsen
 * @version 1.2, 20/04/2011
 */
public class GedFileFilter extends FileFilter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.FileFilter#accept(java.io.File)
	 */
	@Override
	public boolean accept(final File pathname) {
		if (pathname.isDirectory()) {
			return true;
		}

		final String name = pathname.getName().toLowerCase();
		return name.endsWith("ged");
	}

	// The description of this filter
	@Override
	public String getDescription() {
		return "GEDCOM filer";
	}

}
