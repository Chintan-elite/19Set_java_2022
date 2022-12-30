package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J003_UpdateData {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter dept : ");
		String dept = sc.next();
		System.out.println("enter sal : ");
		double sal = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&&password=root");
			System.out.println("connection established");
			
			Statement st  =cn.createStatement();
			
			int i =  st.executeUpdate("update emp set name='"+name+"',dept='"+dept+"', sal="+sal+" where id="+id+"");
			if(i>0)
			{
				System.out.println("data updated");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
