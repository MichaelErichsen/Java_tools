/**
 * 
 */
package net.myerichsen.query;


import java.sql.*;

import net.myerichsen.dbutil.SqlConstants;

/**
 * @author Michael Erichsen
 * @version 1.0, 22. 11. 2011
 */
public class SelectAllEvents {
	private static final String SELECT_EVENT = "SELECT * FROM GEDCOM.EVENT";


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResultSet rs;
		Statement st;

		// Not needed for Java 1.6
		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			Connection conn = DriverManager.getConnection(SqlConstants.DBNAMET);

			st = conn.createStatement();
			rs = st.executeQuery(SELECT_EVENT);

			while (rs.next())
				System.out.println("Event " + rs.getString(1).trim() + " "
						+ rs.getString(2).trim() + " " + rs.getString(3).trim()
						+ " " + rs.getString(4).trim() + " "
						+ rs.getString(5).trim() + " " + rs.getString(6).trim()
						+ " " + rs.getString(7).trim() + " " + rs.getString(8).trim());

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}