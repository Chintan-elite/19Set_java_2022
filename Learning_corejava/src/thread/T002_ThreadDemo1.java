package thread;

class Th1 extends Thread
{ 
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName()+" : "+i);
		}
	}
}

public class T002_ThreadDemo1 {
	public static void main(String[] args) {
		
		
		Th1 t1 = new Th1();
		Th1 t2 = new Th1();
		Th1 t3 = new Th1();
		
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t2.start();
		t3.start();
		
		
	}
}
