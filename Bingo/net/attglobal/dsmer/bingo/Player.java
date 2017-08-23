package net.attglobal.dsmer.bingo;

/**
 * A player owns three boards.
 * Two are RandomBoards, and one is a FixedBoard
 * <p>Creation date: (24-04-00 21.47.50)
 * <p>Updated (29-04-00 20.22.35)
 * <p>Updated (10-05-00 16:30:16)
 * @author Michael Erichsen
 */
public class Player {
	/** 
	 * Boards
	 */
	private Board theBoards[];
	/** 
	 * The number bag
	 */
	private NumberBag theNumberBag;
	/**
	 * Print writer
	 */
	private java.io.PrintWriter pw;
	/**
	 * Header text on player's plate
	 */
	private java.lang.String headerText;
/**
 * One arg constructor.
 * Creation date: (24-04-00 22.01.34)
 * @param aNumberBag net.attglobal.dsmer.bingo.NumberBag
 */
public Player(NumberBag aNumberBag, java.io.PrintWriter aPw, String aHeaderText) {
	super();
	theNumberBag = aNumberBag;
	pw = aPw;
	headerText = new String(aHeaderText);
	init();
}
/**
 * Initialize the class.
 * Creation date: (24-04-00 21.49.19)
 */
private void init() {
//	int n[] = new int[3];

	// Print a header for each player
	pw.write("<font face=\"Arioso-Normal\"><font size=+3>");
	pw.write(headerText);
	pw.write("<br><br></font></font><br>\n");

	// Initialize the boards
	theBoards = new Board[3];
	int fixed = (int) (Math.random() * 3);
	switch (fixed) {
		case 0 :
			theBoards[0] = new FixedBoard(theNumberBag, pw);
			theBoards[1] = new RandomBoard(theNumberBag, pw);
			theBoards[2] = new RandomBoard(theNumberBag, pw);
			break;
		case 1 :
			theBoards[0] = new RandomBoard(theNumberBag, pw);
			theBoards[1] = new FixedBoard(theNumberBag, pw);
			theBoards[2] = new RandomBoard(theNumberBag, pw);
			break;
		case 2 :
			theBoards[0] = new RandomBoard(theNumberBag, pw);
			theBoards[1] = new RandomBoard(theNumberBag, pw);
			theBoards[2] = new FixedBoard(theNumberBag, pw);
			break;
		default :
			System.err.println("Switch error, case " + fixed);
			break;
	} // switch fixed
}
}
