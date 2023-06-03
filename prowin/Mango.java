package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Mango extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mango frame = new Mango();
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
	public Mango() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mango");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(59, 51, 90, 13);
		contentPane.add(lblNewLabel);
		
		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(48, 145, 403, 13);
		contentPane.add(l1);
		l1.setText("Mango is a sweet and seasonal fruit.");
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l2.setBounds(48, 168, 429, 13);
		contentPane.add(l2);
		l2.setText("Mango is the national fruit of our country India.");
		
		JLabel l3 = new JLabel("");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l3.setBounds(48, 191, 554, 13);
		contentPane.add(l3);
		l3.setText("Mango is considered the king of fruits.");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l4.setBounds(48, 214, 503, 13);
		contentPane.add(l4);
		l4.setText("Mangoes come during summer days.");
		
		JLabel l5 = new JLabel("");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l5.setBounds(48, 237, 429, 13);
		contentPane.add(l5);
		l5.setText("Mangoes are found all over the world.");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(185, 63, 96, 72);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\Downloads\\mango bk (1).jpg"));
		lblNewLabel_2.setBounds(0, 0, 648, 471);
		contentPane.add(lblNewLabel_2);
	}

}
