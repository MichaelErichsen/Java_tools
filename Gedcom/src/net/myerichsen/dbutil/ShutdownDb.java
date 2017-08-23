/**
 * 
 */
package net.myerichsen.dbutil;

import java.sql.*;

/**
 * @author Michael Erichsen
 * @version 1.0. 20. 11. 2011
 * 
 */
public class ShutdownDb {
	private static final String SHUTDOWN = "jdbc:derby:;shutdown=true";
	private static final String DBDRIVER = "org.apache.derby.jdbc.EmbeddedDriver";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Not needed for Java 1.6
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(16);
		}
		
		try {
			DriverManager.getConnection(SHUTDOWN);
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}

	}
}