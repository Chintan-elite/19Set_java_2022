package exception;
class BankOpraion
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Current balance is : "+balance);
	}
	
	public void credit(double amt)
	{
		balance = balance+amt;
	}
	
	public void debit(double amt) throws InsufficientBalanceException
	{
		if(balance<amt)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			balance = balance-amt;
		}
	}
}

public class Bank {
	public static void main(String[] args) {
		
		
		BankOpraion op = new BankOpraion();
		op.getBalance();
		op.credit(5000);
		op.credit(2000);
		
		op.getBalance();
		
		try {
			op.debit(8000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 op.getBalance();
	}
}
