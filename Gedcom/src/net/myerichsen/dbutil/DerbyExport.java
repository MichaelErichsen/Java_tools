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
public class DerbyExport {

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
		    "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE (?,?,?,?,?,?)");
		    ps.setString(1,"GEDCOM");
		    ps.setString(2,"EVENT");
		    ps.setString(3,"C:\\Users\\Michael\\Documents\\The Master Genealogist v8\\export\\event.dat");
		    ps.setString(4,"%");
		    ps.setString(5,null);
		    ps.setString(6,null);
		    ps.execute();			
			
//			ps = conn.prepareStatement(
//		    "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE (?,?,?,?,?,?)");
//		    ps.setString(1,"GEDCOM");
		    ps.setString(2,"INDIVIDUAL");
		    ps.setString(3,"C:\\Users\\Michael\\Documents\\The Master Genealogist v8\\export\\individual.dat");
//		    ps.setString(4,"%");
//		    ps.setString(5,null);
//		    ps.setString(6,null);
		    ps.execute();			

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
