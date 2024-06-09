package dk.xact.em.Ussmsg10Generator;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * This program scans an image file with a company logo and produces statements
 * for a 3270 logon (USSMSG10) screen.
 * 
 * @author Michael Erichsen, Xact Consulting 2016
 * @version 20160829
 */
public class Generator {

	/**
	 * Number of character positions in the 3270 screen
	 */
	private static final int POSITIONS = 60;
	/**
	 * Number of lines in the 3270 screen
	 */
	private static final int LINES = 12;
	/**
	 * Calculated width in pixels of a cell in the logo image
	 */
	private static int cellWidth;
	/**
	 * Calculated height in pixels of a cell in the logo image
	 */
	private static int cellHeigth;
	/**
	 * Calculated area in pixels of a cell in the logo image
	 */
	private static int cellBox;

	/**
	 * Find the size of a character cell by dividing the image in 12 lines and
	 * 60 positions.
	 * 
	 * @param image
	 *            A company logo file
	 */
	private static void findCellSize(BufferedImage image) {
		cellHeigth = image.getHeight() / LINES;
		cellWidth = image.getWidth() / POSITIONS;
		cellBox = cellWidth * cellHeigth;
		System.out.println("Cell size: " + cellHeigth + " * " + cellWidth
				+ " = " + cellBox);
	}

	/**
	 * Generate USSMSG10 statements.
	 * 
	 * @param filename
	 *            Filename of the image file
	 */
	private static void generate(String filename) {
		File f = new File(filename);
		StringBuffer sb = new StringBuffer();
		String[] sa = new String[LINES];

		try {
			BufferedImage image = ImageIO.read(f);

			findCellSize(image);

			char[][] cArray = get3270Characters(image);

			for (int lineno = 0; lineno < LINES; lineno++) {
				for (int pos = 0; pos < POSITIONS; pos++) {
					sb.append(cArray[lineno][pos]);
				}

				sa[lineno] = sb.toString();
				System.out.println("<" + sa[lineno] + ">");
				sb = new StringBuffer();
			}
			System.out.println("");

			for (int lineno = 0; lineno < LINES; lineno++) {
				printUSSNStatements(lineno, sa[lineno]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Scan each of the 12 lines of 60 positions to see how many pixels are
	 * white or not.
	 * 
	 * Insert a blank if less than one third, a slash for the middle third, or
	 * an X if more than two thirds pixels are set in the cell.
	 * 
	 * @param image
	 *            A company logo file
	 * @return A 12 by 60 character array representing the character cells in
	 *         the 3270 logon screen
	 */
	private static char[][] get3270Characters(BufferedImage image) {
		char[][] cArray = new char[LINES][POSITIONS];
		int[] RGBArray = new int[cellBox];
		int pixel = 0;

		int startX = 0;
		int startY = 0;
		int sum = 0;

		for (int lineno = 0; lineno < LINES; lineno++) {
			startY = lineno * cellHeigth;

			for (int pos = 0; pos < POSITIONS; pos++) {
				startX = pos * cellWidth;

				image.getRGB(startX, startY, cellWidth, cellHeigth, RGBArray,
						0, cellWidth);

				for (int j2 = 0; j2 < RGBArray.length; j2++) {
					pixel = RGBArray[j2] & 0x00ffffff;

					if (pixel != 16777215) {
						sum += 1;
					}
				}

				// if (sum < (cellBox / 3))
				// cArray[lineno][pos] = ' ';
				// else if (sum < (cellBox * 2 / 3))
				// cArray[lineno][pos] = '/';
				// else
				// cArray[lineno][pos] = 'X';

				if (sum < (cellBox / 2))
					cArray[lineno][pos] = ' ';
				else
					cArray[lineno][pos] = 'X';
				
				sum = 0;
			}
		}

		return cArray;
	}

	/**
	 * Main method.
	 * 
	 * @param args
	 *            Filename of the image file of a company logo
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: Generator filename\n"
					+ "The program generates USSMSG10 statements for "
					+ "USER.VTAM.SOURCE(USSN) for a company logo.\n"
					+ "The filename is expected to be a company logo "
					+ "with width about four times the height (60 * 12)");
			System.exit(4);
		}

		generate(args[0]);
	}

	/**
	 * Print assembler statements to sysout.
	 * 
	 * @param lineno
	 *            Line number among the 12 lines in the 3270 screen
	 * @param contents
	 *            The 60 generated characters
	 */
	private static void printUSSNStatements(int lineno, String contents) {
		System.out.println("         DC X'11',AL2(((" + (lineno + 6)
				+ "-1)*80)+(01-1)) R=" + (lineno + 6) + ",C=01");
		System.out.println("         DC C'" + contents.substring(0, 40) + "'");
		System.out.println("         DC C'" + contents.substring(41) + "'");

	}

	/**
	 * No arg constructor
	 */
	public Generator() {
	}

}
