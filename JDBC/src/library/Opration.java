package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Opration {
	
	Connection cn;
	public Opration() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?user=root&&password=root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	Scanner sc = new Scanner(System.in);
	public void addBook()
	{
		System.out.println("Enter book name : ");
		String bname = sc.next();
		System.out.println("Enter price : ");
		double price = sc.nextDouble();
		System.out.println("enter qty : ");
		int qty = sc.nextInt();
		
		try {
			
			PreparedStatement ps1 = cn.prepareStatement("select * from book where bname=?");
			ps1.setString(1, bname);
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Book alredy exist !!!");
			}
			else
			{
			PreparedStatement ps = cn.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, bname);
			ps.setDouble(3, price);
			ps.setInt(4, qty);
			
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Book added successfully !!!");
			}
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void viewBook()
	{
		Statement st;
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteBook()
	{
		System.out.println("enter book name");
		String bname = sc.next();
		
		try {
			PreparedStatement ps = cn.prepareStatement("delete from book where bname=?");
			ps.setString(1, bname);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("book deleted !!!");
			}
			else
			{
				System.out.println("Book not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void issueBook()
	{
		System.out.println("enter book name");
		String bname = sc.next();
		PreparedStatement ps1;
		try {
			ps1 = cn.prepareStatement("select * from book where bname=?");
			ps1.setString(1, bname);
			ResultSet rs = ps1.executeQuery();
			if(rs.next())
			{
				int qty = rs.getInt(4);
				if(qty<1)
				{
					System.out.println("Book not avalaible at the moment !!!");
				}
				else
				{
					qty--;
					PreparedStatement ps = cn.prepareStatement("update book set qty=? where bname=?");
					ps.setInt(1, qty);
					ps.setString(2, bname);
					
					int i=ps.executeUpdate();
					if(i>0)
					{
						System.out.println("Book issued !!!");
					}
				}
			}
			else
			{
				System.out.println("Book not available");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
}
