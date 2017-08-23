/**
 * 
 */
package net.myerichsen.dbutil;

import java.sql.*;

/**
 * @author Michael Erichsen
 * @version 1.0, 03. 12. 2011
 * 
 */
public class CreateTablesDB2 {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";

	private static final String CREATE_EVENT = "CREATE TABLE EVENT "
			+ "(ID CHAR(8) NOT NULL, FROMDATE DATE, TODATE DATE, PLACE CHAR(30), "
			+ "EVENTTYPE CHAR(30), VITALTYPE CHAR(30), "
			+ "COVERED_DATA VARCHAR(3600), SOURCE CHAR(100) NOT NULL, CAPTION CHAR(50), "
			+ "PRIMARY KEY (ID, SOURCE))";

	private static final String CREATE_INDIVIDUAL = "CREATE TABLE INDIVIDUAL "
			+ "(ID CHAR(8) NOT NULL, NAME CHAR(100), FONKOD CHAR(50), "
			+ "EVENT_ID CHAR(8), SOURCE CHAR(100) NOT NULL,"
			+ "PRIMARY KEY (ID, SOURCE),"
			+ "FOREIGN KEY (EVENT_ID, SOURCE) REFERENCES EVENT (ID, SOURCE))";

	private static final String CREATE_IX1 = "CREATE INDEX IX1 ON EVENT "
			+ "(FROMDATE ASC)";

	private static final String CREATE_IX2 = "CREATE INDEX IX2 "
			+ "ON INDIVIDUAL (FONKOD ASC)";

	private static final String CREATE_IX3 = "CREATE INDEX IX3 "
		+ "ON INDIVIDUAL (NAME ASC)";

	private static final String CREATE_IX4 = "CREATE INDEX IX4 "
		+ "ON EVENT (PLACE ASC)";

	private static final String DROP_EVENT = "DROP TABLE EVENT";
	private static final String DROP_INDIVIDUAL = "DROP TABLE INDIVIDUAL";
	private static final String DROP_IX1 = "DROP INDEX IX1";
	private static final String DROP_IX2 = "DROP INDEX IX2";
	private static final String DROP_IX3 = "DROP INDEX IX3";
	private static final String DROP_IX4 = "DROP INDEX IX4";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int xxx = 0/0;
		
		Statement st = null;
		Connection conn;

		// Not needed for Java 1.6
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
			st.execute(DROP_IX2);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			st = conn.createStatement();
			st.execute(DROP_IX3);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			st = conn.createStatement();
			st.execute(DROP_IX4);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			st = conn.createStatement();
			st.execute(DROP_INDIVIDUAL);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		try {
			st = conn.createStatement();
			st.execute(DROP_IX1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		try {
			st = conn.createStatement();
			st.execute(DROP_EVENT);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		try {
			st.execute(CREATE_EVENT);
			st.execute(CREATE_IX1);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			st.execute(CREATE_INDIVIDUAL);
			st.execute(CREATE_IX2);
			st.execute(CREATE_IX3);
			st.execute(CREATE_IX4);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Tabeller og indices er oprettet");
	}
}