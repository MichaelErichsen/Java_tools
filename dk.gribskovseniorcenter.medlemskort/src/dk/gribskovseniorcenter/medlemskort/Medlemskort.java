package dk.gribskovseniorcenter.medlemskort;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Medlemskort {

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Medlemskort window = new Medlemskort();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected Shell GscMedlemskort;
	private Text txtId;
	private Text txtNavn;
	private Text txtAdresse;
	private Label lblPostnummer;
	private Text txtPostnummer;
	private Label lblBy;
	private Text txtBy;
	private Button btnSg;
	private Button btnUdskriv;
	private Button btnAfslut;
	private Text txtMeddelelse;
	private Medlem medlem;
	private Composite composite;
	private Label lblExcelark;
	private Text txtExcelark;
	private Label lblPtouchLabel;
	private Text txtPtouchLabel;

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		GscMedlemskort = new Shell();
		GscMedlemskort.setSize(792, 443);
		GscMedlemskort.setText(Messages.Medlemskort_GscMedlemskort_text); // $NON-NLS-1$
		GscMedlemskort.setLayout(new GridLayout(6, false));

		composite = new Composite(GscMedlemskort, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 7);
		gd_composite.widthHint = 175;
		composite.setLayoutData(gd_composite);

		Label lblNewLabel = new Label(composite, SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI Black", 9, SWT.NORMAL));
		 lblNewLabel.setImage(
		 SWTResourceManager.getImage(Medlemskort.class,
		 "/dk/gribskovseniorcenter/medlemskort/Object0.jpg"));
		 lblNewLabel.setText("");

		Label lblId = new Label(GscMedlemskort, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblId.setText("MedlemsID"); //$NON-NLS-1$

		txtId = new Text(GscMedlemskort, SWT.BORDER);
		txtId.setToolTipText(Messages.Medlemskort_txtId_toolTipText);
		txtId.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				String string = e.text;
				char[] chars = new char[string.length()];
				string.getChars(0, chars.length, chars, 0);
				for (int i = 0; i < chars.length; i++) {
					if (!('0' <= chars[i] && chars[i] <= '9')) {
						e.doit = false;
						return;
					}
				}
			}
		});

		txtId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				txtMeddelelse.setText(""); //$NON-NLS-1$
			}
		});
		txtId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		Label lblNavn = new Label(GscMedlemskort, SWT.NONE);
		lblNavn.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNavn.setText("Navn"); //$NON-NLS-1$

		txtNavn = new Text(GscMedlemskort, SWT.BORDER);
		txtNavn.setEnabled(false);
		txtNavn.setEditable(false);
		txtNavn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		Label lblAdresse = new Label(GscMedlemskort, SWT.NONE);
		lblAdresse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblAdresse.setText("Adresse"); //$NON-NLS-1$

		txtAdresse = new Text(GscMedlemskort, SWT.BORDER);
		txtAdresse.setEnabled(false);
		txtAdresse.setToolTipText(Messages.Medlemskort_txtAdresse_toolTipText);
		txtAdresse.setEditable(false);
		txtAdresse.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		lblPostnummer = new Label(GscMedlemskort, SWT.NONE);
		lblPostnummer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPostnummer.setText("Postnummer"); //$NON-NLS-1$

		txtPostnummer = new Text(GscMedlemskort, SWT.BORDER);
		txtPostnummer.setEnabled(false);
		txtPostnummer.setEditable(false);
		txtPostnummer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		lblBy = new Label(GscMedlemskort, SWT.NONE);
		lblBy.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblBy.setText("By"); //$NON-NLS-1$

		txtBy = new Text(GscMedlemskort, SWT.BORDER);
		txtBy.setEnabled(false);
		txtBy.setEditable(false);
		txtBy.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		lblExcelark = new Label(GscMedlemskort, SWT.NONE);
		lblExcelark.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblExcelark.setText("Excelark");

		txtExcelark = new Text(GscMedlemskort, SWT.BORDER);
		txtExcelark.setEnabled(false);
		txtExcelark.setEditable(false);
		txtExcelark.setText(Messages.Medlemskort_Excelfil);
		txtExcelark.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));

		lblPtouchLabel = new Label(GscMedlemskort, SWT.NONE);
		lblPtouchLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPtouchLabel.setText("P-touch label");

		txtPtouchLabel = new Text(GscMedlemskort, SWT.BORDER);
		txtPtouchLabel.setEnabled(false);
		txtPtouchLabel.setEditable(false);
		txtPtouchLabel.setText(Messages.Medlemskort_Ptouch_skabelon);
		txtPtouchLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
		new Label(GscMedlemskort, SWT.NONE);

		txtMeddelelse = new Text(GscMedlemskort, SWT.BORDER);
		txtMeddelelse.setEnabled(false);
		txtMeddelelse.setEditable(false);
		txtMeddelelse.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 5, 1));
		new Label(GscMedlemskort, SWT.NONE);
		new Label(GscMedlemskort, SWT.NONE);

		btnSg = new Button(GscMedlemskort, SWT.NONE);
		btnSg.setToolTipText(Messages.Medlemskort_btnSg_toolTipText);
		btnSg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				txtMeddelelse.setText(""); //$NON-NLS-1$
				String response = "";
				String meddelelse = "";

				medlem = null;
				medlem = new Medlem();

				if (txtId.getText() == "") {
					txtMeddelelse.setText("Indtast venligst et medlemsID");
				} else {
					try {
						response = medlem.hentFraConventus(txtId.getText());

						meddelelse = medlem.parseXml(response);

						txtNavn.setText(medlem.getNavn());
						txtAdresse.setText(medlem.getAdresse());
						txtPostnummer.setText(medlem.getPostnr());
						txtBy.setText(medlem.getPostnr_by());

						btnUdskriv.setEnabled(true);
						btnUdskriv.setGrayed(false);

						txtMeddelelse.setText(meddelelse); // $NON-NLS-1$
					} catch (Exception e2) {
						e2.printStackTrace();
						txtMeddelelse.setText(meddelelse);
					}
				}
			}
		});
		btnSg.setText("&S\u00F8g"); //$NON-NLS-1$

		btnUdskriv = new Button(GscMedlemskort, SWT.NONE);
		btnUdskriv.setToolTipText("Inds\u00E6tter i Excel og sender til udskrift");
		btnUdskriv.setEnabled(false);
		btnUdskriv.setGrayed(true);
		btnUdskriv.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				txtMeddelelse.setText("Vent venligst"); //$NON-NLS-1$
				btnUdskriv.setEnabled(false);
				btnUdskriv.setGrayed(true);
				try {
					medlem.indsaetIExcel(Messages.Medlemskort_Excelfil);

					try {
						String s = medlem.udskrivPtouch(Messages.Medlemskort_Ptouch_skabelon);
						txtMeddelelse.setText(s); // $NON-NLS-1$
					} catch (Exception e2) {
						txtMeddelelse.setText(e2.getMessage());
					}
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
					txtMeddelelse.setText("Filen er låst af P-touch. Luk den og prøv igen");
				}

				btnUdskriv.setEnabled(true);
				btnUdskriv.setGrayed(false);
			}
		});
		btnUdskriv.setText(Messages.Medlemskort_btnUdskriv_text); // $NON-NLS-1$

		btnAfslut = new Button(GscMedlemskort, SWT.NONE);
		btnAfslut.setToolTipText(Messages.Medlemskort_btnAfslut_toolTipText);
		btnAfslut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.exit(0);
			}
		});
		btnAfslut.setText("&Afslut"); //$NON-NLS-1$
		GscMedlemskort.setDefaultButton(btnSg);
		new Label(GscMedlemskort, SWT.NONE);

	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		GscMedlemskort.open();
		GscMedlemskort.layout();
		while (!GscMedlemskort.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
