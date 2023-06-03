package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class rose extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rose frame = new rose();
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
	public rose() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rose");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(41, 24, 146, 45);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(39, 198, 586, 13);
		contentPane.add(l1);
		l1.setText("A rose is a type of shrub,which is known all over the world for its beauty.");
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(39, 221, 605, 13);
		contentPane.add(l2);
		l2.setText("Roses come in a variety of colours such as yellow ,pink,white and red.");
		
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(38, 244, 533, 13);
		contentPane.add(l3);
	    l3.setText("The rose is seen as a sign of harmony and balance.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(41, 267, 662, 13);
		contentPane.add(l4);
		l4.setText("A red rose is a symbol of love,however,a deep red rose is a symbol of  sorrow.");
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(41, 290, 567, 13);
		contentPane.add(l5);
		l5.setText("Rose flowers is used in many types of medicines.");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\rose icon (1).jpg"));
		lblNewLabel_1.setBounds(224, 86, 130, 102);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\rose bk (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 678, 484);
		contentPane.add(lblNewLabel_2);
	}

}
