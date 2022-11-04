package exception;

public class E002_compileTimeDemo {
	
	public void disp() throws ClassNotFoundException
	{
		
			Class.forName("E001_Recursion.java");
		
	}
	
	public static void main(String[] args)  {
		
		
		E002_compileTimeDemo a = new E002_compileTimeDemo();
		try {
			a.disp();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
	}
}
