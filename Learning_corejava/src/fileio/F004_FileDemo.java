package fileio;

import java.io.File;
import java.io.IOException;

public class F004_FileDemo {
	
	
	public static void main(String[] args) {
		
		File file = new File("D:\\topsgit\\test.txt");
		
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
	//	file.mkdir();
		
//		if(file.exists())
//		{
//			System.out.println("file is avaialble");
//			file.delete();
//			System.out.println("file deleted...");
//		}
//		else
//		{
//			System.out.println("Not available");
//			try {
//				file.createNewFile();
//				System.out.println("file created !!");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
		
	}
	
}
