package net.myerichsen.dbutil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Michael Erichsen
 * @version 14. 01. 2012
 *          <p>
 *          Needs big stack: -Xss1m
 * 
 */
public class DerbyOptimizer {
	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";

	private static final String CREATE_IX1 = "CREATE INDEX IX1 ON EVENT "
		+ "(FROMDATE ASC)";

	private static final String CREATE_IX2 = "CREATE INDEX IX2 "
		+ "ON INDIVIDUAL (FONKOD ASC)";

	private static final String CREATE_IX3 = "CREATE INDEX IX3 "
		+ "ON INDIVIDUAL (NAME ASC)";

	private static final String CREATE_IX4 = "CREATE INDEX IX4 "
		+ "ON EVENT (PLACE ASC)";

	private static final String DROP_IX1 = "DROP INDEX IX1";
	private static final String DROP_IX2 = "DROP INDEX IX2";
	private static final String DROP_IX3 = "DROP INDEX IX3";
	private static final String DROP_IX4 = "DROP INDEX IX4";

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

			Statement st = conn.createStatement();

			st.execute(CURRENT_SQLID);
			st.execute(DROP_IX1);
			st.execute(DROP_IX2);
			st.execute(DROP_IX3);
			st.execute(DROP_IX4);
			st.execute(CREATE_IX1);
			st.execute(CREATE_IX2);
			st.execute(CREATE_IX3);
			st.execute(CREATE_IX4);

			CallableStatement cs = conn
			.prepareCall("CALL SYSCS_UTIL.SYSCS_COMPRESS_TABLE(?, ?, ?)");
			cs.setString(1, "GEDCOM");
			cs.setString(2, "EVENT");
			cs.setShort(3, (short) 1);
			// cs.execute();

			cs = conn
			.prepareCall("CALL SYSCS_UTIL.SYSCS_COMPRESS_TABLE(?, ?, ?)");
			cs.setString(1, "GEDCOM");
			cs.setString(2, "INDIVIDUAL");
			cs.setShort(3, (short) 1);
			cs.execute();

			cs = conn
			.prepareCall("CALL SYSCS_UTIL.SYSCS_UPDATE_STATISTICS('GEDCOM', 'EVENT', null)");
			cs.execute();

			cs = conn
			.prepareCall("CALL SYSCS_UTIL.SYSCS_UPDATE_STATISTICS('GEDCOM', 'INDIVIDUAL', null)");
			cs.execute();

			cs.close();

			DriverManager.getConnection(SqlConstants.SHUTDOWN);
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			//			e.printStackTrace();
		}

	}
}
