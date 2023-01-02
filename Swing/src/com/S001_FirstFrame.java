package com;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class S001_FirstFrame {
	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Demo");
		frame.setSize(700,700);
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
		
		
		JLabel gender = new JLabel("Gender");
		gender.setBounds(100,190,80,20);
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(200,190,100,20);
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(200,220,100,20);
		ButtonGroup g = new ButtonGroup();
		g.add(female);
		g.add(male);
		
		JLabel lang = new JLabel("Language");
		lang.setBounds(100,250,80,20);
		JCheckBox eng = new JCheckBox("english");
		JCheckBox  hindi = new JCheckBox("Hindi");
		JCheckBox guj = new JCheckBox("gujarati");
		eng.setBounds(200,250,100,20);
		hindi.setBounds(200,280,100,20);
		guj.setBounds(200,310,100,20);
		
		String cntry[] = {"India","USA","UK"};
		JLabel country = new JLabel("Country");
		country.setBounds(100,340,80,20);
		JComboBox<String> c = new JComboBox<String>(cntry);
		c.setBounds(200,340,100,20);
		
		JButton submit = new JButton("submit");
		submit.setBounds(100,370,160,20);
		
		JMenuBar menubar = new JMenuBar();
		menubar.setBounds(0,0,700,20);
		
		JMenu file = new JMenu("File");
		JMenu window = new JMenu("Window");
		JMenu edit = new JMenu("Edit");
		JMenu help = new JMenu("Help");
		
		menubar.add(file);
		menubar.add(window);
		menubar.add(edit);
		menubar.add(help);
		
		JMenuItem open = new JMenuItem("open");
		JMenuItem save = new JMenuItem("save");
		
		file.add(open);
		file.add(save);
		
		frame.add(form);
		frame.add(name);
		frame.add(name1);
		frame.add(email);
		frame.add(email1);
		frame.add(pass);
		frame.add(pass1);
		frame.add(gender);
		frame.add(male);
		frame.add(female);
		frame.add(lang);
		frame.add(guj);
		frame.add(hindi);
		frame.add(eng);
		frame.add(country);
		frame.add(c);
		frame.add(submit);
		frame.add(menubar);
	}
}
