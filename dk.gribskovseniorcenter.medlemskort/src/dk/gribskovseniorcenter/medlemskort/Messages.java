package dk.gribskovseniorcenter.medlemskort;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "dk.gribskovseniorcenter.medlemskort.messages"; //$NON-NLS-1$
	public static String Medlemskort_Conventus_Url;
	public static String Medlemskort_Excelfil;
	public static String Medlemskort_Forening;
	public static String Medlemskort_Noegle;
	public static String Medlemskort_txtId_toolTipText;
	public static String Medlemskort_btnSg_toolTipText;
	public static String Medlemskort_btnUdskriv_toolTipText;
	public static String Medlemskort_btnAfslut_toolTipText;
	public static String Medlemskort_txtAdresse_toolTipText;
	public static String Medlemskort_Ptouch_skabelon;
	public static String Medlemskort_GscMedlemskort_text;
	public static String Medlemskort_btnUdskriv_text;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
