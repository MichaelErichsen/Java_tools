package net.myerichsen.PolRegBlade;

/**
 * Denne klasse implementerer en særlig Ecxeption for denne applikation, der
 * propageres op til brugergrænsefladen og vises i tekstvinduet.
 * 
 * @author Michael Erichsen
 * @version 1.2 20/04/2011
 * 
 */
public class PolRegException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4985018208332114700L;

	/**
	 * 
	 */
	public PolRegException() {
	}

	/**
	 * @param message
	 */
	public PolRegException(final String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PolRegException(final Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PolRegException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
