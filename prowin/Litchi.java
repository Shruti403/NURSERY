package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Litchi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Litchi frame = new Litchi();
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
	public Litchi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Litchi");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(52, 72, 102, 13);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(52, 151, 372, 13);
		contentPane.add(l1);
		l1.setText("Litchi is a very tasty and juicy fruit.");
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(52, 174, 356, 13);
		contentPane.add(l2);
		l2.setText("Litchis are small and round in shape.");
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(52, 197, 395, 13);
		contentPane.add(l3);
		l3.setText("Litchi is considered a good source of Vitamin C.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(52, 220, 490, 13);
		contentPane.add(l4);
		l4.setText("Its seed is brown in colour and very hard.");
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(52, 243, 464, 13);
		contentPane.add(l5);
		l5.setText("The seeds are poisonous and should not be eaten.");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(194, 72, 102, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\litch bk (2).jpg"));
		lblNewLabel_2.setBounds(0, 0, 671, 472);
		contentPane.add(lblNewLabel_2);
	}

}
