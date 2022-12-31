package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class J005_Matadata {
		
	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&&password=root");
			System.out.println("db connected...");
			
			
		   DatabaseMetaData db = cn.getMetaData();
		   System.out.println(db.getDatabaseMajorVersion());
		   System.out.println(db.getDatabaseProductName());
		   System.out.println(db.getDriverName());
		   
		   
		   Statement st  =cn.createStatement();
		   ResultSet rs = st.executeQuery("select * from emp");
		   
		   ResultSetMetaData rm = rs.getMetaData();
		   System.out.println(rm.getColumnCount());
		   System.out.println(rm.getColumnType(2));
		   System.out.println(rm.getColumnTypeName(1));
		   System.out.println(rm.getColumnName(1));
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
