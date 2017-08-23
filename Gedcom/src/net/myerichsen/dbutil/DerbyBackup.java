/**
 * 
 */
package net.myerichsen.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Michael Erichsen
 * @version 1.0, 23. 12. 2011
 *          <p>
 *          Set the necessary parameters for a read-only Derby data base.
 */
public class DerbyBackup {

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

			PreparedStatement ps = conn.prepareStatement(
					"CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
			ps.setString(1,"C:\\Users\\Michael\\Documents\\The Master Genealogist v8\\Backups");
		    ps.execute();

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
