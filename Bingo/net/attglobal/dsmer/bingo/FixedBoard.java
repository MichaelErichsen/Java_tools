package net.attglobal.dsmer.bingo;

/**
 * A board consisting of all numbers (except 25).
 * <p>Creation date: (24-04-00 21.35.26)
 * <p>Updated (25-04-00 22.30.24)
 * @author Michael Erichsen
 */
public class FixedBoard extends Board {
	/** 
	 * The number bag
	 */
	private NumberBag theNumberBag;
/**
 * One arg constructor.
 * Creation date: (24-04-00 22.06.22)
 * @param aNumberBag net.attglobal.dsmer.bingo.NumberBag
 */
public FixedBoard(NumberBag aNumberBag, java.io.PrintWriter aPw) {
	super();
	theNumberBag = aNumberBag;
	pw = aPw;
	init();
}
/**
 * Initialize the class.
 * <p>Creation date: (24-04-00 21.36.19)
 */
private void init() {
	boolean found = false;

	// Find a valid board
	while (found == false) {
		theNumbers = theNumberBag.getBoard();
		found = testColumns();
		if (found == false)
			continue;
		found = testEx25();
	} // while not found

	theNumbers = Util.sort(theNumbers);
	populateFields();
	distribute();
	printBoard();
}
/**
 * Test for existence of number 25.
 * <p>Creation date: (25-04-00 22.52.54)
 * @return boolean
 */
protected boolean testEx25() {
	boolean found = false;
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < theNumbers.length; i++) {
		sb.append(String.valueOf(theNumbers[i] + ", "));
		if (theNumbers[i] == 25) {
			found = true;
			break;
		} // for i
	}
	if (found == false) {
		System.out.println("25 is not on this board: " + sb);
		return false;
	}
	return true;
}
}
