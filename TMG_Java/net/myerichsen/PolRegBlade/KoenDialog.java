package net.myerichsen.PolRegBlade;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Dimension;

/**
 * @author MERICHSE
 * @version 1.3.0 12/05/2011
 * 
 */
public class KoenDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JButton OKButton = null;

	private JLabel setKoenjLabel = null;

	private JTextField navnjTextField = null;

	private JRadioButton hankoenjRadioButton = null;

	private JRadioButton hunkoenjRadioButton = null;

	private JTextArea ledejTextArea = null;

	private ButtonGroup bg = null;

	private GedcomFil gc = null;

	/**
	 * @param owner
	 * @param fil
	 * @param fn
	 */
	public KoenDialog(Frame owner, GedcomFil fil) {
		super(owner, true);
		initialize(fil);
	}

	/**
	 * This method initializes hankoenjRadioButton
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getHankoenjRadioButton() {
		if (hankoenjRadioButton == null) {
			hankoenjRadioButton = new JRadioButton();
			hankoenjRadioButton.setText("hankøn");
		}
		return hankoenjRadioButton;
	}

	/**
	 * This method initializes hunkoenjRadioButton
	 * 
	 * @return javax.swing.JRadioButton
	 */
	private JRadioButton getHunkoenjRadioButton() {
		if (hunkoenjRadioButton == null) {
			hunkoenjRadioButton = new JRadioButton();
			hunkoenjRadioButton.setText("hunkøn");
		}
		return hunkoenjRadioButton;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.fill = GridBagConstraints.HORIZONTAL;
			gridBagConstraints5.gridy = 0;
			gridBagConstraints5.weightx = 1.0;
			gridBagConstraints5.weighty = 1.0;
			gridBagConstraints5.gridwidth = 2;
			gridBagConstraints5.gridx = 0;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridx = 1;
			gridBagConstraints4.gridy = 3;
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 0;
			gridBagConstraints3.gridy = 3;
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.fill = GridBagConstraints.BOTH;
			gridBagConstraints2.gridy = 2;
			gridBagConstraints2.weightx = 1.0;
			gridBagConstraints2.gridwidth = 2;
			gridBagConstraints2.anchor = GridBagConstraints.WEST;
			gridBagConstraints2.gridx = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 0;
			gridBagConstraints1.gridwidth = 2;
			gridBagConstraints1.anchor = GridBagConstraints.WEST;
			gridBagConstraints1.gridy = 1;
			setKoenjLabel = new JLabel();
			setKoenjLabel.setText("Vælg køn for dette barn:");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridwidth = 2;
			gridBagConstraints.gridy = 4;
			jContentPane = new JPanel();
			jContentPane.setLayout(new GridBagLayout());
			jContentPane.add(getLedejTextArea(), gridBagConstraints5);
			jContentPane.add(setKoenjLabel, gridBagConstraints1);
			jContentPane.add(getNavnjTextField(), gridBagConstraints2);
			jContentPane.add(getHankoenjRadioButton(), gridBagConstraints3);
			jContentPane.add(getHunkoenjRadioButton(), gridBagConstraints4);
			jContentPane.add(getOKButton(), gridBagConstraints);
			bg = new ButtonGroup();
			bg.add(getHankoenjRadioButton());
			bg.add(getHunkoenjRadioButton());
		}
		return jContentPane;
	}

	/**
	 * This method initializes ledejTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getLedejTextArea() {
		if (ledejTextArea == null) {
			ledejTextArea = new JTextArea();
			String t = "Barnets første fornavn gemmes med "
					+ "det angivne køn i filen PolReg2Ged.properties, "
					+ "hvor det evt. kan rettes eller slettes.\n\n";
			ledejTextArea.setText(t);
			ledejTextArea.setEditable(false);
			ledejTextArea.setLineWrap(true);
			ledejTextArea.setBackground(new Color(238, 238, 238));
			ledejTextArea.setWrapStyleWord(true);
			Font font = new Font("Sans Serif", Font.BOLD, 12);
			ledejTextArea.setFont(font);
		}
		return ledejTextArea;
	}

	/**
	 * This method initializes navnjTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getNavnjTextField() {
		if (navnjTextField == null) {
			navnjTextField = new JTextField();
			navnjTextField.setEditable(false);
			navnjTextField.setText("?");
			navnjTextField.setText(gc.getFn().getNavn());
			Font font = new Font("Sans Serif", Font.BOLD, 12);
			navnjTextField.setFont(font);
		}
		return navnjTextField;
	}

	/**
	 * This method initializes OKButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getOKButton() {
		if (OKButton == null) {
			OKButton = new JButton();
			OKButton.setText("OK");
			OKButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					if (getHankoenjRadioButton().isSelected()) {
						gc.getFn().setKoen(Koen.M);
					} else {
						gc.getFn().setKoen(Koen.F);
					}

					dispose();
				}
			});
		}
		return OKButton;
	}

	/**
	 * This method initializes this
	 * 
	 * @param fil
	 * 
	 */
	private void initialize(GedcomFil fil) {
		this.gc = fil;

		this.setSize(300, 201);
		this.setTitle("Valg af køn");
		this.setContentPane(getJContentPane());
		
		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the window
		int w = getSize().width;
		int h = getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;

		// Move the window
		setLocation(x, y);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
