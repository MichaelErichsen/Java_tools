package net.myerichsen.GoogleMapsClient;

import java.io.*;
import java.net.*;

/**
 * @author Michael Erichsen & Jörn Heid
 * @version 1.0 10/01/2009
 * 
 */
public class GoogleGeocoder {
	private final static String ENCODING = "UTF-8";

	private final static String KEY = "ABQIAAAAqUb43iMHSJEFXSwqpeB8-BTNccX3E70Xon2L9zMz_JWN1htMBRTZYqDnO6WnOoe82SuK--SGDL9I0A";

	/**
	 * @author Jörn Heid & Michael Erichsen
	 * @version 1.0 10/01/2009
	 * 
	 */
	public static class Location {

		/**
		 * Longitude
		 */
		public String lon;
		/**
		 * Latitude
		 */
		public String lat;

		private Location(String lat, String lon) {
			this.lon = lon;
			this.lat = lat;
		}

		public String toString() {
			return lat + "~" + lon;
			// return "Lat: " + lat + ", Lon: " + lon;
		}
	}

	/**
	 * @param address
	 * @param log 
	 * @return location
	 * @throws IOException
	 */
	public static Location getLocation(String address, PrintWriter log) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(new URL(
				"http://maps.google.com/maps/geo?q="
				+ URLEncoder.encode(address, ENCODING)
				+ "&output=csv&key=" + KEY).openStream()));
		String line;
		Location location = null;
		int statusCode = -1;
		while ((line = in.readLine()) != null) {
			// Format: 200,6,42.730070,-73.690570
			statusCode = Integer.parseInt(line.substring(0, 3));
			if (statusCode == 200)
				location = new Location(line.substring("200,6,".length(), line
						.indexOf(',', "200,6,".length())), line.substring(line
								.indexOf(',', "200,6,".length()) + 1, line.length()));
		}
		if (location == null) {
			switch (statusCode) {
			case 400:
				throw new IOException("Bad Request");
			case 500:
				throw new IOException("Unknown error from Google Encoder");
			case 601:
				throw new IOException("Missing query");
			case 602:
				return null;
			case 603:
				throw new IOException("Legal problem");
			case 604:
				throw new IOException("No route");
			case 610:
				throw new IOException("Bad key");
			case 620:
				throw new IOException("Too many queries");
			default:
				log.println("Error in " + line);
			}
		}
		return location;
	}

	/**
	 * @param argv
	 * @throws Exception
	 */
	public static void main(String[] argv) throws Exception {
		String line = null;
		String[] elements;
		StringBuffer address;
		Location result = null;

		if (argv.length < 2) {
			System.out
			.println("Mandatory arguments: infilename and outfilename without extensions");
			System.exit(4);
		}

		try {
			BufferedReader in = new BufferedReader(new FileReader(argv[0] + ".csv"));
			PrintWriter out = new PrintWriter(new FileWriter(new File(argv[1] + ".csv")));
			PrintWriter log = new PrintWriter(new FileWriter(new File(argv[1] + ".log")));

			while ((line = in.readLine()) != null) {
				elements = line.split(";");

				int length = elements.length;
				if (length > 5) {
					log.println("Ignoring: " + line);
					continue;
				}

				address = new StringBuffer();

				for (int i = 0; i < length; i++) {
					address.append(elements[i] + ";");
				}

				if (length < 5) {
					address.append("Denmark;");
				}

				result = GoogleGeocoder.getLocation(address.toString(), log);

				if (result != null) {
					address.append(result.toString() + ";");
					out.println(address.toString());
					System.out.println(address.toString());
				}
				
				out.flush();
				log.flush();
			}

			in.close();
			out.close();
			log.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
