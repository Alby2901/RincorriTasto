package it.test.corso.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class RubricaPanel {

	private JFrame frame;
	private JTextField txtTab;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RubricaPanel window = new RubricaPanel();
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
	public RubricaPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1095, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(54, 41, 917, 565);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("TAB 1", null, panel, null);
		
		JLabel lblSonoTab = new JLabel("Sono tab 1");
		panel.add(lblSonoTab);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		txtTab = new JTextField();
		txtTab.setText("Tab 2");
		panel_1.add(txtTab);
		txtTab.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JButton btnTab = new JButton("Tab 3");
		panel_2.add(btnTab);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(37, 10, 972, 33);
		frame.getContentPane().add(toolBar);
		
		JButton btnCrea = new JButton("Crea");
		toolBar.add(btnCrea);
		
		JButton btnSalva = new JButton("Salva");
		toolBar.add(btnSalva);
		
		JButton btnSalvaTutti = new JButton("Salva tutti");
		toolBar.add(btnSalvaTutti);
	}
}
