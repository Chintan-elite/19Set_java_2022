package exception;
class Sample
{
	public void square(int i)
	{
		int sq = i*i;
		System.out.println(sq);
		i++;
		if(i<20)
		{
			square(i);
		}
	
	}
}

public class E001_Recursion {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.square(1);
		
	}
}
