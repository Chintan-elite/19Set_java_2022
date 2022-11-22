package thread;

import java.util.Scanner;

class Account
{
	double balance;
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public boolean isAvailable(double amt)
	{
		boolean b = false;
		if(amt<=balance)
		{
			b  = true;
		}
		return b;
	}
	
	public void widrow(double amt)
	{
		balance  = balance-amt;
		System.out.println("amount debited...available amout is : "+balance);
	}
}

class Customer implements Runnable
{
	String name;
	Account account;
	
	
	
	public Customer( Account account,String name) {
		super();
		this.name = name;
		this.account = account;
	}


	@Override
	public void run() {
		
		synchronized (account) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount By : "+name);
			double amt = sc.nextDouble();
			
			if(account.isAvailable(amt))
			{
				account.widrow(amt);
			}
			else
			{
				System.out.println("insufficient balance");
			}
		}
		
	}
	
}

public class T004_blocksyncronised {
		public static void main(String[] args) {
			
			Account account = new Account(10000);
			
			Customer c1 = new Customer(account,"Nidhi");
			Customer c2 = new Customer(account,"Kinjal");
			
			Thread t1 = new Thread(c1);
			Thread t2 = new Thread(c2);
			
			t1.start();
			t2.start();
		}
}
