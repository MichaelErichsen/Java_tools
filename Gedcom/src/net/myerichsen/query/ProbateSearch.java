package net.myerichsen.query;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.text.MaskFormatter;

import net.myerichsen.dbutil.SqlConstants;
import net.myerichsen.fonkod.Fonkod;
import java.awt.event.KeyEvent;

/**
 * @author Michael Erichsen
 *         <p>
 *         Class to search probate extracts in a database created by UIMA
 *         analysis of extracted probates.
 *         <p>
 *         05. 05. 2013 Vendsyssel added <br>
 *         03. 05. 2013 Bornholm added <br>
 *         23. 04. 2013 Kurt Kermit added <br>
 *         06. 01. 2012 Søgning kun på efternavn <br>
 *         10. 12. 2011 Ændret fonetisk søgning til LIKE <br>
 *         12. 12. 2011 resetFields rydder også resultattabellen <br>
 *         13. 12. 2011 Ændringer i fonetisk søgning
 */

public class ProbateSearch {
	/**
	 * Specialized Table Model to prevent cell editing
	 */
	public class MyDefaultTableModel extends DefaultTableModel {

		private static final long serialVersionUID = -1344850776008836209L;

		/**
		 * No-arg c:tor
		 */
		public MyDefaultTableModel() {
			super();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see javax.swing.table.DefaultTableModel#isCellEditable(int, int)
		 */
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	}

	private static final String ABOUT_TEXT = "Version 1.2\n"
			+ "Michael Erichsen, 05. 05. 2013\n\n"
			+ "Dette program søger i skifteuddrag\n"
			+ "ud fra navne, årstal og steder.\n"
			+ "Navne søges både efter ordlyd, efter\n"
			+ "sidste del af navnet og fonetisk.\n"
			+ "% er også tilladt i stednavne.\n\n"
			+ "Skifteuddrag er udtrukket fra Erik Brejl,\n" + "Asger Bruun,\n"
			+ "Jens E. Caspersen,\n" + "John G. Christensen,\n"
			+ "Aurelia Clemons,\n" + "Kurt Kermit Nielsen,\n"
			+ "Erik Reinert Nielsen\n" + "og Sørensen & Helseby.";

	private static final String CURRENT_SQLID = "SET CURRENT SQLID = GEDCOM";
	private static Connection conn = null; // @jve:decl-index=0:
	private static final Vector<String> colNames = new Vector<String>(5); // @jve:decl-index=0:

	protected static void initialize() {
		Statement st;

		try {
			Class.forName(SqlConstants.DBDRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(16);
		}

		try {
			conn = DriverManager.getConnection(SqlConstants.DBNAMET);
			st = conn.createStatement();
			st.execute(CURRENT_SQLID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Main method
	 * <p>
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ProbateSearch application = new ProbateSearch();
				application.getJFrame().setVisible(true);
				initialize();
			}
		});
	}

	private MyDefaultTableModel model = new MyDefaultTableModel();

	private JFrame jFrame = null; // @jve:decl-index=0:visual-constraint="10,10"

	private JPanel jContentPane = null;

	private JMenuBar jJMenuBar = null;

	private JMenu fileMenu = null;

	private JMenu helpMenu = null;
	private JMenuItem exitMenuItem = null;
	private JMenuItem aboutMenuItem = null;
	private JDialog aboutDialog = null;
	private JPanel aboutContentPane = null;
	private JPanel buttonjPanel = null;
	private JButton OKjButton = null;
	private JButton FonOKjButton = null;
	private JPanel mainjPanel = null;
	private JLabel namejLabel = null;
	private JTextField namejTextField = null;
	private JLabel datesjLabel = null;
	private JTextField fromdatejTextField = null;
	private JTextField todatejTextField = null;
	private JScrollPane resultsjScrollPane = null;
	private JTable resultsjTable = null;
	private JButton canceljButton = null;
	private JButton resetjButton = null;
	private JLabel placejLabel = null;
	private JTextField placejTextField = null;
	private JTextField messagejTextField = null;
	private JTextArea aboutjTextArea = null;
	private JDialog probatejDialog = null; // @jve:decl-index=0:visual-constraint="111,460"
	private JPanel probatejContentPane1 = null;
	private JPanel probateMainjPanel = null;
	private JPanel probateButtonjPanel = null;
	private JButton probateOKjButton = null;
	private JTextArea probatejTextArea = null;
	private JPanel aboutTextjPanel = null;
	private JPanel aboutButtonjPanel = null;
	private JButton aboutOkjButton = null;
	private JButton SurnameOKjButton = null;
	private JButton SurnameFonjButton = null;
	private JLabel extractjLabel = null;

	private JTextField extractjTextField = null;

	/**
	 * Method to resize column widths to their data
	 * <p>
	 * 
	 * @param table
	 * @param model
	 * @return JTable
	 */
	private JTable autoResizeColWidth(JTable table, DefaultTableModel model) {
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setModel(model);

		int margin = 5;

		for (int i = 0; i < table.getColumnCount(); i++) {
			int vColIndex = i;
			DefaultTableColumnModel colModel = (DefaultTableColumnModel) table
					.getColumnModel();
			TableColumn col = colModel.getColumn(vColIndex);
			int width = 0;

			// Get width of column header
			TableCellRenderer renderer = col.getHeaderRenderer();

			if (renderer == null) {
				renderer = table.getTableHeader().getDefaultRenderer();
			}

			Component comp = renderer.getTableCellRendererComponent(table,
					col.getHeaderValue(), false, false, 0, 0);

			width = comp.getPreferredSize().width;

			// Get maximum width of column data
			for (int r = 0; r < table.getRowCount(); r++) {
				renderer = table.getCellRenderer(r, vColIndex);
				comp = renderer.getTableCellRendererComponent(table,
						table.getValueAt(r, vColIndex), false, false, r,
						vColIndex);
				width = Math.max(width, comp.getPreferredSize().width);
			}

			// Add margin
			width += 2 * margin;

			// Set the width
			col.setPreferredWidth(width);
		}

		((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
				.setHorizontalAlignment(SwingConstants.LEFT);

		// table.setAutoCreateRowSorter(true);
		table.getTableHeader().setReorderingAllowed(false);

		return table;
	}

	/**
	 * This method initializes aboutButtonjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutButtonjPanel() {
		if (aboutButtonjPanel == null) {
			aboutButtonjPanel = new JPanel();
			aboutButtonjPanel.setLayout(new GridBagLayout());
			aboutButtonjPanel
					.add(getAboutOkjButton(), new GridBagConstraints());
		}
		return aboutButtonjPanel;
	}

	/**
	 * This method initializes aboutContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutContentPane() {
		if (aboutContentPane == null) {
			aboutContentPane = new JPanel();
			aboutContentPane.setLayout(new BorderLayout());
			aboutContentPane.add(getAboutTextjPanel(), BorderLayout.CENTER);
			aboutContentPane.add(getAboutButtonjPanel(), BorderLayout.SOUTH);
		}
		return aboutContentPane;
	}

	/**
	 * This method initializes aboutDialog
	 * 
	 * @return javax.swing.JDialog
	 */
	private JDialog getAboutDialog() {
		if (aboutDialog == null) {
			aboutDialog = new JDialog(getJFrame(), true);
			aboutDialog.setTitle("Om");
			aboutDialog.setContentPane(getAboutContentPane());
		}
		return aboutDialog;
	}

	/**
	 * This method initializes aboutjTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getAboutjTextArea() {
		if (aboutjTextArea == null) {
			aboutjTextArea = new JTextArea();
			aboutjTextArea.setText(ABOUT_TEXT);
			aboutjTextArea.setMargin(new Insets(16, 16, 16, 16));
		}
		return aboutjTextArea;
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
			aboutMenuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JDialog aboutDialog = getAboutDialog();
					aboutDialog.pack();
					Point loc = getJFrame().getLocation();
					loc.translate(20, 20);
					aboutDialog.setLocation(loc);
					aboutDialog.setVisible(true);
				}
			});
		}
		return aboutMenuItem;
	}

	/**
	 * This method initializes aboutOkjButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getAboutOkjButton() {
		if (aboutOkjButton == null) {
			aboutOkjButton = new JButton();
			aboutOkjButton.setText("OK");
			aboutOkjButton.setMnemonic(KeyEvent.VK_UNDEFINED);
			aboutOkjButton
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							getAboutDialog().dispose();
						}
					});
		}
		return aboutOkjButton;
	}

	/**
	 * This method initializes aboutTextjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutTextjPanel() {
		if (aboutTextjPanel == null) {
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.fill = GridBagConstraints.BOTH;
			gridBagConstraints10.weighty = 1.0;
			gridBagConstraints10.weightx = 1.0;
			aboutTextjPanel = new JPanel();
			aboutTextjPanel.setLayout(new GridBagLayout());
			aboutTextjPanel.add(getAboutjTextArea(), gridBagConstraints10);
		}
		return aboutTextjPanel;
	}

	/**
	 * This method initializes buttonjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getButtonjPanel() {
		if (buttonjPanel == null) {
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.gridy = 1;
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 1;
			gridBagConstraints6.gridy = 0;
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 1;
			gridBagConstraints8.gridy = 1;
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.gridx = 2;
			gridBagConstraints9.gridy = 0;
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints9.gridx = 2;
			gridBagConstraints9.gridy = 1;
			buttonjPanel = new JPanel();
			buttonjPanel.setLayout(new GridBagLayout());
			buttonjPanel.add(getOKjButton(), new GridBagConstraints());
			buttonjPanel.add(getFonOKjButton(), gridBagConstraints6);
			buttonjPanel.add(getSurnameOKjButton(), gridBagConstraints7);
			buttonjPanel.add(getSurnameFonjButton(), gridBagConstraints8);
			buttonjPanel.add(getResetjButton(), gridBagConstraints9);
			buttonjPanel.add(getCanceljButton(), gridBagConstraints10);
		}
		return buttonjPanel;
	}

	/**
	 * This method initializes canceljButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getCanceljButton() {
		if (canceljButton == null) {
			canceljButton = new JButton();
			canceljButton.setText("Afslut");
			canceljButton.setMnemonic(KeyEvent.VK_A);
			canceljButton
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							terminate();
						}
					});
		}
		return canceljButton;
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
			exitMenuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					terminate();
				}
			});
		}
		return exitMenuItem;
	}

	/**
	 * This method initializes extractjTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getExtractjTextField() {
		if (extractjTextField == null) {
			extractjTextField = new JTextField();
			extractjTextField.setText("%");
			extractjTextField
					.setToolTipText("Navn på protokol, såsom godsnavn, "
							+ "evt. omgivet af %-tegn, " + "eller anvend %");
		}
		return extractjTextField;
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
			fileMenu.add(getExitMenuItem());
		}
		return fileMenu;
	}

	private Component getFonOKjButton() {
		if (FonOKjButton == null) {
			FonOKjButton = new JButton();
			FonOKjButton.setText("Søg fonetisk");
			FonOKjButton.setMnemonic(KeyEvent.VK_F);
			FonOKjButton.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					performSelect('F');
				}
			});
		}
		return FonOKjButton;
	}

	/**
	 * This method initializes fromdatejTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getFromdatejTextField() {
		if (fromdatejTextField == null) {
			MaskFormatter mf = null;
			;
			try {
				mf = new MaskFormatter("####");
				mf.setPlaceholder("0001");
			} catch (ParseException e) {
				getMessagejTextField().setText(e.getMessage());
				e.printStackTrace();
			}
			fromdatejTextField = new JFormattedTextField(mf);
			fromdatejTextField.setColumns(4);
			fromdatejTextField.setHorizontalAlignment(SwingConstants.TRAILING);
			fromdatejTextField.setToolTipText("Indtast kun årstal");
		}
		return fromdatejTextField;
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
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getButtonjPanel(), BorderLayout.SOUTH);
			jContentPane.add(getMainjPanel(), BorderLayout.CENTER);
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
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setSize(762, 423);
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Søgning i skifteuddrag");

			final Toolkit toolkit = Toolkit.getDefaultToolkit();
			final Dimension screenSize = toolkit.getScreenSize();
			final int x = (screenSize.width - jFrame.getWidth()) / 2;
			final int y = (screenSize.height - jFrame.getHeight()) / 2;
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
			jJMenuBar.add(getHelpMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes mainjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getMainjPanel() {
		if (mainjPanel == null) {
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.fill = GridBagConstraints.BOTH;
			gridBagConstraints12.gridy = 2;
			gridBagConstraints12.weightx = 1.0;
			gridBagConstraints12.gridwidth = 1;
			gridBagConstraints12.gridx = 3;
			extractjLabel = new JLabel();
			extractjLabel.setText("Skifteprotokol");
			GridBagConstraints gridBagConstraints99 = new GridBagConstraints();
			gridBagConstraints99.gridx = 2;
			gridBagConstraints99.anchor = GridBagConstraints.WEST;
			gridBagConstraints99.gridy = 2;
			// Message
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.fill = GridBagConstraints.BOTH;
			gridBagConstraints21.gridy = 5;
			gridBagConstraints21.weightx = 1.0;
			gridBagConstraints21.gridwidth = 4;
			gridBagConstraints21.gridx = 1;
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.fill = GridBagConstraints.BOTH;
			gridBagConstraints41.gridy = 2;
			gridBagConstraints41.weightx = 1.0;
			gridBagConstraints41.gridwidth = 1;
			gridBagConstraints41.gridx = 1;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 0;
			gridBagConstraints11.anchor = GridBagConstraints.WEST;
			gridBagConstraints11.gridy = 2;
			placejLabel = new JLabel();
			placejLabel.setText("Sted");
			// Results
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.BOTH;
			gridBagConstraints5.gridy = 4;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.weighty = 1.0;
			gridBagConstraints5.gridwidth = 4;
			gridBagConstraints5.gridx = 1;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.fill = GridBagConstraints.BOTH;
			gridBagConstraints4.gridy = 1;
			gridBagConstraints4.weightx = 1.0;
			gridBagConstraints4.anchor = GridBagConstraints.EAST;
			gridBagConstraints4.gridx = 3;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.fill = GridBagConstraints.BOTH;
			gridBagConstraints3.gridy = 1;
			gridBagConstraints3.weightx = 1.0;
			gridBagConstraints3.anchor = GridBagConstraints.EAST;
			gridBagConstraints3.gridx = 1;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 0;
			gridBagConstraints2.anchor = GridBagConstraints.WEST;
			gridBagConstraints2.gridy = 1;
			datesjLabel = new JLabel();
			datesjLabel.setText("Fra og til år");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.fill = GridBagConstraints.BOTH;
			gridBagConstraints1.gridy = 0;
			gridBagConstraints1.weightx = 1.0;
			gridBagConstraints1.gridwidth = 3;
			gridBagConstraints1.gridx = 1;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			gridBagConstraints.gridy = 0;
			namejLabel = new JLabel();
			namejLabel.setText("Navn");
			mainjPanel = new JPanel();
			mainjPanel.setLayout(new GridBagLayout());
			mainjPanel.add(namejLabel, gridBagConstraints);
			mainjPanel.add(getNamejTextField(), gridBagConstraints1);
			mainjPanel.add(datesjLabel, gridBagConstraints2);
			mainjPanel.add(getFromdatejTextField(), gridBagConstraints3);
			mainjPanel.add(getTodatejTextField(), gridBagConstraints4);
			mainjPanel.add(placejLabel, gridBagConstraints11);
			mainjPanel.add(getPlacejTextField(), gridBagConstraints41);
			mainjPanel.add(extractjLabel, gridBagConstraints99);
			mainjPanel.add(getExtractjTextField(), gridBagConstraints12);
			mainjPanel.add(getResultsjScrollPane(), gridBagConstraints5);
			mainjPanel.add(getMessagejTextField(), gridBagConstraints21);
		}
		return mainjPanel;
	}

	/**
	 * This method initializes messagejTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getMessagejTextField() {
		if (messagejTextField == null) {
			messagejTextField = new JTextField();
			messagejTextField.setEditable(false);
		}
		return messagejTextField;
	}

	/**
	 * This method initializes namejTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getNamejTextField() {
		if (namejTextField == null) {
			namejTextField = new JTextField();
			namejTextField.setText("%");
			namejTextField.setToolTipText("% kan anvendes");
		}
		return namejTextField;
	}

	/**
	 * This method initializes OKjButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getOKjButton() {
		if (OKjButton == null) {
			OKjButton = new JButton();
			OKjButton.setText("Søg");
			OKjButton.setMnemonic(KeyEvent.VK_S);
			OKjButton.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					performSelect('N');
				}
			});
		}
		return OKjButton;
	}

	/**
	 * This method initializes placejTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getPlacejTextField() {
		if (placejTextField == null) {
			placejTextField = new JTextField();
			placejTextField.setText("%");
			placejTextField
					.setToolTipText("Staves som i skiftet eller anvend %");
		}
		return placejTextField;
	}

	/**
	 * This method initializes probateButtonjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getProbateButtonjPanel() {
		if (probateButtonjPanel == null) {
			probateButtonjPanel = new JPanel();
			probateButtonjPanel.setLayout(new GridBagLayout());
			probateButtonjPanel.add(getProbateOKjButton(),
					new GridBagConstraints());
		}
		return probateButtonjPanel;
	}

	/**
	 * This method initializes probatejContentPane1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getProbatejContentPane1() {
		if (probatejContentPane1 == null) {
			probatejContentPane1 = new JPanel();
			probatejContentPane1.setLayout(new BorderLayout());
			probatejContentPane1.add(getProbateMainjPanel(),
					BorderLayout.CENTER);
			probatejContentPane1.add(getProbateButtonjPanel(),
					BorderLayout.SOUTH);
		}
		return probatejContentPane1;
	}

	/**
	 * This method initializes probatejDialog
	 * 
	 * @return javax.swing.JDialog
	 */
	private JDialog getProbatejDialog() {
		if (probatejDialog == null) {
			probatejDialog = new JDialog(getJFrame());
			probatejDialog.setTitle("Skifteuddrag");
			probatejDialog.setSize(new Dimension(582, 342));
			probatejDialog.setContentPane(getProbatejContentPane1());
		}
		return probatejDialog;
	}

	/**
	 * This method initializes probatejTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getProbatejTextArea() {
		if (probatejTextArea == null) {
			probatejTextArea = new JTextArea();
		}
		return probatejTextArea;
	}

	/**
	 * This method initializes probateMainjPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getProbateMainjPanel() {
		if (probateMainjPanel == null) {
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.fill = GridBagConstraints.BOTH;
			gridBagConstraints9.gridy = 0;
			gridBagConstraints9.weightx = 1.0;
			gridBagConstraints9.weighty = 1.0;
			gridBagConstraints9.gridx = 0;
			probateMainjPanel = new JPanel();
			probateMainjPanel.setLayout(new GridBagLayout());
			probateMainjPanel.add(getProbatejTextArea(), gridBagConstraints9);
		}
		return probateMainjPanel;
	}

	/**
	 * This method initializes probateOKjButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getProbateOKjButton() {
		if (probateOKjButton == null) {
			probateOKjButton = new JButton();
			probateOKjButton.setText("OK");
			probateOKjButton
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							Clipboard systemClipboard = Toolkit
									.getDefaultToolkit().getSystemClipboard();
							Transferable transferableText = new StringSelection(
									getProbatejTextArea().getText());
							systemClipboard.setContents(transferableText, null);

							getProbatejDialog().dispose();
						}
					});
		}
		return probateOKjButton;
	}

	/**
	 * This method initializes resetjButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getResetjButton() {
		if (resetjButton == null) {
			resetjButton = new JButton();
			resetjButton.setText("Ryd indtastningsfelter");
			resetjButton.setMnemonic(KeyEvent.VK_R);
			resetjButton.addActionListener(new java.awt.event.ActionListener() {
				@Override
				public void actionPerformed(java.awt.event.ActionEvent e) {
					resetFields();
				}
			});
		}
		return resetjButton;
	}

	/**
	 * This method initializes resultsjScrollPane
	 * 
	 * @return javax.swing.JScrollPane
	 */
	private JScrollPane getResultsjScrollPane() {
		if (resultsjScrollPane == null) {
			resultsjScrollPane = new JScrollPane();
			resultsjScrollPane.setViewportView(getResultsjTable());
		}
		return resultsjScrollPane;
	}

	/**
	 * This method initializes resultsjTable
	 * 
	 * @return javax.swing.JTable
	 */
	private JTable getResultsjTable() {
		if (resultsjTable == null) {
			resultsjTable = new JTable();
			resultsjTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			resultsjTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			resultsjTable.setShowGrid(true);
			resultsjTable
					.setToolTipText("Klik på en række for at se den i et særskilt vindue");
			colNames.add("Navn");
			colNames.add("Fra");
			colNames.add("Til");
			colNames.add("Sted");
			colNames.add("Skifteuddrag");
			model.setColumnIdentifiers(colNames);
			resultsjTable.setModel(model);
			resultsjTable.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int row = getResultsjTable().getSelectedRow();
					getProbatejTextArea().setText(
							(String) model.getValueAt(row, 4));
					getProbatejTextArea().setMargin(new Insets(16, 16, 16, 16));

					JDialog probateDialog = getProbatejDialog();
					probateDialog.pack();
					Point loc = getJFrame().getLocation();
					loc.translate(20, 20);
					probateDialog.setLocation(loc);
					probateDialog.setVisible(true);
				}
			});
		}
		return resultsjTable;
	}

	private Component getSurnameFonjButton() {
		if (SurnameFonjButton == null) {
			SurnameFonjButton = new JButton();
			SurnameFonjButton.setText("Søg efternavn fonetisk");
			SurnameFonjButton.setMnemonic(KeyEvent.VK_T);
			SurnameFonjButton
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							performSelect('T');
						}
					});
		}
		return SurnameFonjButton;
	}

	private Component getSurnameOKjButton() {
		if (SurnameOKjButton == null) {
			SurnameOKjButton = new JButton();
			SurnameOKjButton.setText("Søg efternavn");
			SurnameOKjButton.setMnemonic(KeyEvent.VK_E);
			SurnameOKjButton
					.addActionListener(new java.awt.event.ActionListener() {
						@Override
						public void actionPerformed(java.awt.event.ActionEvent e) {
							performSelect('E');
						}
					});
		}
		return SurnameOKjButton;
	}

	/**
	 * This method initializes todatejTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTodatejTextField() {
		if (todatejTextField == null) {
			MaskFormatter mf = null;
			;
			try {
				mf = new MaskFormatter("####");
				mf.setPlaceholderCharacter('9');
			} catch (ParseException e) {
				getMessagejTextField().setText(e.getMessage());
				e.printStackTrace();
			}
			todatejTextField = new JFormattedTextField(mf);
			todatejTextField.setColumns(4);
			todatejTextField.setHorizontalAlignment(SwingConstants.TRAILING);
			todatejTextField.setToolTipText("Indtast kun årstal");
		}
		return todatejTextField;
	}

	/**
	 * @param cType
	 */
	private void performSelect(char cType) {
		ResultSet rs;
		PreparedStatement ps;
		Fonkod fk = new Fonkod();
		int rowCount = 0;
		Vector<String> vRow = null;
		String[] sa = null;
		StringBuffer sb = null;

		String name = getNamejTextField().getText();
		sa = name.split(" ");
		sb = new StringBuffer("");
		for (int i = 0; i < sa.length; i++)
			sb.append(sa[i].substring(0, 1).toUpperCase() + sa[i].substring(1)
					+ " ");
		name = sb.toString().trim();

		String fromdate = getFromdatejTextField().getText();
		String todate = getTodatejTextField().getText();

		String place = getPlacejTextField().getText();
		sa = place.split(" ");
		sb = new StringBuffer("");
		for (int i = 0; i < sa.length; i++)
			sb.append(sa[i].substring(0, 1).toUpperCase() + sa[i].substring(1)
					+ " ");
		place = sb.toString().trim();

		String source = getExtractjTextField().getText();
		sa = source.split(" ");
		sb = new StringBuffer("");
		for (int i = 0; i < sa.length; i++)
			sb.append(sa[i].substring(0, 1).toUpperCase() + sa[i].substring(1)
					+ " ");
		source = sb.toString().trim();

		getMessagejTextField().setText(
				"Vent venligst, mens der søges efter skifteuddrag...");
		getMessagejTextField().repaint();
		model.setRowCount(0);

		try {
			sb = new StringBuffer(
					"SELECT INDIVIDUAL.NAME, EVENT.FROMDATE, EVENT.TODATE, "
							+ "EVENT.PLACE, EVENT.COVERED_DATA, EVENT.CAPTION, EVENT.SOURCE FROM INDIVIDUAL, EVENT WHERE ");

			if (cType == 'F') {
				if (name.charAt(0) == '%') {
					name = fk.generateKey(name.substring(1)).replaceAll(
							"(\\s+)", "%$1");
					sb.append("FONKOD LIKE '%" + name + "' ");
				} else {
					name = fk.generateKey(name);
					sb.append("FONKOD = '" + name + "' ");
				}
			} else if (cType == 'E')
				sb.append("INDIVIDUAL.NAME LIKE '%" + name.trim() + "' ");

			else if (cType == 'T') {
				name = fk.generateKey(name.trim());
				sb.append("FONKOD LIKE '%" + name + "' ");

			} else {
				if (name.contains("%"))
					sb.append("INDIVIDUAL.NAME LIKE '" + name.trim() + "' ");
				else
					sb.append("INDIVIDUAL.NAME = '" + name.trim() + "' ");
			}

			if (fromdate.matches("0001") == false) {
				sb.append("AND YEAR(FROMDATE) >= " + fromdate + " ");
			}

			if (todate.matches("9999") == false) {
				sb.append("AND YEAR(TODATE) <= " + todate + " ");
			}

			if ((place.contains("%") && (place.matches("%") == false)))
				sb.append("AND PLACE LIKE '" + place + "' ");
			else if (place.matches("%") == false)
				sb.append("AND PLACE = '" + place + "' ");

			if ((source.contains("%") && (source.matches("%") == false)))
				sb.append("AND INDIVIDUAL.SOURCE LIKE '" + source + "' ");
			else if (source.matches("%") == false)
				sb.append("AND INDIVIDUAL.SOURCE = '" + source + "' ");

			sb.append("AND INDIVIDUAL.EVENT_ID = EVENT.ID AND INDIVIDUAL.SOURCE = EVENT.SOURCE ORDER BY FROMDATE");

			System.out.println(sb.toString());

			ps = conn.prepareStatement(sb.toString());
			rs = ps.executeQuery();

			while (rs.next()) {
				rowCount++;
				vRow = new Vector<String>();
				vRow.add(rs.getString(1).trim());
				vRow.add(rs.getString(2).trim());
				vRow.add(rs.getString(3).trim());
				vRow.add(rs.getString(4).trim());
				vRow.add(rs.getString(5).trim() + " \n"
						+ rs.getString(6).trim() + " \n"
						+ rs.getString(7).trim());
				model.addRow(vRow);

				// System.out.println(rs.getString(5).trim());
			}

			resultsjTable = autoResizeColWidth(resultsjTable, model);

			if (rowCount == 0)
				getMessagejTextField().setText("Fandt ingen personer");
			else if (rowCount == 1)
				getMessagejTextField().setText("Fandt én person");
			else
				getMessagejTextField().setText(
						"Fandt " + rowCount + " personer");

		} catch (SQLException e) {
			getMessagejTextField().setText(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			getMessagejTextField().setText(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Reset all fields
	 */
	private void resetFields() {
		getNamejTextField().setText("%");
		getFromdatejTextField().setText("0001");
		getTodatejTextField().setText("9999");
		getPlacejTextField().setText("%");
		getExtractjTextField().setText("%");
		DefaultTableModel dm = (DefaultTableModel) getResultsjTable()
				.getModel();
		dm.getDataVector().removeAllElements();
		getResultsjTable().repaint();
		getMessagejTextField().setText("Felterne er nulstillet");
	}

	private void terminate() {
		try {
			// DriverManager.getConnection(SHUTDOWN);
			conn.close();

		} catch (SQLException sqlE) {
			getMessagejTextField().setText(sqlE.getMessage());
		}
		System.exit(0);
	}
}