package net.myerichsen.PolRegBlade;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;
import java.awt.Insets;
import net.myerichsen.PolRegBlade.GedcomFil;

/**
 * Denne klasse er brugergrænseflade for en applikation, der kan screen-scrape
 * Politiets Registerblade og gemme data som en GEDCOM-fil
 * 
 * @author Michael Erichsen
 * @version 1.3.1 19/05/2011
 * 
 * Fixes:
 * 
 * 21.05.2011 Ikon tilføjet
 * 
 * 19.05.2011 "Frameldt til" håndteret
 * 
 * 15.05.2011 Version som final variabel
 * 
 * 12.05.2011 Håndtering af børns køn
 * 
 * 10.05.2011 Løst abend ved ægtefælle uden fødselsdato
 * 
 * 09.05.2011 Ændret dato format fra 6-11-1864 til 6 NOV 1864
 * 
 * 28.04.2011 Start programmet midt på skærmen
 * 
 * 24.04.2011 Java stack trace tilføjet tekst
 * 
 * 24.04.2011 Exception ved manglende adresser løst
 * 
 * 24.04.2011 (født xxx) håndteret ved at indsætte både gift navn og fødenavn
 * 
 * 24.04.2011 Dobbelt FAMC tag for børn løst
 * 
 * 22.04.2011 Fejl ved kun hovedperson, men ingen ægtefæller og børn, rettet
 * 
 * 18.04.2011 Mulighed for at samle flere registerblade i samme GEDCOM fil
 * 
 * 09.04.2011 Sessionsobjekt til at gemme properties
 * 
 * 09.04.2011 Parameter jDialog til parametre
 * 
 * 08.04.2011 Ny about-box
 * 
 * 07.04.2011 Fra og til delt på datoer før og på
 * 
 * 07.04.2011 Dødsdato tilføjet
 * 
 * 07.04.2011 Gemmer directory i properties fil
 * 
 * 07.04.2011 Kilde tilføjet til steder
 * 
 * 07.04.2011 Output i ANSEL-format
 * 
 * 07.04.2011 Output fil eller stack trace vises i vinduet
 * 
 * 07.04.2011 Scroll i vinduet
 * 
 */
public class PolReg2Ged {
	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				final PolReg2Ged application = new PolReg2Ged();
				application.getJFrame().setVisible(true);
			}
		});
	}

	/**
	 * Programmets version
	 */
	final private String PolReg2GedVersion = "1.3.1"; // @jve:decl-index=0:

	private JFrame jFrame = null; // @jve:decl-index=0:visual-constraint="37,10"

	private JPanel jContentPane = null;

	private JMenuBar jJMenuBar = null;

	private JMenu fileMenu = null;

	private JMenu editMenu = null;

	private JMenu helpMenu = null;

	private JMenuItem exitMenuItem = null;

	private JMenuItem aboutMenuItem = null;

	private JMenuItem pasteMandMenuItem = null;

	private JMenuItem saveMenuItem = null;

	private JTextPane raatextjTextPane = null;

	private JScrollPane textjScrollPane = null;

	private JDialog indstillingerjDialog = null; // @jve:decl-index=0:visual-constraint="560,175"

	private JPanel pastejContentPane = null;

	private JPanel pasteFeltjPanel = null;

	private JLabel appendjLabel = null;

	private JCheckBox appendjCheckBox = null;

	private JButton pasteOKjButton = null;

	private JLabel cphjLabel = null;

	private Session aSession = null;

	private JTextField kbhvnjTextField = null;

	private JMenuItem pasteKvindejMenuItem = null;

	private JMenuItem indstillingerjMenuItem = null;

	/**
	 * Gedcomfil med et antal registerblade
	 */
	private GedcomFil aGedcomFil; // @jve:decl-index=0:

	/**
	 * 
	 */
	public PolReg2Ged() {
		aSession = Session.getSession();
		aSession.hentFraProperties();
	}

	/**
	 * @throws HeadlessException
	 * @throws PolRegException
	 */
	private void gemGedcomFil() throws PolRegException {
		final JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Vælg bibliotek til at gemme GEDCOM fil i");
		fc.setFileFilter(new GedFileFilter());
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		String gcDirectory = aSession.getGcDirectory();
		fc.setCurrentDirectory(new File(gcDirectory));
		File gedcomFileName;

		try {
			gedcomFileName = new File(getAGedcomFil().getRegisterBlade().get(0)
					.getHovedPerson().getTrimmedNavn()
					+ ".ged");

		} catch (final RuntimeException e1) {
			throw new PolRegException(e1);
		}

		fc.setSelectedFile(gedcomFileName);

		if (fc.showSaveDialog(getJFrame()) == JFileChooser.APPROVE_OPTION) {

			try {
				gcDirectory = fc.getCurrentDirectory().getAbsolutePath();
				gedcomFileName = fc.getSelectedFile();
				getAGedcomFil().udskriv(gedcomFileName, getPolReg2GedVersion());
				aSession.setGcDirectory(gcDirectory);
			} catch (final PolRegException e) {
				printStackTraceToWindow(e);
			}
			getRaatextjTextPane().setText(
					"GEDCOM fil er gemt som "
							+ gedcomFileName
							+ "\n\n"
							+ getAGedcomFil().hentGedcomTilVindue(
									gedcomFileName));
		}
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getAboutMenuItem() {
		if (aboutMenuItem == null) {
			aboutMenuItem = new JMenuItem();
			aboutMenuItem.setText("Om...");
			aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
					Event.CTRL_MASK, true));
			aboutMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					JOptionPane
							.showMessageDialog(
									jFrame,
									"PolReg2Ged,\n"
											+ "Michael Erichsen, Maj 2011, Version "
											+ PolReg2GedVersion
											+ ".\n\n"
											+ "Screen-scraping fra Politiets Registerblade, "
											+ "http://www.politietsregisterblade.dk, og "
											+ "konvertering til GEDCOM-fil.\n\n"
											+ "Dette program kan omsætte teksten i Politiets Registerblade til en "
											+ "GEDCOM-fil, der kan importeres af de fleste\n"
											+ "slægtsforskningsprogrammer. \n\n"
											+ "Find den ønskede side i Politiets registerblade og marker teksten "
											+ "til højre på skærmen og kopier til klippebordet. \n\n"
											+ "I dette program vælger du Rediger og derefter Sæt ind som Mand "
											+ "eller Kvinde. \n\n"
											+ "Børns første fornavn gemmes sammen med det angivne køn i filen PolReg2Ged.properties, "
											+ "hvor det evt. kan rettes eller slettes.\n\n"
											+ "Hovedpersoners og ægtefællers køn gemmes automatisk i samme fil, så programmet "
											+ "efterhånden selv kan angive køn.\n\n"
											+ "Du kan vælge, hvor den dannede GEDCOM-fil skal lægges, "
											+ "og du kan derefter importere den til dit eget\n"
											+ "slægtsforskningsprogram. \n\n"
											+ "Under indstillinger kan du vælge, om du vil samle de indkopierede "
											+ "registerblade til en samlet GEDCOM fil, og du kan tilrette,\n"
											+ "hvordan adresser skal gemmes i GEDCOM-filen for at passe til din "
											+ "egen opsætning\n\n"
											+ "Programmet er udviklet af Michael Erichsen i 2011 "
											+ "og kan frit anvendes og videregives. \n\n"
											+ "ANSEL-tegn-konvertering anvender ANSELCharset pakken, "
											+ "Copyright (C) 2010 Piotr Andzel\n\n"
											+ "Indpakket som eksekverbart Windows-program med Launch4j, "
											+ "Copyright (C) 2004-2011, Grzegorz Kowal",
									"Om", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return aboutMenuItem;
	}

	/**
	 * @return the aGedcomFil
	 */
	public GedcomFil getAGedcomFil() {
		if (aGedcomFil == null) {
			aGedcomFil = new GedcomFil();
		}
		return aGedcomFil;
	}

	/**
	 * This method initializes appendjCheckBox
	 * 
	 * @return javax.swing.JCheckBox
	 */
	private JCheckBox getAppendjCheckBox() {
		if (appendjCheckBox == null) {
			appendjCheckBox = new JCheckBox();
			appendjCheckBox.setSelected(aSession.isAppend());
		}
		return appendjCheckBox;
	}

	/**
	 * Get the String residing on the clipboard.
	 * 
	 * @return any text found on the Clipboard; if none found, return an empty
	 *         String.
	 */
	@SuppressWarnings("null")
	public String getClipboardContents() {
		String result = "";
		final Clipboard clipboard = Toolkit.getDefaultToolkit()
				.getSystemClipboard();
		// odd: the Object param of getContents is not currently used
		final Transferable contents = clipboard.getContents(null);
		final boolean hasTransferableText = (contents != null)
				&& contents.isDataFlavorSupported(DataFlavor.stringFlavor);
		if (hasTransferableText) {
			try {
				result = (String) contents
						.getTransferData(DataFlavor.stringFlavor);
			} catch (final UnsupportedFlavorException ex) {
				// highly unlikely since we are using a standard DataFlavor
				System.out.println(ex);
				ex.printStackTrace();
			} catch (final IOException ex) {
				System.out.println(ex);
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getEditMenu() {
		if (editMenu == null) {
			editMenu = new JMenu();
			editMenu.setText("Rediger");
			editMenu.add(getPasteMandMenuItem());
			editMenu.add(getPasteKvindejMenuItem());
			editMenu.addSeparator();
			editMenu.add(getIndstillingerjMenuItem());
		}
		return editMenu;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getExitMenuItem() {
		if (exitMenuItem == null) {
			exitMenuItem = new JMenuItem();
			exitMenuItem.setText("Afslut");
			exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
					Event.CTRL_MASK, true));
			exitMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					saveAndExit();
				}
			});
		}
		return exitMenuItem;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getFileMenu() {
		if (fileMenu == null) {
			fileMenu = new JMenu();
			fileMenu.setText("Filer");
			fileMenu.add(getSaveMenuItem());
			fileMenu.addSeparator();
			fileMenu.add(getExitMenuItem());

		}
		return fileMenu;
	}

	/**
	 * This method initializes jMenu
	 * 
	 * @return javax.swing.JMenu
	 */
	private JMenu getHelpMenu() {
		if (helpMenu == null) {
			helpMenu = new JMenu();
			helpMenu.setText("Hjælp");
			helpMenu.add(getAboutMenuItem());
		}
		return helpMenu;
	}

	/**
	 * This method initializes indstillingerjDialog
	 * 
	 * @return javax.swing.JDialog
	 */
	private JDialog getIndstillingerjDialog() {
		if (indstillingerjDialog == null) {
			indstillingerjDialog = new JDialog(getJFrame());
			indstillingerjDialog.setSize(new Dimension(309, 160));
			indstillingerjDialog.setTitle("Indstillinger");
			indstillingerjDialog.setContentPane(getPastejContentPane());
			indstillingerjDialog.pack();
			indstillingerjDialog.setVisible(true);
		}
		return indstillingerjDialog;
	}

	/**
	 * This method initializes indstillingerjMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getIndstillingerjMenuItem() {
		if (indstillingerjMenuItem == null) {
			indstillingerjMenuItem = new JMenuItem();
			indstillingerjMenuItem.setText("Indstillinger...");
			indstillingerjMenuItem.setAccelerator(KeyStroke.getKeyStroke(
					KeyEvent.VK_I, Event.CTRL_MASK, true));
			indstillingerjMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					getIndstillingerjDialog();
				}
			});

		}
		return indstillingerjMenuItem;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getTextjScrollPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/net/myerichsen/PolRegBlade/PolReg2Ged.jpg")));
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setSize(800, 516);
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Politiets registerblade til GEDCOM");

			// Get the size of the screen
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

			// Determine the new location of the window
			int w = jFrame.getSize().width;
			int h = jFrame.getSize().height;
			int x = (dim.width - w) / 2;
			int y = (dim.height - h) / 2;

			// Move the window
			jFrame.setLocation(x, y);
		}
		return jFrame;
	}

	/**
	 * This method initializes jJMenuBar
	 * 
	 * @return javax.swing.JMenuBar
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getFileMenu());
			jJMenuBar.add(getEditMenu());
			jJMenuBar.add(getHelpMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes kbhvnjTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getKbhvnjTextField() {
		if (kbhvnjTextField == null) {
			kbhvnjTextField = new JTextField();
			kbhvnjTextField.setText(aSession.getKoebenhavn());
		}
		return kbhvnjTextField;
	}

	/**
	 * This method initializes pasteFeltjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPasteFeltjPanel() {
		if (pasteFeltjPanel == null) {
			final GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.fill = GridBagConstraints.BOTH;
			gridBagConstraints12.gridy = 3;
			gridBagConstraints12.weightx = 1.0;
			gridBagConstraints12.gridwidth = 2;
			gridBagConstraints12.insets = new Insets(0, 0, 0, 6);
			gridBagConstraints12.gridx = 1;
			final GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 0;
			gridBagConstraints4.gridwidth = 1;
			gridBagConstraints4.anchor = GridBagConstraints.WEST;
			gridBagConstraints4.insets = new Insets(0, 6, 0, 6);
			gridBagConstraints4.ipadx = 1;
			gridBagConstraints4.ipady = 1;
			gridBagConstraints4.gridy = 3;
			cphjLabel = new JLabel();
			cphjLabel.setText("Tilføjelse til stednavne");
			final GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 1;
			gridBagConstraints21.insets = new Insets(10, 0, 0, 0);
			gridBagConstraints21.gridy = 5;
			final GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 2;
			gridBagConstraints11.gridy = 1;
			final GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.anchor = GridBagConstraints.WEST;
			gridBagConstraints3.gridwidth = 2;
			gridBagConstraints3.insets = new Insets(0, 6, 0, 0);
			gridBagConstraints3.ipadx = 1;
			gridBagConstraints3.ipady = 1;
			gridBagConstraints3.gridy = 1;
			appendjLabel = new JLabel();
			appendjLabel.setText("Tilføj bladet til tidligere blade?");
			pasteFeltjPanel = new JPanel();
			pasteFeltjPanel.setLayout(new GridBagLayout());
			pasteFeltjPanel.add(appendjLabel, gridBagConstraints3);
			pasteFeltjPanel.add(getAppendjCheckBox(), gridBagConstraints11);
			pasteFeltjPanel.add(cphjLabel, gridBagConstraints4);
			pasteFeltjPanel.add(getKbhvnjTextField(), gridBagConstraints12);
			pasteFeltjPanel.add(getPasteOKjButton(), gridBagConstraints21);
		}
		return pasteFeltjPanel;
	}

	/**
	 * This method initializes pastejContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getPastejContentPane() {
		if (pastejContentPane == null) {
			pastejContentPane = new JPanel();
			pastejContentPane.setLayout(new BorderLayout());
			pastejContentPane.add(getPasteFeltjPanel(), BorderLayout.CENTER);
		}
		return pastejContentPane;
	}

	/**
	 * This method initializes pasteKvindejMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getPasteKvindejMenuItem() {
		if (pasteKvindejMenuItem == null) {
			pasteKvindejMenuItem = new JMenuItem();
			pasteKvindejMenuItem.setText("Sæt ind som kvinde");
			pasteKvindejMenuItem.setAccelerator(KeyStroke.getKeyStroke(
					KeyEvent.VK_K, Event.CTRL_MASK, true));
			pasteKvindejMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					try {
						readFromClipboard();
						getAGedcomFil().parse(Koen.F, getJFrame());
					} catch (final PolRegException e1) {
						printStackTraceToWindow(e1);
					}
				}
			});
		}
		return pasteKvindejMenuItem;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getPasteMandMenuItem() {
		if (pasteMandMenuItem == null) {
			pasteMandMenuItem = new JMenuItem();
			pasteMandMenuItem.setText("Sæt ind som mand");
			pasteMandMenuItem.setAccelerator(KeyStroke.getKeyStroke(
					KeyEvent.VK_M, Event.CTRL_MASK, true));
			pasteMandMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					try {
						readFromClipboard();
						getAGedcomFil().parse(Koen.M, getJFrame());
					} catch (final PolRegException e1) {
						printStackTraceToWindow(e1);
					}
				}
			});
		}
		return pasteMandMenuItem;
	}

	/**
	 * This method initializes pasteOKjButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getPasteOKjButton() {
		if (pasteOKjButton == null) {
			pasteOKjButton = new JButton();
			pasteOKjButton.setText("OK");
			pasteOKjButton
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(
								final java.awt.event.ActionEvent e) {
							aSession.setAppend(getAppendjCheckBox()
									.isSelected());
							aSession.setKoebenhavn(getKbhvnjTextField()
									.getText());
							aSession.gemIProperties();
							getIndstillingerjDialog().dispose();
						}
					});
		}
		return pasteOKjButton;
	}

	/**
	 * @return the polReg2GedVersion
	 */
	public String getPolReg2GedVersion() {
		return PolReg2GedVersion;
	}

	/**
	 * This method initializes raatextjTextPane
	 * 
	 * @return javax.swing.JTextPane
	 */
	private JTextPane getRaatextjTextPane() {
		if (raatextjTextPane == null) {
			raatextjTextPane = new JTextPane();
			raatextjTextPane.setEditable(false);
			raatextjTextPane
					.setText("Dette program kan omsætte teksten i Politiets Registerblade til en GEDCOM-fil,"
							+ "der kan importeres af de fleste slægtsforskningsprogrammer. \n\n"
							+ "Find den ønskede side i Politiets registerblade. "
							+ "Marker teksten til højre på skærmen og kopier til klippebordet. \n\n"
							+ "I dette program vælger du Rediger og derefter Sæt ind som Mand eller Kvinde. \n\n"
							+ "Børns første fornavn gemmes sammen med det angivne køn i filen PolReg2Ged.properties, "
							+ "hvor det evt. kan rettes eller slettes.\n\n"
							+ "Hovedpersoners og ægtefællers køn gemmes automatisk i samme fil, så programmet "
							+ "efterhånden selv kan angive køn.\n\n"
							+ "Du kan vælge, hvor den dannede GEDCOM-fil skal lægges, "
							+ "og du kan derefter importere den til dit eget slægtsforskningsprogram. \n\n"
							+ "Under indstillinger kan du vælge, om du vil samle de indkopierede "
							+ "registerblade til en samlet GEDCOM fil, og du kan tilrette, hvordan adresser "
							+ "skal gemmes i GEDCOM-filen for at passe til din egen opsætning\n\n"
							+ "Programmet er udviklet af Michael Erichsen i 2011 og kan frit anvendes og videregives.");
		}
		return raatextjTextPane;
	}

	/**
	 * This method initializes jMenuItem
	 * 
	 * @return javax.swing.JMenuItem
	 */
	private JMenuItem getSaveMenuItem() {
		if (saveMenuItem == null) {
			saveMenuItem = new JMenuItem();
			saveMenuItem.setText("Gem som gedcom...");
			saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,
					Event.CTRL_MASK, true));
			saveMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					try {
						gemGedcomFil();
					} catch (final PolRegException e1) {
						printStackTraceToWindow(e1);
					}
				}
			});
		}
		return saveMenuItem;
	}

	/**
	 * This method initializes textjScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getTextjScrollPane() {
		if (textjScrollPane == null) {
			textjScrollPane = new JScrollPane();
			textjScrollPane.setViewportView(getRaatextjTextPane());
		}
		return textjScrollPane;
	}

	/**
	 * @param e1
	 * @throws IOException
	 */
	private void printStackTraceToWindow(final PolRegException e1) {
		try {
			// TODO Remove after test
			e1.printStackTrace();

			final StringWriter sw = new StringWriter();
			final PrintWriter pw = new PrintWriter(sw);
			e1.printStackTrace(pw);
			final StringBuffer sb = new StringBuffer(sw.toString());
			sb.append("\n------------------------------------");
			sb.append("------------------------------------");
			sb.append("------------------------------------");
			sb.append("\n\nDer er desværre opstået en fejl i programmet. ");
			sb.append("Du bedes sende ovenstående fejlmeddelelse ");
			sb.append("sammen med teksten fra det Registerblad, ");
			sb.append("programmet ikke har kunnet ");
			sb.append("håndtere, til michael@myerichsen.net");
			getRaatextjTextPane().setText(sb.toString());
			sw.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	private void readFromClipboard() {
		final String clipboardContents = getClipboardContents();

		getAGedcomFil().setInputText(clipboardContents);

		getRaatextjTextPane().setText(clipboardContents);
	}

	/**
	 * Save properties file and exit cleanly
	 */
	private void saveAndExit() {
		aSession.gemIProperties();

		System.exit(0);
	}

	/**
	 * @param gedcomFil
	 *            the aGedcomFil to set
	 */
	public void setAGedcomFil(final GedcomFil gedcomFil) {
		aGedcomFil = gedcomFil;
	}
}
