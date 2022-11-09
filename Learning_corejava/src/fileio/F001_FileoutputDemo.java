package fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F001_FileoutputDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("enter email : ");
		String email = sc.next();
		FileOutputStream fos=null;
		try 
		{
			 fos = new FileOutputStream("D:\\newgit\\"+name+".txt");
			System.out.println("file created..");
			//String s = "This is my first io practical";
			byte b[] = email.getBytes();
			fos.write(b);
			System.out.println("written!!");
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}
		
		
	}
}
