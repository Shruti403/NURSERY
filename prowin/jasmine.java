package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class jasmine extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jasmine frame = new jasmine();
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
	public jasmine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jasmine");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(52, 84, 79, 13);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(52, 189, 514, 13);
		contentPane.add(l1);
		l1.setText("Jasmine is a small white flower with a sweet fragrance.");
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(52, 212, 525, 13);
		contentPane.add(l2);
		l2.setText("The flower has 4-10 small petals with a maximum size of 1 inch.");
		
		JLabel l3 = new JLabel("");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(49, 235, 525, 13);
		contentPane.add(l3);
		l3.setText("The flowering takes place in springs and summer.");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(46, 258, 619, 13);
		contentPane.add(l4);
		l4.setText("It used in the production of different products like perfumes ,oils,soaps etc.");
		
		JLabel l5 = new JLabel("");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(52, 281, 514, 13);
		contentPane.add(l5);
		l5.setText("It is said that jasmine is originated in Iran.");
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\jasm ic (1).jpg"));
		lblNewLabel_2.setBounds(235, 97, 103, 82);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\jasmine (3).jpg"));
		lblNewLabel_1.setBounds(0, 0, 665, 447);
		contentPane.add(lblNewLabel_1);
	}
}
