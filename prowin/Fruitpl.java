package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Fruitpl extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fruitpl frame = new Fruitpl();
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
	public Fruitpl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Orange");
		b1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Orange o =new Orange();
				o.show();
				
			}
		});
		b1.setBounds(233, 72, 154, 30);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Apple");
		b2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Apple a =new Apple();
			a.show();
			
			}
		});
		b2.setBounds(233, 126, 154, 30);
		contentPane.add(b2);
		
		JButton btnNewButton = new JButton("Litchi");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Litchi l =new Litchi();
				l.show();
			}
		});
		btnNewButton.setBounds(233, 200, 154, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mango");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mango m =new Mango();
				m.show();
			}
		});
		btnNewButton_1.setBounds(233, 265, 154, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Strawberry");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strawberry s =new Strawberry();
				s.show();
			}
		});
		btnNewButton_2.setBounds(233, 338, 154, 30);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\bunch fruit.png"));
		lblNewLabel.setBounds(0, 0, 647, 445);
		contentPane.add(lblNewLabel);
		{
			
		}
		
		JButton b4 = new JButton("Strawberry");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Strawberry s =new Strawberry();
				s.show();
				
			}
		});{
		}
		JButton b5 = new JButton("Mango");
		b5.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mango m =new Mango();
				m.show();
			}
		}); 
		
	}
}
