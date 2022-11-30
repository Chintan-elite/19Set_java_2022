package basic;

public class Pettern {
	public static void main(String[] args) {
		
		int lines = 15;
		int starCoun=1;
		int spaceCount = lines-1;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaceCount;k++)
			{
				System.out.print(" ");
			}
			
			for(int i=1;i<=starCoun;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			starCoun=starCoun+2;
			spaceCount--;
		}
			
		
		
		
		
	}
}
