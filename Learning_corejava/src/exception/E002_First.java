package exception;

public class E002_First {
	public static void main(String[] args) {
		
		 
		System.out.println("Program started...");
		try 
		{
			int i = 0;
			int j  =10/2;
			System.out.println(j);
			
			try {
				int a[] = new int[5];
				a[6] = 50;
				
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
		} 
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("Program ended...");
	}
}
