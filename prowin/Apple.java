package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Apple extends JFrame {

	private JPanel contentPane;
	private JLabel l3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apple frame = new Apple();
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
	public Apple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Apple");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(45, 78, 73, 13);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(45, 150, 555, 13);
		contentPane.add(l1);
		l1.setText("In India,Apples are mostly produced in Jammu Kashmir.");
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(45, 173, 452, 13);
		contentPane.add(l2);
		l2.setText("Apple is a very rich source of antioxidants.");
		
		l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(45, 188, 452, 31);
		contentPane.add(l3);
		l3.setText("It helps in building a powerful immune system.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(40, 220, 457, 13);
		contentPane.add(l4);
		l4.setText("Apple is rich source of vitamin C also.");
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(40, 243, 457, 13);
		contentPane.add(l5);
		l5.setText("Apple is a healthy fruit.");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\apppppppllllee bk (1).jpg"));
		lblNewLabel_1.setBounds(0, 0, 675, 473);
		contentPane.add(lblNewLabel_1);
	}
}
