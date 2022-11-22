package thread;

class Sample
{
	public void display()
	{
		
	}
}

class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("T1 : "+i);
		}
	}
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("T2 : "+i);
		}
	}
}


public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		
		T1 t1 =new T1();
		T2 t2 = new T2();
		
		
		
		System.out.println(t1.getId()+" "+t2.getId());
		t1.setName("java");
		t2.setName("selenium");
		System.out.println(t1.getName()+" "+t2.getName());
		t1.setPriority(2);
		t2.setPriority(9);
		//t1.setPriority(Thread.MAX_PRIORITY);
		//t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority()+" "+t2.getPriority());
		
		t1.start();
		t2.start();
	}
}
