package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;

public class login1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt_un;
	private JPasswordField pf;
	ResultSet rs;
	Connection con;
	Statement stmt;
	String tun,tpf,un,pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 frame = new login1();
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
	public login1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(226, 186, 101, 29);
		contentPane.add(lblNewLabel);
		
		txt_un = new JTextField();
		txt_un.setBounds(404, 188, 178, 29);
		contentPane.add(txt_un);
		txt_un.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(226, 244, 101, 29);
		contentPane.add(lblNewLabel_1);
		
		pf = new JPasswordField();
		pf.setBounds(404, 244, 180, 29);
		contentPane.add(pf);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(222, 320, 117, 29);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton_1.setBounds(463, 320, 123, 29);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\nandk\\OneDrive\\Pictures\\ooooo.png"));
		lblNewLabel_2.setBounds(0, 0, 668, 496);
		contentPane.add(lblNewLabel_2);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			stmt=con.createStatement();
		}
		catch(Exception e1){
			System.out.println(e1);
	}
}
	public void actionPerformed(ActionEvent e) {
		try {
			String cmd=e.getActionCommand();
			if(cmd.equals("Submit"))
			{
				tun=txt_un.getText();
				tpf=pf.getText();
				rs=stmt.executeQuery("select* from login");
				if(rs.next())
				{
					un=rs.getString("Username");
					pw=rs.getString("Password");
					if(tun.equals(un) && tpf.equals(pw))
					{
						WelcomePage wp=new WelcomePage();
						wp.show();
						setVisible(false);
					}
					else
						JOptionPane.showMessageDialog(null, "Invalid Username and Password");
				}
			}
			
		}
		catch(Exception e2) {
			System.out.println(e2);
		}
	}
}