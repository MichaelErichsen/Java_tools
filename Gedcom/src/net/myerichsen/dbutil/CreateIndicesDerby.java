package net.myerichsen.dbutil;

import java.sql.*;

/**
 * @author Michael Erichsen
 * @version 14.01. 2012
 */
public class CreateIndicesDerby {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";
	
	private static final String CREATE_IX1 = "CREATE INDEX IX1 ON EVENT "
			+ "(FROMDATE ASC)";

	private static final String CREATE_IX2 = "CREATE INDEX IX2 "
			+ "ON INDIVIDUAL (FONKOD ASC)";

	private static final String CREATE_IX3 = "CREATE INDEX IX3 "
		+ "ON INDIVIDUAL (NAME ASC)";

	private static final String CREATE_IX4 = "CREATE INDEX IX4 "
		+ "ON EVENT (PLACE ASC)";

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
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			st = conn.createStatement();
			st.execute(CURRENT_SQLID);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}

		try {
			st.execute(CREATE_IX1);
			st.execute(CREATE_IX2);
			st.execute(CREATE_IX3);
			st.execute(CREATE_IX4);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Indices er oprettet");
	}
}