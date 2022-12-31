package com;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class S001_FirstFrame {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Demo");
		frame.setSize(500,500);
		frame.setVisible(true);
		//frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel form = new JLabel("Registration form"); 
		form.setBounds(150,50,150,20);
		
		JLabel name = new JLabel("Username");
		name.setBounds(100,100,80,20);
		JTextField name1 = new JTextField();
		name1.setBounds(200,100,100,20);

		
		JLabel email = new JLabel("Email");
		email.setBounds(100,130,80,20);
		JTextField email1 = new JTextField();
		email1.setBounds(200,130,100,20);
		
		JLabel pass = new JLabel("Password");
		pass.setBounds(100,160,80,20);
		JPasswordField pass1 = new JPasswordField();
		pass1.setBounds(200,160,100,20);
		
		
		
		frame.add(form);
		frame.add(name);
		frame.add(name1);
		frame.add(email);
		frame.add(email1);
		frame.add(pass);
		frame.add(pass1);
	}
}
