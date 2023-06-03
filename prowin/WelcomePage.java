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
import javax.swing.ImageIcon;

public class WelcomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**	 * Create the frame.
	 */
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Flower Plant");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flowerpl fp=new Flowerpl();
				fp.show();
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b1.setBounds(204, 121, 254, 53);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Fruit Plant");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fruitpl fp1=new Fruitpl();
				fp1.show();
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b2.setBounds(204, 326, 254, 53);
		contentPane.add(b2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\phullllllll.png"));
		lblNewLabel.setBounds(0, 0, 683, 246);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\phallll.png"));
		lblNewLabel_1.setBounds(0, 246, 683, 245);
		contentPane.add(lblNewLabel_1);
	}
}
