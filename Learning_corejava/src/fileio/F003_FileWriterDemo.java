package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F003_FileWriterDemo {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D:\\topsgit\\test.txt");
			String str = "abc";
			fw.write(str);
			fw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
