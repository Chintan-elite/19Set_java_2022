package crud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

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
		loadData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	static Connection cn = null;
	private JTable table;
	private JTextField sid;
	public static void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadData()
	{
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("select * from std");
			ResultSet rs = ps.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (SQLException e) {
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
						loadData();
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(114, 129, 115, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int id = Integer.parseInt(sid.getText());
				String stfname = fname1.getText();
				String stlname = lname1.getText();
				String stemail = email1.getText();
				
				try {
					PreparedStatement ps = cn.prepareStatement("update std set fname=?,lname=?,email=? where id=?");
					ps.setInt(4, id);
					ps.setString(1, stfname);
					ps.setString(2, stlname);
					ps.setString(3, stemail);
					int i = ps.executeUpdate();
					if(i>0)
					{
						JOptionPane.showMessageDialog(frame,"Data updated !!!");
						fname1.setText("");
						lname1.setText("");
						email1.setText("");
						loadData();
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			
			}
		});
		btnNewButton_2.setBounds(114, 163, 115, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(309, 58, 284, 199);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		
		table = new JTable();
		panel_2.add(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(32, 268, 267, 80);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setBounds(28, 11, 56, 14);
		panel_3.add(lblNewLabel_1);
		
		sid = new JTextField();
		sid.setBounds(61, 8, 86, 20);
		panel_3.add(sid);
		sid.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(sid.getText());
				PreparedStatement ps;
				try {
					ps = cn.prepareStatement("delete from std where id=?");
				
					ps.setInt(1, id);
					int i=ps.executeUpdate();
					if(i>0) {
						JOptionPane.showMessageDialog(frame, "data deleted !!!");
						loadData();
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "data not found !!!");
						loadData();
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_1.setBounds(168, 7, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Edit");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int id = Integer.parseInt(sid.getText());
				try {
					PreparedStatement ps = cn.prepareStatement("select * from std where id = ?");
					ps.setInt(1, id);
					ResultSet rs = ps.executeQuery();
					if(rs.next())
					{
						fname1.setText(rs.getString(2));
						lname1.setText(rs.getString(3));
						email1.setText(rs.getString(4));
					}
					else
					{
						JOptionPane.showMessageDialog(frame, "data not found !!!");
						loadData();
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_1_1.setBounds(168, 41, 89, 23);
		panel_3.add(btnNewButton_1_1);
	}
}
