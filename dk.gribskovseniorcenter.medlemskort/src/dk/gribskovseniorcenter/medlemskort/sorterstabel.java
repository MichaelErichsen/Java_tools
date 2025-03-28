/**
 *
 */
package dk.gribskovseniorcenter.medlemskort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Program til sortering af ark på 12 medlemskort, således at de kan skæres i
 * stabler
 *
 * @author Michael Erichsen, 2025
 */
public class sorterstabel {
	/**
	 * Main class
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		if (args.length < 2) {
			System.out.println("Du bedes venligst skrive \"sorterstabel <inputfil>\"");
			System.exit(4);
		}

		final var ss = new sorterstabel();

		try {
			ss.execute(args);
		} catch (final Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	/**
	 * Hvis der står noget i fjerde kolonne, som antages at være adresse2, klistres
	 * det ind i 3. kolonne med ", " imellem
	 *
	 * @param line
	 * @return
	 */
	private String behandleLinie(final String line, final String csvSeparator) {
		final var split = line.split(csvSeparator);

		if (!split[3].isEmpty()) {
			split[2] = split[2] + ", " + split[3];
			split[3] = "";
			return String.join(csvSeparator, split);
		}

		return line;
	}

	/**
	 * Worker method
	 *
	 * @param args
	 * @throws Exception
	 */

	private void execute(final String[] args) throws Exception {
		final List<String> listOfStrings = new ArrayList<>();
		final var br = new BufferedReader(new FileReader(args[0]));

		// Sorter ikke første linie, som er header
		final var headerLine = br.readLine();

		// Find csv separator fra headerlinjen
		final var csvSeparator = findCsvSeparator(headerLine);

		// Dan en tom linie til senere brug
		final var c = csvSeparator.charAt(0);
		final var count = headerLine.chars().filter(ch -> ch == c).count();

		final var sb = new StringBuilder("Void");

		for (int i = 0; i < count; i++) {
			sb.append(csvSeparator + "Void");
		}

		String tomLinje = sb.toString();
		var line = br.readLine();

		while (line != null) {
			final var behandleLinie = behandleLinie(line, csvSeparator);
			listOfStrings.add(behandleLinie);
			line = br.readLine();
		}

		br.close();

		final double size = listOfStrings.size();
		final var ark = Math.ceil(size / 12);
		final var maxSize = ark * 12;

		final var lastIndexOf = args[0].lastIndexOf(".");
		final var newName = args[0].subSequence(0, lastIndexOf) + "_sorteret.csv";

		System.out.println("Sorterer " + args[0] + "\ntil " + newName);

		final var bw = new BufferedWriter(new FileWriter(newName));
		bw.append(headerLine);
		bw.newLine();
		System.out.println(headerLine);

		for (var i = 0; i < ark; i++) {
			for (var j = 0; j < maxSize; j += ark) {
				if (i + j < size) {
					bw.append(listOfStrings.get(i + j));
					System.out.println(listOfStrings.get(i + j));
				} else {
					// Udfyld tomme linjer
					bw.append(tomLinje);
					System.out.println(tomLinje);
				}

				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

		System.out.println("Færdig med sortering af " + (int) size + " medlemskort på " + (int) ark + " ark.");
	}

	/**
	 * @param headerLine
	 * @return
	 * @throws Exception
	 */
	private String findCsvSeparator(final String headerLine) throws Exception {
		if (headerLine.contains(";")) {
			return ";";
		}

		if (headerLine.contains(",")) {
			return ",";
		}

		throw new Exception("Fandt hverken semikolon eller kolon i første linje");
	}

}
