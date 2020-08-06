package it.test.corso.java;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;

public class RubricaComponents {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RubricaComponents window = new RubricaComponents();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RubricaComponents() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1036, 724);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblEtichettaNonCliccabile = new JLabel("Etichetta non cliccabile");
		lblEtichettaNonCliccabile.setBounds(12, 62, 210, 34);
		lblEtichettaNonCliccabile.setToolTipText("Testo");
		lblEtichettaNonCliccabile.setFont(new Font("Arial", Font.PLAIN, 18));
		frame.getContentPane().add(lblEtichettaNonCliccabile);
		
		JButton btnPulsanteJbutton = new JButton("Pulsante JButton");
		btnPulsanteJbutton.setBounds(39, 109, 153, 25);
		btnPulsanteJbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEtichettaNonCliccabile.setText("HO CLICCATO SUL pulsante");
			}
		});
		frame.getContentPane().add(btnPulsanteJbutton);
		
		JToggleButton tglbtnPulsanteJtoggleButton = new JToggleButton("Pulsante JToggle Button");
		tglbtnPulsanteJtoggleButton.setBounds(39, 161, 153, 25);
		frame.getContentPane().add(tglbtnPulsanteJtoggleButton);
		
		textField = new JTextField();
		textField.setBounds(261, 62, 338, 22);
		textField.setToolTipText("Test tooltip");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxCheck = new JCheckBox("check 1");
		chckbxCheck.setBounds(40, 236, 113, 25);
		frame.getContentPane().add(chckbxCheck);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(172, 236, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(324, 236, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(495, 236, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(172, 306, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_4.setBounds(324, 306, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_5.setBounds(495, 306, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_3);
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(39, 385, 444, 244);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(495, 386, 248, 103);
		frame.getContentPane().add(textArea_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"elemento 1", "elemento 2", "elemento 3", "elemento 4", "elemento 5", "elemento 6"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(622, 71, 169, 151);
		frame.getContentPane().add(list);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(list, popupMenu);
		
		JMenu mnMenu = new JMenu("Menu 1");
		popupMenu.add(mnMenu);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnMenu.add(mnNewMenu);
		
		JMenu mnMenu_1 = new JMenu("Menu 2");
		popupMenu.add(mnMenu_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(261, 91, 169, 25);
		frame.getContentPane().add(passwordField);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnGestioneProdotti = new JMenu("Gestione Prodotti");
		menuBar.add(mnGestioneProdotti);
		
		JMenuItem mntmAggiungi = new JMenuItem("Aggiungi");
		mntmAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Ho cliccato sul menu");
			}
		});
		
		mnGestioneProdotti.add(mntmAggiungi);
		
		JMenuItem mntmRicerca = new JMenuItem("Ricerca");
		mnGestioneProdotti.add(mntmRicerca);

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
