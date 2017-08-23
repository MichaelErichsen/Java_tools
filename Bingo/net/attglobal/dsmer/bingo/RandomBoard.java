package net.attglobal.dsmer.bingo;

/**
 * A board consisting of all numbers (except 25).
 * <p>Creation date: (24-04-00 15.38.48)
 * <p>Updated (29-04-00 20.11.45)
 * @author Michael Erichsen
 */
public class RandomBoard extends Board {
	private NumberBag theNumberBag;
/**
 * RandomBoard constructor.
 */
public RandomBoard(NumberBag aNb, java.io.PrintWriter aPw) {
	super();
	theNumberBag = aNb;
	pw = aPw;
	init();
}
/**
 * Initialize the class.
 * <p>Creation date: (24-04-00 16.56.00)
 */
private void init() {
	boolean found = false;
	int i = 0;
	int j = 0;
	int count = 0;

	// Find a valid board
	while (found == false) {
		theNumbers = Util.fill(15, 90);
		found = testColumns();

		// Test that it is not a proper subset of numberBag
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 40; j++) {
				if (theNumbers[i] == theNumberBag.getTheNumbers(j))
					count++;
			} // for j
		} // for i

		if (count == 15)
			continue;
	} // while not found


	// Sort, populate, distribute, and print the board
	theNumbers = Util.sort(theNumbers);
	populateFields();
	distribute();
	printBoard();
}
}
