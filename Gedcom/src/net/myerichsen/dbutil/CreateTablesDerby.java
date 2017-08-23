package net.myerichsen.dbutil;

import java.sql.*;

/**
 * @author Michael Erichsen
 * @version 14. 01. 2012
 */
public class CreateTablesDerby {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";
	
	private static final String CREATE_SCHEMA = "CREATE SCHEMA GEDCOM";

	private static final String CREATE_EVENT = "CREATE TABLE EVENT "
			+ "(ID CHAR(8) NOT NULL, FROMDATE DATE, TODATE DATE, PLACE CHAR(50), "
			+ "EVENTTYPE CHAR(30), VITALTYPE CHAR(30), "
			+ "COVERED_DATA VARCHAR(3600), SOURCE CHAR(100) NOT NULL, CAPTION CHAR(50), "
			+ "PRIMARY KEY (ID, SOURCE))";

	private static final String CREATE_INDIVIDUAL = "CREATE TABLE INDIVIDUAL "
			+ "(ID CHAR(8) NOT NULL, NAME CHAR(100), FONKOD CHAR(50), "
			+ "EVENT_ID CHAR(8), SOURCE CHAR(100) NOT NULL,"
			+ "PRIMARY KEY (ID, SOURCE),"
			+ "FOREIGN KEY (EVENT_ID, SOURCE) REFERENCES EVENT (ID, SOURCE))";

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
			st.execute(CREATE_SCHEMA);
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
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			st.execute(CREATE_INDIVIDUAL);
		} catch (SQLException e) {
			e.printStackTrace();
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