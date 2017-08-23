package dk.xact.xtoolrdz.geneditor;

/**
 * Keyword and operator constants
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.5 
 */

public interface GenConstants {

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
	 * 09,162,117
	 * 124,184,84
	 */
	
	/**
	 * 193 keywords
	 */
	String keywords[] = { "(proc", "Accelerator", "Action", "ACTION",
			"ACTIONS:", "ADD", "AFTER", "ASCENDING", "ASSOCIATE", "AT",
			"Attribute:", "Attributes:", "Background", "Background:", "Bar",
			"Bar:", "BEGINNING", "Bitmap:", "Block", "BLOCK:", "Business",
			"BUSINESS", "Button", "BY", "CARDINALITY:", "CASE", "Check",
			"CLOSE", "Color:", "COMMAND", "Command:", "Control", "Controls:",
			"CREATE", "CURRENT", "DATA", "Default", "Defined", "Definition:",
			"DEFINITION:", "Definitions:", "DEFINITIONS:", "DELETE",
			"Description:", "DESCRIPTION:", "Design:", "DESIRED",
			"DESTINATION", "Dialect:", "DIALOG", "DISABLE", "Disabling",
			"DISASSOCIATE", "DISPLAY", "EACH", "Edit", "ELSE", "Emphasis:",
			"EMPTY", "ENABLE", "END", "Entity", "ENTITY", "Entity:", "Entry",
			"ESCAPE", "Event", "EVENT", "EVENT:", "Events:", "EXECUTE", "EXIT",
			"EXPORTS:", "EXTERNAL", "Field", "File:", "FILTER", "FLOW",
			"FLOWS", "Font", "FOR", "Foreground", "FOUND", "FROM", "FULL",
			"FUNCTION", "GET", "GIVING", "Group", "Help", "HIGHLIGHT",
			"HIGHLIGHTED", "Icon", "ID:", "IF", "IMPORTS:", "IN", "Indicator:",
			"Initial", "INVOKE", "IS", "Item", "Key", "KEY", "Key:", "LAST",
			"LINK", "LOCALS:", "Main", "MAKE", "Margins", "MARK", "MAX",
			"Member", "Menu", "Mnemonic", "Modality:", "MOVE", "Name:",
			"name:", "NEXT", "OF", "OPEN", "OTHERWISE", "Pattern:", "PF",
			"Position:", "Procedure", "PROCEDURE", "Prompt:", "Properties:",
			"PROPERTIES:", "Push", "READ", "REFRESH", "REMOVE", "REPEAT",
			"RETURNED", "RETURNS", "ROLLBACK", "ROW", "Screen", "SCREEN",
			"Selection", "Selection:", "SENT", "Separator:", "Sequencing:",
			"SET", "Size:", "SOME", "SORT", "SORTED", "Spacing:", "Spec",
			"Special", "STARTING", "STATE", "STATEMENTS", "States:", "STATES:",
			"Status", "Status:", "Step", "STEP", "STEP:", "Style:", "Sub",
			"SUMMARIZE", "System", "TARGETING", "Text:", "THAT", "Title:",
			"TO", "Toolbar:", "TOP", "Type:", "UNHIGHLIGHT", "UNMARK", "UNTIL",
			"UPDATE", "USE", "Video", "View", "View:", "Views", "WHEN",
			"WHERE", "WHICH", "WHILE", "WITH", "Work" };

	/**
	 * 20 operators
	 */
	String operators[] = { "¤", "+", "-", "*", "// /", "%", "=", "<", ">", "^",
			"|", "AND", "EQUAL", "GREATER", "LESS", "NOT", "OR", "POPULATED",
			"THAN" };

	/**
	 * 66 built-in functions
	 */
	String builtin[] = { "absolutevalue", "closefile", "concat", "concatmixed",
			"copyfile", "createtextfile", "current_date", "current_time",
			"current_timestamp", "currentwindow", "cyydate", "cyynum",
			"datedays", "dateformat", "datejul", "datenum", "datetext",
			"datetimestamp", "day", "dayofweek", "days", "daystimestamp",
			"daytimestamp", "deletefile", "fileexists", "filelength", "find",
			"floor", "getfunctionerrordescription", "getfunctionerrornumber",
			"gettext", "hour", "hourtimestamp", "juldate", "length",
			"messagebox", "messageboxbeep", "microsecond", "minute",
			"minutetimestamp", "modulus", "month", "monthtimestamp",
			"numberformat", "numcyy", "numdate", "numtext", "numtime",
			"opentextfile", "puttext", "renamefile", "second",
			"secondtimestamp", "substr", "substrmixed", "textnum", "timenum",
			"timestamp", "timetext", "timetimestamp", "trim", "upper",
			"uppermixed", "verify", "year", "yeartimestamp"

	};

	/**
	 * 113 Tags and options
	 */
	String tags[] = { "Adjust", "Alignment", "Application", "Auto",
			"Autoscroll", "Blue", "Bold", "Border", "Bottom", "Box", "Button",
			"Case", "Click", "Close", "Coordinates:", "CURSOR", "Default",
			"Designed", "Dialog", "Edit", "ENTER", "ENTRY", "ERROR", "Event",
			"Every", "Executes", "exists", "(explicit", ",explicit",
			"explicit,", "Explicit", "(export", ",export", "export,", "Export",
			"Exported", "Green", "Helv", "HOLD", "Horizontal", "(implicit",
			",implicit", "implicit,", "Implicit", "(import", ",import",
			"import,", "Import", "Initialized", "Instances", "Left",
			"(mandatory", ",mandatory", "mandatory,", "Mandatory", "Margin",
			"Menu", "Modal", "Modeless", "Mouse", "Multiple", "No", "NO",
			"none", "None", "NONE", "Non-repeating", "Normal", "Not",
			"OLEControl", "ON", "ONE", "only", "Only", "Open", "(optional",
			",optional", "optional,", "Optional", "Password", "Pattern",
			"permitted", "Persistent", "Position", "Preceded", "Primary",
			"Prompt", "Push", "Read", "Red", "Right", "Scaled", "Scroll",
			"SPACES", "Specialcharacter", "Standard", "Statusbar",
			"Stringplusoperator", "SUBSCRIPT", "successful", "System", "Tab",
			"tirevent", "Top", "(transient", ",transient", "transient,",
			"Transient", "Upper", "value", "violation", "Window", "YES" };

	String notes[] = { "NOTE:" };
}
