package dk.gribskovseniorcenter.medlemskort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
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
 * Omsortering af csv filer til print af medlemskort, så at de kan skæres i
 * sorterede stabler
 *
 * @author Michael Erichsen, 2025-2026
 */
public class Stabelsorterer {
	private static LocalResourceManager localResourceManager;
	private static Shell shlStabelsortering;
	private static Text textAntal;
	private static Text textInputfilnavn;
	private static Text textMessage;
	private static Text textOutputfilnavn;

	/**
	 * Font support
	 */
	private static void createResourceManager() {
		localResourceManager = new LocalResourceManager(JFaceResources.getResources(), shlStabelsortering);
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

	/**
	 * Launch the application.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		shlStabelsortering = new Shell();
		createResourceManager();
		shlStabelsortering.setMinimumSize(new Point(1000, 450));

		shlStabelsortering.setSize(1000, 457);
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
		lblDetteProgramKan.setText("Dette program kan sortere et udtræk i komma- eller semikolonsepareret\r\n"
				+ "format (.csv), så det ligger i rækkefølge for en skæremaskine.\r\n"
				+ "Du kan vælge filer på din maskine, eller du kan indtaste filnavnet selv.\r\n"
				+ "Der kan kun indtastes tal i feltet med antal kort.");

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

					regulerfilnavn();

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
				textMessage.setText("Input er ryddet, og antal sat tilbage til 12");
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
		}
	}

	/**
	 * Sørg for at filnavn er fuldt, har rigtig extension og ikke allerede
	 * eksisterer
	 *
	 * @throws Exception
	 */
	private static void regulerfilnavn() throws Exception {
		String filnavn = textOutputfilnavn.getText();
		String outputfil = null;

		Path path = Paths.get(filnavn);

		if (!filnavn.endsWith(".csv")) {
			path = Paths.get(filnavn + ".csv");
		}

		if (!path.isAbsolute()) {
			Path inputPath = Paths.get(textInputfilnavn.getText());
			String parent = inputPath.getParent().toString();
			outputfil = parent + "/" + path;
		} else {
			outputfil = path.toString();
		}

		textOutputfilnavn.setText(outputfil);

		File file = new File(outputfil);

		if (file.exists()) {
			throw new Exception("Denne fil findes allerede. Slet, flyt eller omdøb den.");
		}

		if (file.isDirectory()) {
			throw new Exception("Dette er ikke en fil, men en folder. Vælg et andet navn.");
		}
	}

	/**
	 * Sorteringsrutine
	 *
	 * @param input
	 * @param output
	 * @param antal
	 * @throws Exception
	 */
	private static void sorter(String input, String output, String antal) throws Exception {
		int kortPrArk = Integer.parseInt(antal);

		final List<String> listOfStrings = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(input));

		// Sorter ikke første linie, som er header
		String headerLine = br.readLine();

		// Find csv separator fra headerlinjen
		String csvSeparator = findCsvSeparator(headerLine);

		// Dan en tom linie til senere brug
		char c = csvSeparator.charAt(0);
		long count = headerLine.chars().filter(ch -> ch == c).count();

		StringBuilder sb = new StringBuilder("Void");

		for (int i = 0; i < count; i++) {
			sb.append(csvSeparator + "Void");
		}

		String tomLinje = sb.toString();
		String line = br.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}

		br.close();

		int size = listOfStrings.size();
		double ark = Math.ceil(size / kortPrArk);
		int maxSize = (int) ark * kortPrArk;
		textMessage.setText("Sorterer " + input + "til " + output);

		BufferedWriter bw = new BufferedWriter(new FileWriter(output));
		bw.append(headerLine);
		bw.newLine();

		for (int i = 0; i < ark; i++) {
			for (int j = 0; j < maxSize; j += ark) {
				if (i + j < size) {
					bw.append(listOfStrings.get(i + j));
				} else {
					bw.append(tomLinje);
				}

				bw.newLine();
			}
		}

		bw.flush();
		bw.close();

		textMessage.setText("Sortering af " + size + " medlemskort på " + (int) ark + " ark med " + kortPrArk
				+ " kort på hvert afsluttet.");
	}

}
