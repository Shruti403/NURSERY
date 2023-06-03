package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Flowerpl extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flowerpl frame = new Flowerpl();
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
	public Flowerpl() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Rose");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rose r =new rose();
				r.show();
				
			}
		});
		btnNewButton.setBounds(238, 76, 155, 35);
		getContentPane().add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Lily");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lily l =new lily();
				l.show();
				
				
			}
		});
		btnNewButton_1.setBounds(238, 168, 155, 35);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Jasmine");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jasmine j =new jasmine();
				j.show();
				
			}
		});
		btnNewButton_2.setBounds(238, 261, 155, 35);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Lotus");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			lotus l =new lotus();
			l.show();
			
			}
		});
		btnNewButton_3.setBounds(238, 353, 155, 35);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\bunchh.png"));
		lblNewLabel.setBounds(0, 10, 660, 474);
		getContentPane().add(lblNewLabel);
	}
}
