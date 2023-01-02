package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class myapp {

	private JFrame frame;
	private JTextField fname1;
	private JTextField lname1;
	private JTextField email1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myapp window = new myapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myapp() {
		initialize();
		connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	static Connection cn = null;
	public static void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&&password=root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 631, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(196, 11, 239, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(32, 59, 267, 198);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fname = new JLabel("Firstname");
		fname.setBounds(34, 32, 70, 14);
		panel.add(fname);
		
		JLabel lname = new JLabel("Lastname");
		lname.setBounds(34, 66, 57, 14);
		panel.add(lname);
		
		JLabel email = new JLabel("Email");
		email.setBounds(34, 101, 46, 14);
		panel.add(email);
		
		fname1 = new JTextField();
		fname1.setBounds(114, 29, 115, 20);
		panel.add(fname1);
		fname1.setColumns(10);
		
		lname1 = new JTextField();
		lname1.setColumns(10);
		lname1.setBounds(114, 63, 115, 20);
		panel.add(lname1);
		
		email1 = new JTextField();
		email1.setColumns(10);
		email1.setBounds(114, 98, 115, 20);
		panel.add(email1);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				String stfname = fname1.getText();
				String stlname = lname1.getText();
				String stemail = email1.getText();
				
				try {
					PreparedStatement ps = cn.prepareStatement("insert into std values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, stfname);
					ps.setString(3, stlname);
					ps.setString(4, stemail);
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame,"Data inserted !!!");
						fname1.setText("");
						lname1.setText("");
						email1.setText("");
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(114, 129, 115, 23);
		panel.add(btnNewButton);
	}
}
