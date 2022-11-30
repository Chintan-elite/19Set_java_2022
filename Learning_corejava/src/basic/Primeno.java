package basic;

public class Primeno {
	public static void main(String[] args) {
		
		
		
		int num = 17;
		int flag = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		
	}
}
