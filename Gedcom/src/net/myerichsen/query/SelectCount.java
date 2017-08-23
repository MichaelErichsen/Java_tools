/**
 * 
 */
package net.myerichsen.query;

import java.sql.*;

import net.myerichsen.dbutil.SqlConstants;

/**
 * @author Michael Erichsen
 * @version 1.0
 */
public class SelectCount {
	private static final String SELECT_EVENT = "SELECT COUNT(*) FROM GEDCOM.EVENT";
	private static final String SELECT_INDIVIDUAL = "SELECT COUNT(*) FROM GEDCOM.INDIVIDUAL";
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
				System.out.println("Event " + rs.getString(1).trim());

			rs = st.executeQuery(SELECT_INDIVIDUAL);

			while (rs.next())
				System.out.println("Individual " + rs.getString(1).trim());

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}