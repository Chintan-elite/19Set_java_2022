package thread;

class Calc
{
	synchronized public void mul(int a)
	{
		for(int i=1;i<=10;i++)
		{	
			Thread T = Thread.currentThread();
			System.out.println(T.getName()+" : "+(a*i));
		}
	}
}

class CalcT implements Runnable
{
	Calc c = new Calc();
	@Override
	public void run() {
		
		c.mul(5);
	}
	
}

public class T005_MethodSync
{
	public static void main(String[] args)
	{
		
		
		CalcT c1 = new CalcT();
	//	CalcT c2 = new CalcT();
	//	CalcT c3 = new CalcT();
		
		Thread  t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		Thread t3 = new Thread(c1);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
