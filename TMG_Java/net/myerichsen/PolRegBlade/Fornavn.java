package net.myerichsen.PolRegBlade;

/**
 * @author Michael Erichsen
 * @version 1.3.0 11/05/2011
 * 
 * Denne klasse indkapsler et fornavn og det tilhørende køn.
 * 
 */
public class Fornavn {
	String navn = null;;

	Koen koen = Koen.BARN;

	/**
	 * @param navn
	 * @param sKoen
	 */
	public Fornavn(final String navn, final String sKoen) {
		this.navn = navn;
		this.koen = streng2Koen(sKoen);
	}
	
	/**
	 * @param navn
	 * @param kKoen
	 */
	public Fornavn(final String navn, final Koen kKoen) {
		this.navn = navn;
		this.koen = kKoen;
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
	 * @param sKoen
	 * @return Koen
	 */
	private Koen streng2Koen(final String sKoen) {
		if (sKoen == "M") {
			return Koen.M;
		} else if (sKoen == "F") {
			return Koen.F;
		} else {
			return Koen.BARN;
		}
	}
}
