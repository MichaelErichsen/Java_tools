package net.myerichsen.PolRegBlade;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * @author Michael Erichsen
 * @version 1.3.0 11/05/2011
 * 
 * Singleton klasse, der indkapsler en vektor med fornavne og tilhørende køn.
 * Indlæses fra properties fil ved start af programmet. Ved indlæsning af
 * forældre opdateres automatisk. Ved indlæsning af børn søges kønnet hentet fra
 * denne vektor. Hvis det ikke findes, spørges brugeren om køn, der gemmes i
 * vektoren. Ved afslutning af programmet gemmes vektoren i properties filen.
 * 
 */
public class KendteFornavne {
	Vector<Fornavn> liste = new Vector<Fornavn>();

	Properties props = null;

	/**
	 * A handle to the unique Singleton instance.
	 */
	static private KendteFornavne _instance = null;

	/**
	 * @return The unique instance of this class.
	 */
	static public KendteFornavne getListe() {
		if (null == _instance) {
			_instance = new KendteFornavne();
		}
		return _instance;
	}

	/**
	 * Tilføj et navn-køn par til vektor og properties
	 * 
	 * @param fornavn
	 */
	public void add(final Fornavn fornavn) {
		liste.addElement(fornavn);

		final String[] fornavne = fornavn.getNavn().split(" ");
		props.setProperty("fornavn." + fornavne[0], koen2streng(fornavn
				.getKoen()));
	}

	/**
	 * Find et navns køn
	 * 
	 * @param navn
	 * @return Koen
	 */
	public Koen find(final String navn) {
		Koen koen = null;

		final String[] fornavne = navn.split(" ");
		final String key = "fornavn." + fornavne[0];

		if (props.getProperty(key) != null) {
			koen = streng2Koen(props.getProperty(key));
		}

		return koen;
	}

	/**
	 * Initialiser vektor og load den fra properties fil.
	 * 
	 * @param theProps
	 */
	public void initialiser(final Properties theProps) {
		this.props = theProps;
		String key = null;
		String[] fornavne = null;

		for (final Enumeration en = props.propertyNames(); en.hasMoreElements();) {
			key = (String) en.nextElement();

			if (key.startsWith("fornavn.")) {
				fornavne = key.substring(8).split(" ");
				liste.addElement(new Fornavn(fornavne[0], props
						.getProperty(key)));
			}
		}
	}

	/**
	 * @param sKoen
	 * @return Koen
	 */
	private String koen2streng(final Koen koen) {
		if (koen == Koen.M) {

			return "M";
		} else if (koen == Koen.F) {
			return "F";
		} else {
			return "?";
		}
	}

	/**
	 * @param sKoen
	 * @return Koen
	 */
	private Koen streng2Koen(final String sKoen) {
		if (sKoen.equals("M")) {
			return Koen.M;
		} else if (sKoen.equals("F")) {
			return Koen.F;
		} else {
			return Koen.BARN;
		}
	}
}