package net.myerichsen.PolRegBlade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * Denne klasse er en singleton klasse til at rumme indstillinger
 * 
 * @author Michael Erichsen
 * @version 1.2 20/04/2011
 * 
 */

public class Session {
	/**
	 * A handle to the unique Singleton instance.
	 */
	static private Session _instance = null;

	/**
	 * @return The unique instance of this class.
	 */
	static public Session getSession() {
		if (null == _instance) {
			_instance = new Session();
		}
		return _instance;
	}

	private String gcDirectory;

	private boolean append;

	private String koebenhavn;

	private Properties props = new Properties();

	/**
	 * No-arg constructor
	 */
	protected Session() {
		try {
			props.load(new FileInputStream("PolReg2Ged.properties"));
		} catch (final FileNotFoundException e) {
			props = new Properties();
		} catch (final IOException e) {
			props = new Properties();
		}
	}

	/**
	 * Gem data i properties fil
	 */
	public void gemIProperties() {
		props.setProperty("gcdirectory", gcDirectory);

		String appendString = "true";

		if (append == false) {
			appendString = "false";
		}

		props.setProperty("append", appendString);

		props.setProperty("koebenhavn", koebenhavn);

		try {
			props.store(new FileOutputStream("PolReg2Ged.properties"),
					"PolReg2Ged properties file");
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the gcDirectory
	 */
	public String getGcDirectory() {
		return gcDirectory;
	}

	/**
	 * @return the koebenhavn
	 */
	public String getKoebenhavn() {
		return koebenhavn;
	}

	/**
	 * Hent data fra properties fil
	 */
	public void hentFraProperties() {
		gcDirectory = props.getProperty("gcdirectory", "c:\\\\data\\");

		final String appendString = props.getProperty("append", "false");

		if (appendString.equals("true")) {
			append = true;
		} else {
			append = false;
		}

		koebenhavn = props.getProperty("koebenhavn", ",,,København,");
	}

	/**
	 * @return the append
	 */
	public boolean isAppend() {
		return append;
	}

	/**
	 * @param append
	 *            the append to set
	 */
	public void setAppend(final boolean append) {
		this.append = append;
	}

	/**
	 * @param gcDirectory
	 *            the gcDirectory to set
	 */
	public void setGcDirectory(final String gcDirectory) {
		this.gcDirectory = gcDirectory;
	}

	/**
	 * @param koebenhavn
	 *            the koebenhavn to set
	 */
	public void setKoebenhavn(final String koebenhavn) {
		this.koebenhavn = koebenhavn;
	}
}
