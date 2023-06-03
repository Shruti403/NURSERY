package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Strawberry extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Strawberry frame = new Strawberry();
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
	public Strawberry() {
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Strawberry");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel_1.setBounds(47, 73, 327, 22);
		getContentPane().add(lblNewLabel_1);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(26, 159, 493, 22);
		getContentPane().add(l1);
		l1.setText("Strawberry is a very useful fruit whose color is red.");
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(26, 180, 410, 22);
		getContentPane().add(l3);
		l3.setText("America is the largest producer of strawberries.");
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(29, 200, 407, 22);
		getContentPane().add(l2);
		l2.setText("Strawberry fruit is very juicy in appearance.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(31, 226, 435, 13);
		getContentPane().add(l4);
		l4.setText("Strawberry is rich in vitamin C.");
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(31, 249, 578, 13);
		getContentPane().add(l5);
		l5.setText("The strawberry plant grows from a dense crown at the base of soil.");
		
		JLabel lblNewLabel_2 = new JLabel("Strawberry");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\straw (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 635, 478);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		
			}

}
