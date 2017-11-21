package Tayfun;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InterfaceClient extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JTable table_1;
	private JLabel lblNomParticipants;
	private JLabel lblTypeBateau;
	private JTable table_2;
	private JLabel lblChronomtre;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceClient frame = new InterfaceClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceClient() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(10, 11, 944, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{124554, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.setBounds(10, 93, 218, 320);
		panel.add(table_1);
		
		lblNomParticipants = new JLabel("Nom Participants");
		lblNomParticipants.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomParticipants.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNomParticipants.setBounds(10, 68, 105, 19);
		panel.add(lblNomParticipants);
		
		lblTypeBateau = new JLabel("Type bateaux");
		lblTypeBateau.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTypeBateau.setBounds(125, 68, 103, 19);
		panel.add(lblTypeBateau);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"New column"
			}
		));
		table_2.setBounds(286, 93, 159, 320);
		panel.add(table_2);
		
		lblChronomtre = new JLabel("Chronom\u00E8tre");
		lblChronomtre.setHorizontalAlignment(SwingConstants.CENTER);
		lblChronomtre.setToolTipText("");
		lblChronomtre.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblChronomtre.setBounds(314, 70, 93, 14);
		panel.add(lblChronomtre);
		
		JButton btnNewButton = new JButton("DEMARRER");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(628, 246, 148, 30);
		panel.add(btnNewButton);
		
		JLabel lblChronomtre_1 = new JLabel("Chronom\u00E8tre :");
		lblChronomtre_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblChronomtre_1.setBounds(628, 172, 289, 30);
		panel.add(lblChronomtre_1);
		
		


		}
	}
	


