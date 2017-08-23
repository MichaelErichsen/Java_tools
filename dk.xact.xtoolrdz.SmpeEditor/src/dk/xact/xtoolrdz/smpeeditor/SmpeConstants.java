package dk.xact.xtoolrdz.smpeeditor;

/**
 * Keyword and operator constants
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 */

public interface SmpeConstants {

	/**
	 * Preferences
	 */

	public static final String KEYWORD_COLOUR_PREFERENCE = "keywordcolourtype";
	public static final String OPERATOR_COLOUR_PREFERENCE = "operatorcolourtype";
	public static final String BUILTIN_COLOUR_PREFERENCE = "builtincolourtype";
	public static final String TAG_COLOUR_PREFERENCE = "tagcolourtype";
	public static final String NOTE_COLOUR_PREFERENCE = "notecolourtype";
	public static final String STRING_COLOUR_PREFERENCE = "stringcolourtype";

	public static final String DEFAULT_KEYWORD_COLOUR_PREFERENCE = "242,183,01";
	public static final String DEFAULT_OPERATOR_COLOUR_PREFERENCE = "229,125,04";
	public static final String DEFAULT_BUILTIN_COLOUR_PREFERENCE = "220,00,48";
	public static final String DEFAULT_TAG_COLOUR_PREFERENCE = "177,00,88";
	public static final String DEFAULT_NOTE_COLOUR_PREFERENCE = "124,55,138";
	public static final String DEFAULT_STRING_COLOUR_PREFERENCE = "52,101,170";

	/**
	 * More colours in the same palette:
	 * 
	 * 09,162,117 124,184,84
	 */

	/**
	 * Modification control statements
	 */
	String mcs[] = { "++AIX", "++APAR", "++ASSIGN", "++BOOK", "++BSIND",
			"++CGM", "++CLIENT", "++CLIST", "++DATA", "++DELETE", "++EXEC",
			"++FEATURE", "++FONT", "++FUNCTION", "++GDF", "++HELP", "++HFS",
			"++HOLD", "++IF", "++IMG", "++JAR", "++JARUPD", "++JCLIN", "++MAC",
			"++MACUPD", "++MCS", "++MOD", "++MOVE", "++MSG", "++NULL", "++OS2",
			"++PARM", "++PNL", "++PROBJ", "++PROC", "++PRODXML", "++PRODUCT",
			"++PROGRAM", "++PRSRC", "++PSEG", "++PTF", "++PUBLB", "++RELEASE",
			"++RENAME", "++SAMP", "++SHELLSCR", "++SKL", "++SRC", "++SRCUPD",
			"++TBL", "++TEXT", "++UNIX", "USER", "++USERMOD", "++UTIN",
			"++UTOUT", "++VER", "++WIN", "++ZAP" };

	/**
	 * Opcodes
	 */
	String opcodes[] = { "AC", "ALIAS", "ALIGN2", "AMODE", "ALL", "AMACLIB",
			"ASSEM", "ASM", "BINARY", "CALLLIBS", "CLASS", "COMMENT", "COPY",
			"COMPAT", "CSECT", "DALIAS", "DATE", "DC", "DELETE", "DESCRIPTION",
			"DISTLIB", "DISTMOD", "DISTSRC", "DSN", "FESN", "FETCHOPT",
			"FILES", "FILL", "FMID", "FROMDS", "HOBSET", "JARPARM", "LEPARM",
			"LINK", "LKED", "LKLIB", "LMOD", "MALIAS", "MAXBLK", "MAC", "MOD",
			"NCAL", "NE", "NOCALL", "NUMBER", "NPRE", "OPCODE", "OL", "OVLY",
			"PARM", "PGM", "POST", "PRE", "PREFIX", "PRODSUP", "PRODUCT",
			"REASON", "REFR", "RELFILE", "RENT", "REUS", "REQ", "RMODE",
			"REWORK", "RFDSNPFX", "RMID", "SCTR", "SHSCRIPT", "SOURCEID",
			"SREL", "SYMLINK", "SYMPATH", "SYSLIB", "SRC", "SUP", "TALIAS",
			"TEXT", "THEN", "TO", "TODISTLIB", "TONAME", "TOSYSLIB", "TXLIB",
			"UMID", "UNIT", "UPCASE", "UPDATE", "URL", "VENDOR", "VERSION",
			"VOL" };

	/**
	 * Parameters
	 */
	String subparameters[] = { "ACTION", "AO", "CATEGORY", "CHGDT", "DB2BIND",
			"DDDEF", "DEP", "DOC", "DOWNLD", "EC", "ENH", "ERROR", "EXIT",
			"EXRF", "FIX", "FIXCAT", "FROMDS", "FULLGEN", "IOGEN", "IPL",
			"MULTSYS", "MSGSKEL", "NOPACK", "NOPRIME", "NONE", "NO", "PACK",
			"PRIME", "RESOLVER", "RESTART", "SMRTDATA", "SSI", "SYMP",
			"SYSTEM", "SYSTEMUSER", "SERIAL", "TONAME", "USER", "YES" };

	/**
	 * Tags and options
	 */
	String tags[] = { "(", ")", "." };

	String languages[] = { "ARA", "HEB", "CHS", "ISL", "CHT", "ITA", "DAN",
			"ITS", "DES", "JPN", "DEU", "KOR", "ELL", "NLB", "ENG", "NLD",
			"ENP", "NOR", "ENU", "PTB", "ESP", "PTG", "FIN", "RMS", "FRA",
			"RUS", "FRB", "SVE", "FRC", "THA", "FRS", "TRK", };
}
