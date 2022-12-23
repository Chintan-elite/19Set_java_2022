package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J001_FirstConnection {
	public static void main(String[] args) {
		
		
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");
			
			//define connection url
			String url = "jdbc:mysql://localhost:3306/practice";
			String user = "root";
			String pass = "root";
			
			
			//established the connection
			Connection cn =  DriverManager.getConnection(url,user,pass);
			System.out.println("connection established");
			
			
			//create statement
			Statement st = cn.createStatement();
			
			//execute query
			ResultSet rs =  st.executeQuery("select * from emp");
			
			//process resultset
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String dept = rs.getString(3);
				double sal = rs.getDouble("sal");
				
				System.out.println(id+" "+name+" "+dept+" "+sal);
						
			}
			
			//close the connection
			cn.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
