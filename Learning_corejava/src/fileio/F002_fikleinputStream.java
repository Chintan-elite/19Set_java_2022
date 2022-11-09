package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F002_fikleinputStream {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("D:\\newgit\\test.txt");
			int i =   fis.read();
			while(i!=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
