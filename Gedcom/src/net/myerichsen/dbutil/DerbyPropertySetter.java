/**
 * 
 */
package net.myerichsen.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Michael Erichsen
 * @version 1.0, 17. 12. 2011
 *          <p>
 *          Set the necessary parameters for a read-only Derby data base.
 */
public class DerbyPropertySetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			Connection conn = DriverManager.getConnection(SqlConstants.DBNAMEP);
			Statement s = conn.createStatement();

			s.executeUpdate("CALL SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY("
					+ "'derby.storage.tempDirectory', 'c:/temp/gedcomtemp')");
			ResultSet rs = s
			.executeQuery("VALUES SYSCS_UTIL.SYSCS_GET_DATABASE_PROPERTY("
					+ "'derby.storage.tempDirectory')");
			rs.next();
			System.out.println("Value of derby.storage.tempDirectory is "
					+ rs.getString(1));

			s.executeUpdate("CALL SYSCS_UTIL.SYSCS_SET_DATABASE_PROPERTY("
					+ "'derby.stream.error.file', 'c:/temp/gedcom.log')");
			rs = s
			.executeQuery("VALUES SYSCS_UTIL.SYSCS_GET_DATABASE_PROPERTY("
					+ "'derby.stream.error.file')");
			rs.next();
			System.out.println("Value of derby.stream.error.file is "
					+ rs.getString(1));

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}
