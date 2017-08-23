package net.attglobal.dsmer.bingo;

/**
 * A bag of 40 numbers between 1 and 90, including 1, 25, and 90.
 * <p>Creation date: (24-04-00 11.45.40)
 * <p>Updated (29-04-00 19.57.01)
 * <p>Updated (10-05-00 22.56.32)
 * @author Michael Erichsen
 */
public class NumberBag {
	/**
	 * The 40 numbers to be drawn
	 */
	private int[] fieldTheNumbers = null;
	/**
	 * Four pre-selected numbers to be drawn near the end.
	 */
	private int[] innerBag = {0, 0, 0, 0};
/**
 * NumberBag constructor.
 */
public NumberBag() {
	super();
	init();
}
/**
 * Returns numbers for a Board.
 * <p>Creation date: (24-04-00 21.26.41)
 * @return int[]
 */
public int[] getBoard() {
	int boardNumbers[] = new int[15];
	int index = 0;

	// Insert 25 always
	boardNumbers[0] = 25;

	// Insert one number from the inner bag
	boardNumbers[1] = innerBag[ (int) (Math.random() * 4)];

	// Find 13 unique numbers in bag
	for (int i = 2; i < boardNumbers.length; i++) {
		while (true) {
			index = (int) (Math.random() * 40);
			boardNumbers[i] = fieldTheNumbers[index];
			if (Util.isUnique(i, boardNumbers[i], boardNumbers) == true)
				break;
		} // while true
	} // for i

	return boardNumbers;
}
/**
 * Gets the theNumbers property (int[]) value.
 * @return The theNumbers property value.
 * @see #setTheNumbers
 */
public int[] getTheNumbers() {
	return fieldTheNumbers;
}
/**
 * Gets the theNumbers index property (int) value.
 * @return The theNumbers property value.
 * @param index The index value into the property array.
 * @see #setTheNumbers
 */
public int getTheNumbers(int index) {
	return getTheNumbers()[index];
}
/**
 * Initializes the number array.
 * Creation date: (24-04-00 11.48.43)
 */
private void init() {
	try {
		fieldTheNumbers = new int[40];
		int index = 0;
		int value = 0;
		java.io.PrintWriter pw = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("Bingo.txt")));

		// Mandatory numbers
		setTheNumbers(0, 1);
		setTheNumbers(1, 25);
		setTheNumbers(2, 90);

		// Add optional numbers
		setTheNumbers(Util.fill(getTheNumbers().length, 3, 90, getTheNumbers()));

		// Populate the inner bag with four random numbers, but not 25
		for (int i = 0; i < 4; i++) {
			while (true) {
				index = (int) (Math.random() * 40);
				value = getTheNumbers(index);
				if (value == 25)
					continue;
				if (Util.isUnique(i, value, innerBag) == false)
					continue;
				innerBag[i] = value;
				break;
			} // while true
		} // for i

		// Sort inner bag, then display it
		innerBag = Util.sort(innerBag);
		String s = new String("The Inner Bag: " + innerBag[0] + ", " + innerBag[1] + ", " + innerBag[2] + ", " + innerBag[3]);
		System.out.println(s);
		pw.println(s);

		// Sort array
		setTheNumbers(Util.sort(getTheNumbers()));

		// Display result
		printTable(pw);
		pw.close();
	} catch (java.io.IOException ioe) {
	}
}
/**
 * Print numbers in tabular form.
 * Creation date: (24-04-00 12.59.34)
 */
public void printTable(java.io.PrintWriter pw) {
	System.out.println("\nThe Number Bag:");
	pw.println(" ");
	pw.println("The Number Bag:");
	try {
		StringBuffer sb;
		int value = 0;

		//
		for (int row = 0; row < 9; row++) {
			sb = new StringBuffer();
			for (int i = 0; i < getTheNumbers().length; i++) {
				value = getTheNumbers(i);
				if ((value > row * 10) && (value <= (row + 1) * 10))
					sb.append(value + ", ");
			} // for i
			System.out.println(sb);
			pw.println(sb);
		} // for rows
	} catch (Exception e) {
		e.printStackTrace();
	}
}
/**
 * Sets the theNumbers property (int[]) value.
 * @param theNumbers The new value for the property.
 * @see #getTheNumbers
 */
public void setTheNumbers(int[] theNumbers) {
	fieldTheNumbers = theNumbers;
}
/**
 * Sets the theNumbers index property (int[]) value.
 * @param index The index value into the property array.
 * @param theNumbers The new value for the property.
 * @see #getTheNumbers
 */
public void setTheNumbers(int index, int theNumbers) {
	fieldTheNumbers[index] = theNumbers;
}
}
