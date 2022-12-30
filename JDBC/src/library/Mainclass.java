package library;

import java.util.Scanner;

public class Mainclass {
	 public static void main(String[] args) {
		
		 int choice=0;
		 do {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter Choice : ");
		 System.out.println("0 : Exit");
		 System.out.println("1 : add book");
		 System.out.println("2 : view book");
		 System.out.println("3 : delete book");
		 System.out.println("4 : issue book");
		 choice = sc.nextInt();
		 
		 Opration op = new Opration();
		 if(choice==1)
		 {
			 System.out.println("*****ADD BOOK*****");
			 op.addBook();
		 }
		 else if(choice==2)
		 {
			 System.out.println("*****VIEW BOOK*****");
			 op.viewBook();
		 }
		 else if(choice==3)
		 {
			 System.out.println("*****DELETE BOOK*****");
			 op.deleteBook();
		 }
		 else if(choice==4)
		 {
			 System.out.println("*****ISSUE BOOK*****");
			 op.issueBook();
		 }
		 else if(choice==0)
		 {
			 System.out.println("******Exit*****");
		 }
		 else
		 {
			 System.out.println("Invalid choice");
		 }
		 }while(choice!=0);
		 
	}
}
