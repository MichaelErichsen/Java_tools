package dk.gribskovseniorcenter.medlemskort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Sortering af csv filer til print af medlemskort
 *
 * @author Michael Erichsen, 2025-2026
 */
public class Stabelsorterer {
	private static LocalResourceManager localResourceManager;
	private static Shell shlStabelsortering;
	private static Text textInputfilnavn;
	private static Text textOutputfilnavn;
	private static Text textAntal;
	private static Text textMessage;

	/**
	 * Launch the application.
	 *
	 * @param args
	 */
<<<<<<< HEAD
	public static void main(final String[] args) {
		if (args.length < 2) {
			System.out.println("Du bedes venligst skrive \"sorterstabel <inputfil> <antal kort pr. ark>\"");
			System.exit(4);
=======
	public static void main(String[] args) {
		Display display = Display.getDefault();
		shlStabelsortering = new Shell();
		createResourceManager();
		shlStabelsortering.setImage(localResourceManager.create(ImageDescriptor.createFromFile(null, "GSC.jpg")));

		shlStabelsortering.setSize(1000, 450);
		shlStabelsortering.setText("Stabelsortering");
		shlStabelsortering.setLayout(new GridLayout(4, false));

		Composite composite = new Composite(shlStabelsortering, SWT.NONE);
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1);
		gd_composite.heightHint = 155;
		composite.setLayoutData(gd_composite);

		Label lblDetteProgramKan = new Label(composite, SWT.NONE);
		lblDetteProgramKan.setLocation(0, 0);
		lblDetteProgramKan.setSize(975, 156);
		lblDetteProgramKan.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 16, SWT.BOLD)));
		lblDetteProgramKan.setText(
				"Dette program kan sortere et udtræk i komma- eller semikolonsepareret format (.csv)\r\nså det ligger i rækkefølge for en skæremaskine.\r\nDu kan vælge filer på din maskine, eller du kan indtaste filnavnet selv.\r\nDer kan kun indtastes tal i feltet med antal kort.");

		Label lblInputFil = new Label(shlStabelsortering, SWT.NONE);
		lblInputFil.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		lblInputFil.setText("Input fil");

		textInputfilnavn = new Text(shlStabelsortering, SWT.BORDER);
		textInputfilnavn.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		GridData gd_textInputfilnavn = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		gd_textInputfilnavn.widthHint = 479;
		textInputfilnavn.setLayoutData(gd_textInputfilnavn);

		Button btnVlgInput = new Button(shlStabelsortering, SWT.NONE);
		btnVlgInput.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		btnVlgInput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JFileChooser jfcInput = new JFileChooser();
				FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Komma separerede filer",
						"csv");
				jfcInput.addChoosableFileFilter(fileNameExtensionFilter);
				jfcInput.setFileFilter(fileNameExtensionFilter);
				int returnVal = jfcInput.showOpenDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = jfcInput.getSelectedFile();
					textInputfilnavn.setText(file.getAbsolutePath());
				}
			}
		});
		btnVlgInput.setText("Vælg");

		Label lblOutpufilt = new Label(shlStabelsortering, SWT.NONE);
		lblOutpufilt.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		lblOutpufilt.setText("Output fil");

		textOutputfilnavn = new Text(shlStabelsortering, SWT.BORDER);
		textOutputfilnavn.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		textOutputfilnavn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));

		Button btnVlgOutput = new Button(shlStabelsortering, SWT.NONE);
		btnVlgOutput.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		btnVlgOutput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				JFileChooser jfcOutput = new JFileChooser();
				FileNameExtensionFilter fileNameExtensionFilter = new FileNameExtensionFilter("Komma separerede filer",
						"csv");
				jfcOutput.addChoosableFileFilter(fileNameExtensionFilter);
				jfcOutput.setFileFilter(fileNameExtensionFilter);
				int returnVal = jfcOutput.showSaveDialog(null);

				if (returnVal == JFileChooser.APPROVE_OPTION) {
					File file = jfcOutput.getSelectedFile();
					textOutputfilnavn.setText(file.getAbsolutePath());
				}
			}
		});
		btnVlgOutput.setText("Vælg");

		Label lblAntalKortPr = new Label(shlStabelsortering, SWT.NONE);
		lblAntalKortPr.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		lblAntalKortPr.setText("Antal kort pr. side");

		textAntal = new Text(shlStabelsortering, SWT.BORDER);
		textAntal.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		textAntal.setText("12");
		textAntal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (Character.isISOControl(e.character)) {
					textMessage.setText("");
				} else if (!Character.isDigit(e.character)) {
					e.doit = false;
					textMessage.setText("Brug kun tal i dette felt");
				}
			}
		});
		GridData gd_textAntal = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_textAntal.widthHint = 66;
		textAntal.setLayoutData(gd_textAntal);
		new Label(shlStabelsortering, SWT.NONE);
		new Label(shlStabelsortering, SWT.NONE);
		new Label(shlStabelsortering, SWT.NONE);
		new Label(shlStabelsortering, SWT.NONE);
		new Label(shlStabelsortering, SWT.NONE);
		new Label(shlStabelsortering, SWT.NONE);

		Composite composite_1 = new Composite(shlStabelsortering, SWT.NONE);
		composite_1.setLayout(new RowLayout(SWT.HORIZONTAL));
		composite_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 4, 1));

		Button btnSortr = new Button(composite_1, SWT.NONE);
		btnSortr.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					if (textInputfilnavn.getText().isEmpty()) {
						textMessage.setText("Angiv venligst et input filnavn");
						return;
					}
					if (textOutputfilnavn.getText().isEmpty()) {
						textMessage.setText("Angiv venligst et output filnavn");
						return;
					}
					if (textAntal.getText().equals("0")) {
						textMessage.setText("Angiv venligst et antal forskelligt fra 0");
						return;
					}
					sorter(textInputfilnavn.getText(), textOutputfilnavn.getText(), textAntal.getText());
				} catch (Exception e1) {
					textMessage.setText(e1.getLocalizedMessage());
				}
			}
		});
		btnSortr.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		btnSortr.setText("Sortér");

		Button btnFortryd = new Button(composite_1, SWT.NONE);
		btnFortryd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textInputfilnavn.setText("");
				textOutputfilnavn.setText("");
				textAntal.setText("12");
				textMessage.setText("Input er ryddet");
			}
		});
		btnFortryd.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		btnFortryd.setText("Fortryd");

		Button btnLuk = new Button(composite_1, SWT.NONE);
		btnLuk.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlStabelsortering.dispose();
			}
		});
		btnLuk.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		btnLuk.setText("Luk");

		Composite composite_2 = new Composite(shlStabelsortering, SWT.NONE);
		composite_2.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		composite_2.setLayout(new RowLayout(SWT.HORIZONTAL));
		GridData gd_composite_2 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 4, 1);
		gd_composite_2.heightHint = 32;
		gd_composite_2.widthHint = 974;
		composite_2.setLayoutData(gd_composite_2);

		textMessage = new Text(composite_2, SWT.BORDER);
		textMessage.setFont(localResourceManager.create(FontDescriptor.createFrom("Segoe UI", 12, SWT.NORMAL)));
		textMessage.setEnabled(false);
		textMessage.setEditable(false);
		textMessage.setLayoutData(new RowData(959, SWT.DEFAULT));

		shlStabelsortering.open();
		shlStabelsortering.layout();
		while (!shlStabelsortering.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
>>>>>>> a9633991be9018f1f407f699104d531c5d98371d
		}
	}

	/**
	 * Font support
	 */
	private static void createResourceManager() {
		localResourceManager = new LocalResourceManager(JFaceResources.getResources(), shlStabelsortering);
	}

	/**
	 * Sorteringsrutine
	 * 
	 * @param input
	 * @param output
	 * @param antal
	 * @throws Exception
	 */
<<<<<<< HEAD

	private void execute(final String[] args) throws Exception {
		int kortPrArk = Integer.parseInt(args[1]);
=======
	private static void sorter(String input, String output, String antal) throws Exception {
		int kortPrArk = Integer.parseInt(antal);
>>>>>>> a9633991be9018f1f407f699104d531c5d98371d

		final List<String> listOfStrings = new ArrayList<>();
		final var br = new BufferedReader(new FileReader(input));

		// Sorter ikke første linie, som er header
		final var headerLine = br.readLine();

		// Find csv separator fra headerlinjen
		final var csvSeparator = findCsvSeparator(headerLine);

		// Dan en tom linie til senere brug
		final var c = csvSeparator.charAt(0);
		final var count = headerLine.chars().filter(ch -> ch == c).count();

		final var sb = new StringBuilder("Void");

		for (int i = 0; i < count; i++) {
			sb.append(csvSeparator + "Void");
		}

		String tomLinje = sb.toString();
		var line = br.readLine();

		while (line != null) {
			final var behandleLinie = behandleLinie(line, csvSeparator);
			listOfStrings.add(behandleLinie);
			line = br.readLine();
		}

		br.close();

		final double size = listOfStrings.size();
		final var ark = Math.ceil(size / kortPrArk);
		final var maxSize = ark * kortPrArk;
		textMessage.setText("Sorterer " + input + "til " + output);

		final var bw = new BufferedWriter(new FileWriter(output));
		bw.append(headerLine);
		bw.newLine();

		for (var i = 0; i < ark; i++) {
			for (var j = 0; j < maxSize; j += ark) {
				if (i + j < size) {
					bw.append(listOfStrings.get(i + j));
				} else {
					// Udfyld tomme linjer
					bw.append(tomLinje);
				}

				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

		textMessage.setText("Sortering af " + (int) size + " medlemskort på " + (int) ark + " ark med " + kortPrArk
				+ " kort på hvert afsluttet.");
	}

	/**
	 * Find filens separatortegn
	 * 
	 * @param headerLine
	 * @return
	 * @throws Exception
	 */
	private static String findCsvSeparator(final String headerLine) throws Exception {
		if (headerLine.contains(";")) {
			return ";";
		}

		if (headerLine.contains(",")) {
			return ",";
		}

		if (headerLine.contains("\t")) {
			return "\t";
		}

		throw new Exception("Fandt hverken semikolon, kolon eller tabulatortegn i første linje. Er det en .csv fil?");
	}

<<<<<<< HEAD
}
=======
	/**
	 * Hvis der står noget i fjerde kolonne, som antages at være adresse2, klistres
	 * det ind i 3. kolonne med ", " imellem
	 *
	 * @param line
	 * @return
	 */
	private static String behandleLinie(final String line, final String csvSeparator) {
		final var split = line.split(csvSeparator);

//		if (!split[3].isEmpty()) {
//			split[2] = split[2] + ", " + split[3];
//			split[3] = "";
//			return String.join(csvSeparator, split);
//		}

		return line;
	}
}
>>>>>>> a9633991be9018f1f407f699104d531c5d98371d
