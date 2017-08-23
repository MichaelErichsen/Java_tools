/**
 * 
 */
package net.myerichsen.query;

import java.sql.*;

/**
 * @author Michael
 * 
 */
public class SelectAll {
	private static final String DBNAME = "jdbc:derby:gedcom;create=true";
	private static final String DBDRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String SELECT_INDIVIDUAL = "SELECT * FROM INDIVIDUAL";
	private static final String SELECT_EVENT = "SELECT * FROM EVENT";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResultSet rs;
		Statement st;

		// Not needed for Java 1.6
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			Connection conn = DriverManager.getConnection(DBNAME);

			st = conn.createStatement();
			rs = st.executeQuery(SELECT_EVENT);

			while (rs.next())
				System.out.println("Event " + rs.getString(1).trim() + " "
						+ rs.getString(2).trim() + " " + rs.getString(3).trim()
						+ " " + rs.getString(4).trim() + " "
						+ rs.getString(5).trim() + " " + rs.getString(6).trim()
						+ " " + rs.getString(7).trim());

			rs = st.executeQuery(SELECT_INDIVIDUAL);

			while (rs.next())
				System.out.println("Individ " + rs.getString(1).trim() + " "
						+ rs.getString(2).trim() + " " + rs.getString(3).trim()
						+ " " + rs.getString(4).trim() + " "
						+ rs.getString(5).trim());

			DriverManager.getConnection("jdbc:derby:;shutdown=true");
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}