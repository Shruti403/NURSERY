package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class lotus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lotus frame = new lotus();
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
	public lotus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lotus");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(52, 65, 91, 34);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(47, 191, 587, 13);
		contentPane.add(l1);
		l1.setText("The lotus flower is regarded as national flower of India.");
		
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(52, 214, 515, 13);
		contentPane.add(l2);
		l2.setText("Lotus symbolises beauty,purity,knowledge.");
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(52, 237, 582, 13);
		contentPane.add(l3);
		l3.setText("It is an aquatic flower with round leaves floating on the water.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(55, 283, 468, 13);
		contentPane.add(l4);
		l4.setText("It grows in freshwater and shallow ponds.");
	
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(53, 260, 496, 13);
		contentPane.add(l5);
		l5.setText("It has a wide range of medical uses.");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\lotus bk (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 705, 462);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
