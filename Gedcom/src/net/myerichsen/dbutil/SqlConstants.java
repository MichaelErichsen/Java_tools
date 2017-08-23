package net.myerichsen.dbutil;

/**
 * @author Michael Erichsen
 * @version 09.04.2013
 * <p>
 * Cd c:\DerbyDB
 * <p>
 * Jar cMf c:\gedcom gedcom
 */
public class SqlConstants {
	public static final String DBDRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
//	public static final String DBDRIVER = "COM.ibm.db2.jdbc.app.DB2Driver";
	public static final String DBNAMET = "jdbc:derby:c:\\DerbyDB\\test;create=true";
	public static final String DBNAMEP = "jdbc:derby:c:\\DerbyDB\\gedcom";
	public static final String DBNAMEJ = "jdbc:derby:jar:(C:/Users/Michael/Documents/UIMA/gedcomdb.jar)gedcom";
	public static final String SHUTDOWN = "jdbc:derby:;shutdown=true";
}
