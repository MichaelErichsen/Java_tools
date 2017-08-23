package net.myerichsen.query;

import java.sql.*;
import net.myerichsen.dbutil.*;

/**
 * @author Michael Erichsen
 * @version 1.0
 */
public class SelectAllIndividuals {
	private static final String SELECT_INDIVIDUAL = "SELECT * FROM GEDCOM.INDIVIDUAL";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResultSet rs;
		Statement st;

		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			Connection conn = DriverManager.getConnection(SqlConstants.DBNAMET);

			st = conn.createStatement();

			rs = st.executeQuery(SELECT_INDIVIDUAL);

			while (rs.next())
				System.out.println("Individ " + rs.getString(1).trim() + " "
						+ rs.getString(2).trim() + " " + rs.getString(3).trim()
						+ " " + rs.getString(4).trim() + " "
						+ rs.getString(5).trim());

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}