package net.myerichsen.dbutil;

import java.sql.*;

/**
 * @author Michael Erichsen
 * @version 14. 01. 2012
 */
public class DropTablesDerby {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";

	private static final String DROP_SCHEMA = "DROP SCHEMA TEST";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Statement st = null;
		Connection conn = null;

		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			conn = DriverManager.getConnection(SqlConstants.DBNAMET);

			st = conn.createStatement();
			st.execute(CURRENT_SQLID);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}

		try {
			st = conn.createStatement();
			st.execute(DROP_SCHEMA);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		try {
			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Tabeller er oprettet");
	}
}