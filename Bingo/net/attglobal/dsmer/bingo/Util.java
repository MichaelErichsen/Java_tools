package net.attglobal.dsmer.bingo;

/**
 * Utilities for classes in the Bingo package.
 * <p>Creation date: (24-04-00 15.38.02)
 * <p>Updated (25-04-00 22.27.17)
 * @author Michael Erichsen
 */
public class Util {
/**
 * Util constructor.
 */
public Util() {
	super();
}
/**
 * Initializes the number array.
 * <p>Creation date: (24-04-00 11.48.43)
 * @param int dim
 * @param int max
 */
protected static int[] fill(int dim, int max) {
	int i = 0;
	int[] theNumbers = new int[dim];

	// Add elements
	for (i = 0; i < dim; i++) {
		while (true) {
			theNumbers[i] = (int) (Math.random() * (max - 1) + 1);
			if (theNumbers[i] == 25)
				continue;
			if (isUnique(i, theNumbers[i], theNumbers) == true)
				break;
		} // while true
	} // for i
	return theNumbers;
}
/**
 * Initializes rest of the number array.
 * <p>Creation date: (24-04-00 11.48.43)
 * @param int dim
 * @param int start
 * @param int max
 * @param int[] theOldNumbers
 */
protected static int[] fill(int dim, int start, int max, int[] theOldNumbers) {
	int i = 0;
	int[] theNumbers = new int[dim];

	// Copy existing values
	for (i = 0; i < start; i++)
		theNumbers[i] = theOldNumbers[i];

	// Add new numbers
	for (i = start; i < dim; i++) {
		while (true) {
			theNumbers[i] = (int) (Math.random() * (max - 1) + 1);
			if (theNumbers[i] == 25)
				continue;
			if (isUnique(i, theNumbers[i], theNumbers) == true)
				break;
		} // while true
	} // for i
	return theNumbers;
}
/**
 * Test value for uniqueness.
 * <p>Creation date: (24-04-00 12.27.14)
 * @return boolean
 * @param int position
 * @param int value
 * @param int[] theNumbers
 */
protected static boolean isUnique(int position, int value, int[] theNumbers) {
	// Compare with all previous elements
	for (int i = 0; i < position; i++) {
		if (theNumbers[i] == value)
			return false;
	} // for i

	return true;
}
/**
 * Sort the array according to values.
 * <p>Creation date: (24-04-00 12.07.46)
 * @return int[] The sorted array
 * @param int[] The unsorted array
 */
protected static int[] sort(int[] theNumbers) {
	int i = 0;
	int mid = 0;
	boolean sorted = false;

	//
	while (sorted == false) {
		sorted = true;
		for (i = 0; i < theNumbers.length - 1; i++) {
			if (theNumbers[i] > theNumbers[i + 1]) {
				mid = theNumbers[i];
				theNumbers[i] = theNumbers[i + 1];
				theNumbers[i + 1] = mid;
				sorted = false;
			} // If they should be swapped
		} // for i
	} // While not yet sorted
	return theNumbers;
}
}
