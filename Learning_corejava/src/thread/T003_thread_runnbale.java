package thread;

class Td1 extends Sample implements Runnable
{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("td1 : "+i);
		}
		
	}
	
}

class Td2 implements Runnable
{

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("td2 : "+i);
		}
		
	}
	
}



public class T003_thread_runnbale {
	public static void main(String[] args) {
		
		
		Td1 t1 = new Td1();
		Td2 t2 = new Td2();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}
}
