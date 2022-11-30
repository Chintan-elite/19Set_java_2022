package basic;

import java.util.Scanner;

public class Pettern2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i=i+2){
			 for(int j=1;j<=n-i;j++)
			 {
				 
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 if(i%2!=0)
				 {
					 System.out.print("* ");
				 }else
				 {
					 
				 }
			 }
			 System.out.println("");
			 
		 }
	}
}
