package Tayfun;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;


public class InterfaceEole extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	//897
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceEole frame = new InterfaceEole();
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
	public InterfaceEole() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 711, 420);
		contentPane.add(panel);
		
		JButton btnCli = new JButton("Client");
		btnCli.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnCli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1 = new JFrame();
				frame1.setVisible(true);
				

			}

		});
		panel.setLayout(null);
		btnCli.setBounds(88, 339, 104, 33);
		panel.add(btnCli);
		
		JButton btnAdm = new JButton("Admin");
		btnAdm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		btnAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Test Admin");
			}
		});
		btnAdm.setBounds(511, 339, 104, 33);
		panel.add(btnAdm);
		
		JLabel lblBienvenue = new JLabel("Bienvenue sur l'interface d'Eole, veuillez cliquer sur l'un des deux boutons.");
		lblBienvenue.setVerticalAlignment(SwingConstants.TOP);
		lblBienvenue.setBackground(Color.WHITE);
		lblBienvenue.setForeground(Color.BLUE);
		lblBienvenue.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblBienvenue.setBounds(46, 11, 601, 23);
		panel.add(lblBienvenue);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/course_voile_floxiflux.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(46, 43, 601, 288);
		panel.add(lblNewLabel);
		

		
	}
}
	
	
	
//private void initialize() {
//		JFrame frame = new JFrame();
//		frame.setEnabled(false);
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("EOLE V1");
//		lblNewLabel.setBounds(355, 237, 46, 14);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JButton btnCli = new JButton("Client");
//		btnCli.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//				final JFrame frame = new JFrame("Test");
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frame.setSize(300, 300);
//				frame.setVisible(true);
//				//frame.dispose();
//
//			}
//		});
//		btnCli.setBounds(51, 91, 89, 23);
//		frame.getContentPane().add(btnCli);
//		
//		JButton btnAdm = new JButton("Admin");
//		btnAdm.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//		btnAdm.setBounds(263, 91, 89, 23);
//		frame.getContentPane().add(btnAdm);
//		
//		JLabel lblBienvenueSurLinterface = new JLabel("Bienvenue sur l'interface d'Eole, veuillez cliquer sur l'un des deux boutons.");
//		lblBienvenueSurLinterface.setBounds(44, 50, 380, 14);
//		frame.getContentPane().add(lblBienvenueSurLinterface);
//		
//		JLabel lblImage = new JLabel("");
//		Image img = new ImageIcon(this.getClass().getResource("/LogoEole.png")).getImage();
//		lblImage.setIcon (new ImageIcon(img));
//		lblImage.setBounds(80, 129, 254, 145);
//		frame.getContentPane().add(lblImage);
//	}
//}
