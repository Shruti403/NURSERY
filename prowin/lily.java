package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class lily extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lily frame = new lily();
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
	public lily() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lily");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(24, 55, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(24, 161, 399, 13);
		contentPane.add(l1);
		l1.setText("Lily is a white flower that looks very beautiful.");
		
		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l2.setBounds(24, 191, 433, 13);
		contentPane.add(l2);
		l2.setText("This flower is usually used as a symbol of peace.");
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(24, 222, 433, 13);
		contentPane.add(l3);
		l3.setText("The fragrance of this flower is really beautiful.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(24, 245, 399, 32);
		contentPane.add(l4);
		l4.setText("You can find lily flowers worldwide.");
		
		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(25, 287, 494, 13);
		contentPane.add(l5);
		l5.setText("It looks very bright and beautiful.");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\lyy icc (1).jpg"));
		lblNewLabel_1.setBounds(236, 71, 100, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\ll bk (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 663, 486);
		contentPane.add(lblNewLabel_2);
	}

}
