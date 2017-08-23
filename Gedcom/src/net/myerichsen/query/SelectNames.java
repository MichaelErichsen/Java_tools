/**
 * 
 */
package net.myerichsen.query;

import java.sql.*;

import net.myerichsen.fonkod.Fonkod;

/**
 * @author Michael Erichsen
 * @version 1.0
 * 
 */

public class SelectNames {
	private static final String name = "Erik Larsen";
	
	private static final String SHUTDOWN = "jdbc:derby:;shutdown=true";
	private static final String DBNAME = "jdbc:derby:gedcom";
	private static final String DBDRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String SELECT_INDIVIDUAL = 
		"SELECT INDIVIDUAL.NAME, EVENT.COVERED_DATA " +
		"FROM INDIVIDUAL, EVENT " +
		"WHERE (FONKOD = ? OR INDIVIDUAL.NAME = ? OR INDIVIDUAL.NAME LIKE ?) " +
		"AND INDIVIDUAL.EVENT_ID = EVENT.ID AND INDIVIDUAL.SOURCE = EVENT.SOURCE " + 
		"ORDER BY FROMDATE";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs;
		PreparedStatement ps;
		Fonkod fk = new Fonkod();


		// Not needed for Java 1.6
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			conn = DriverManager.getConnection(DBNAME);

			ps = conn.prepareStatement(SELECT_INDIVIDUAL);
			ps.setString(1, fk.generateKey(name));
			ps.setString(2, name.trim());
			String[] sa = name.split(" ");
			ps.setString(3, "%" + sa[sa.length - 1].trim());
			rs = ps.executeQuery();

			while (rs.next())
				System.out.println(rs.getString(1).trim() + " fundet i:\n"
						+ rs.getString(2).trim());
			;
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			DriverManager.getConnection(SHUTDOWN);
			conn.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}