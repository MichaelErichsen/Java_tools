package net.attglobal.dsmer.bingo;

/**
 * Main class for bingo application.
 * <p>Creation date: (24-04-00 21.58.06)
 * <p>Updated (25-04-00 21.49.10)
 * <p>Updated (10-05-00 16:29:42)
 * @author Michael Erichsen
 */
public class Bingo {
	/** 
	 * Array of players
	 */
	private net.attglobal.dsmer.bingo.Player[] fieldThePlayers = null;
	/**
	 * The number bag
	 */
	private NumberBag fieldTheNumberBag = null;
	/** 
	 * Header text on each player page
	 */
//	private java.lang.String headerText;
	/** 
	 * Header text on each player page
	 */
	private java.lang.String fieldHeaderText;
/**
 * Bingo constructor.
 */
public Bingo() {
	super();
}
/**
 * Gets the theNumberBag property (net.attglobal.dsmer.bingo.NumberBag) value.
 * @return The theNumberBag property value.
 * @see #setTheNumberBag
 */
public NumberBag getTheNumberBag() {
	return fieldTheNumberBag;
}
/**
 * Gets the thePlayers property (net.attglobal.dsmer.bingo.Player[]) value.
 * @return The thePlayers property value.
 * @see #setThePlayers
 */
public net.attglobal.dsmer.bingo.Player[] getThePlayers() {
	return fieldThePlayers;
}
/**
 * Gets the thePlayers index property (net.attglobal.dsmer.bingo.Player) value.
 * @return The thePlayers property value.
 * @param index The index value into the property array.
 * @see #setThePlayers
 */
public Player getThePlayers(int index) {
	return getThePlayers()[index];
}
/**
 * Initializes the class.
 * Creation date: (24-04-00 21.58.42)
 */
private void init() {
//	String fileName;
	System.out.println("Bingo generator by Dan, Mariane & Michael Erichsen, May 2000\n");
	System.out.println("Generated for " + fieldThePlayers.length + " players");
	System.out.println("Header text: " + fieldHeaderText + "\n");
	try {
		fieldTheNumberBag = new NumberBag();
		java.io.PrintWriter pw = null;

		// Handle each player
		for (int i = 0; i < fieldThePlayers.length; i++) {
			pw = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("Bingo" + (i + 1) + ".htm")));

			// HTML Header
			pw.write("<html>\n<head>\n<title>Bingo Plade nr. " + (i + 1) + "</title>\n</head>\n<body>\n");
			pw.write("<br><br>&nbsp;");

			// Three boards of each player
			fieldThePlayers[i] = new Player(fieldTheNumberBag, pw, fieldHeaderText);

			// HTML Footer
			pw.write("</body>\n</html>\n");
			pw.close();
		} // for i

		System.out.println("\nDone");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
/**
 * Starts the application.
 * @param args an array of command-line arguments
 */
public static void main(java.lang.String[] args) {
	if (args.length != 2) {
		System.err.println("Usage: java net.attglobal.dsmer.bingo.Bingo <numberOfPlayers> <\"Header text in quotes\">");
		System.exit(8);
	}
	Bingo b = new Bingo();
	int numberOfPlayers = 1;
	try {
		numberOfPlayers = Integer.parseInt(args[0]);
	} catch (Exception e) {
		System.err.println("Usage: java net.attglobal.dsmer.bingo.Bingo <numberOfPlayers> <\"Header text in quotes\">");
		System.exit(8);
	}
	b.fieldThePlayers = new Player[numberOfPlayers];
	b.fieldHeaderText = new String(args[1]);
	b.init();
}
/**
 * Sets the theNumberBag property (net.attglobal.dsmer.bingo.NumberBag) value.
 * @param theNumberBag The new value for the property.
 * @see #getTheNumberBag
 */
public void setTheNumberBag(NumberBag theNumberBag) {
	fieldTheNumberBag = theNumberBag;
}
/**
 * Sets the thePlayers property (net.attglobal.dsmer.bingo.Player[]) value.
 * @param thePlayers The new value for the property.
 * @see #getThePlayers
 */
public void setThePlayers(net.attglobal.dsmer.bingo.Player[] thePlayers) {
	fieldThePlayers = thePlayers;
}
/**
 * Sets the thePlayers index property (net.attglobal.dsmer.bingo.Player[]) value.
 * @param index The index value into the property array.
 * @param thePlayers The new value for the property.
 * @see #getThePlayers
 */
public void setThePlayers(int index, Player thePlayers) {
	fieldThePlayers[index] = thePlayers;
}
}
