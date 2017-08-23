package net.attglobal.dsmer.bingo;

/**
 * A board for playing Bingo.
 * <p>Creation date: (24-04-00 15.38.29)
 * <p>Updated (25-04-00 21.49.54)
 * <p>Updated (26-04-00 10:46:15)
 * <p>Updated (29-04-00 19.07.02)
 * <p>Updated (10-05-00 16:29:59)
 * @author Michael Erichsen
 */
public abstract class Board {
	/**
	 * The 27 fields on the rectangular board.
	 */
	protected int theFields[][] = null;
	/**
	 * The 15 actual numbers.
	 */
	protected int theNumbers[] = null;
	/**
	 * A print writer
	 */
	protected java.io.PrintWriter pw;
	/**
	 * The numbers to be drawn.
	 */
	protected NumberBag theNumberBag;
/**
 * Board constructor.
 * <p>Creation date: (24-04-00 16.51.48)
 */
public Board() {
	theFields = new int[3][9];
	theNumbers = new int[15];
}
/**
 * Distribute numbers across all three rows, so there are five numbers in each row.
 * <p>Creation date: (24-04-00 18.39.01)
 */
protected void distribute() {
	int count[] = {0, 0, 0};
//	int value = 0;
	int i = 0;
	int row = 0;
	int col = 0;
	int counter = 0;
	int sourceColumns[] = new int[9];
	int targetColumns[] = new int[9];

	// Count numbers in each row. There will always be 9 in the first row, 6-3 in the second row,
	// and 3-0 in the third row.
	for (row = 0; row < 3; row++) {
		for (col = 0; col < 9; col++) {
			if (theFields[row][col] > 0) {
				count[row] += 1;
			} // if theFields
		} // for col
	} // for row

	// Separate the four valid cases
	switch (count[1]) {

		// 9, 6, 0
		case 6 :
			// Find columns to move to.
			counter = 0;
			for (col = 0; col < 9; col++) {
				if (theFields[2][col] == 0)
					sourceColumns[counter++] = col;
			} // for col

			// Move four numbers from first to third row, chosen at random
			for (i = 0; i < 4; i++) {
				while (true) {
					targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
					if (Util.isUnique(i, targetColumns[i], targetColumns) == true)
						break;
				} // while true

				// if row 2 is empty, we just move. If row two is occupied we have to percolate
				if (theFields[1][targetColumns[i]] == 0) {
					theFields[2][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				} else {
					theFields[2][targetColumns[i]] = theFields[1][targetColumns[i]];
					theFields[1][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				}
			} // for i

			// Find columns to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if ((theFields[1][col] > 0) && (theFields[2][col] == 0))
					sourceColumns[counter++] = col;
			} // for col

			// Move one number from second to third row, chosen at random
			while (true) {
				targetColumns[0] = sourceColumns[ (int) (Math.random() * counter)];
				if ((theFields[1][targetColumns[0]] > 0) && (theFields[2][targetColumns[0]] == 0))
					break;
			} // while true

			theFields[2][targetColumns[0]] = theFields[1][targetColumns[0]];
			theFields[1][targetColumns[0]] = 0;
			break;

			// 9, 5, 1
		case 5 :
			// Find columns to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if (theFields[2][col] == 0)
					sourceColumns[counter++] = col;
			} // for col

			// Move four columns from first to third row, chosen at random
			for (i = 0; i < 4; i++) {
				while (true) {
					targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
					if (Util.isUnique(i, targetColumns[i], targetColumns) == true)
						break;
				} // while true

				// if row 2 is empty, we just move. If row two is occupied we have to percolate
				if (theFields[1][targetColumns[i]] == 0) {
					theFields[2][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				} else {
					theFields[2][targetColumns[i]] = theFields[1][targetColumns[i]];
					theFields[1][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				}
			} // for i
			break;

			// 9, 4, 2
		case 4 :
			// Find column to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if (theFields[1][col] == 0)
					sourceColumns[counter++] = col;
			} // for col

			// Move one number from first to second row, chosen at random
			targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
			theFields[1][targetColumns[0]] = theFields[0][targetColumns[0]];
			theFields[0][targetColumns[0]] = 0;

			// Find columns to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if ((theFields[0][col] > 0) && (theFields[2][col] == 0))
					sourceColumns[counter++] = col;
			} // for col

			// Move three numbers from first to third row, chosen at random
			for (i = 0; i < 3; i++) {
				while (true) {
					targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
					if (theFields[0][targetColumns[i]] == 0)
						continue;
					if (theFields[2][targetColumns[i]] > 0)
						continue;
					if (Util.isUnique(i, targetColumns[i], targetColumns) == true)
						break;
				} // while true

				// if row 2 is empty, we just move. If row two is occupied we have to percolate
				if (theFields[1][targetColumns[i]] == 0) {
					theFields[2][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				} else {
					theFields[2][targetColumns[i]] = theFields[1][targetColumns[i]];
					theFields[1][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				}
			} // for i
			break;

			// 9, 3, 3
		case 3 :
			// Find columns to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if (theFields[1][col] == 0)
					sourceColumns[counter++] = col;
			} // for col

			// Move two numbers from first to second row, chosen at random
			for (i = 0; i < 2; i++) {
				targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
				theFields[1][targetColumns[i]] = theFields[0][targetColumns[i]];
				theFields[0][targetColumns[i]] = 0;
			} // for i

			// Find columns to move to
			counter = 0;
			for (col = 0; col < 9; col++) {
				if ((theFields[0][col] > 0) && (theFields[2][col] == 0))
					sourceColumns[counter++] = col;
			} // for col

			// Move two numbers from first to third row, chosen at random
			for (i = 0; i < 2; i++) {
				while (true) {
					targetColumns[i] = sourceColumns[ (int) (Math.random() * counter)];
					if (theFields[0][targetColumns[i]] == 0)
						continue;
					if (theFields[2][targetColumns[i]] > 0)
						continue;
					if (Util.isUnique(i, targetColumns[i], targetColumns) == true)
						break;
				} // while true

				// if row 2 is empty, we just move. If row two is occupied we have to percolate
				if (theFields[1][targetColumns[i]] == 0) {
					theFields[2][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				} else {
					theFields[2][targetColumns[i]] = theFields[1][targetColumns[i]];
					theFields[1][targetColumns[i]] = theFields[0][targetColumns[i]];
					theFields[0][targetColumns[i]] = 0;
				}
			} // for i
			break;

			// Error condition
		default :
			System.out.println("Invalid combination of counts: " + count[0] + ", " + count[1] + ", " + count[2] + ", ");
			break;
	} // switch
}
/**
 * Move numbers into board fields.
 * <p>Creation date: (24-04-00 12.59.34)
 */
public void populateFields() {
	int value = 0;
	int row = 0;
	int col = 0;

	//
	for (int i = 0; i < theNumbers.length; i++) {
		value = theNumbers[i];
		if (value < 10) {
			row = 0;
			while (theFields[row++][0] > 0)
				continue;
			theFields[row - 1][0] = value;
		} else
			if (value >= 80) {
				row = 0;
				while (theFields[row++][8] > 0)
					continue;
				theFields[row - 1][8] = value;
			} else {
				col = (value / 10);
				row = 0;
				while (theFields[row++][col] > 0)
					continue;
				theFields[row - 1][col] = value;
			}
		row++;
	} // for i
}
/**
 * Print Board.
 * <p>Creation date: (24-04-00 17.26.41)
 */
public void printBoard() {
	try {
		int value = 0;
		int col = 0;

		// Table headers
		pw.write("<table BORDER=2><tr><td>\n");
		pw.write("<table BORDER=2 COLS=9 CELLPADDING=5>\n");

		// Rows and columns
		for (int row = 0; row < 3; row++) {
			pw.write("<tr>\n");
			for (col = 0; col < 9; col++) {
				pw.write("<td ALIGN=CENTER VALIGN=CENTER WIDTH=65 HEIGHT=65><b><font face=\"Times New Roman,Times\"><font size=+4>");
				value = theFields[row][col];
				if (value == 0)
					pw.write("&nbsp;&nbsp;");
				else
					if (value < 10)
						pw.write("&nbsp;&nbsp;" + String.valueOf(theFields[row][col]));
					else
						pw.write(String.valueOf(theFields[row][col]));
				pw.write("</font></font></b></td>\n");
			} // for col
			pw.write("</tr>\n");
		} // for rows

		// Table footer
		pw.write("</table>\n");
		pw.write("</td></tr></table>\n");

		// 5 digit number
		long sum = 0;
		for (int i = 0; i < theNumbers.length; i++) {
			sum += theNumbers[i];
		}
		sum *= System.currentTimeMillis();
		sum %= 9999;
		pw.write("<table BORDER=0 COLS=1 WIDTH=690><tr><td><div align=right><font size=-2>");
		pw.write(sum + "</font></div></td></tr></table><font size=+3><br></font>\n");
	} catch (Exception e) {
		e.printStackTrace();
	}
}
/**
 * Test that there are no more than three and no less than one value for each column.
 * <p>Creation date: (24-04-00 17.00.51)
 * @return boolean
 */
protected boolean testColumns() {
	int value = 0;
	int i = 0;
	int col = 0;
	int count[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

	// Count numbers in each column
	for (i = 0; i < theNumbers.length; i++) {
		value = theNumbers[i];
		if (value < 10)
			count[0] += 1;
		else
			if (value >= 80)
				count[8] += 1;
			else {
				col = (value / 10);
				count[col] += 1;
			} // else
	} // for i

	for (col = 0; col < count.length; col++) {
		if (count[col] > 3) {
			return false;
		}
		if (count[col] < 1) {
			return false;
		}
	} // for col

	return true;
}
/**
 * Test that there are five values in each row.
 * <p>Creation date: (29-04-00 19.25.42)
 * @return boolean
 */
protected boolean testRows() {
	int count = 0;
	int row = 0;
	int col = 0;

	// Count numbers in each row
	for (row = 0; row < 3; row++) {
		count = 0;
		for (col = 0; col < 9; col++) {
			if (theFields[row][col] > 0)
				count++;
		} // for col
		if (count < 5) {
			System.out.println("Only " + count + " in " + theFields[row][0] + ", " + theFields[row][1] + ", " + theFields[row][2] + ", " + theFields[row][3] + ", " + theFields[row][4] + ", " + theFields[row][5] + ", " + theFields[row][6] + ", " + theFields[row][7] + ", " + theFields[row][8]);
			return false;
		} // If count too small
	} // for row
	return true;
}
}
