package backup;

class StM
{
	public String rev(String st)
	{
		String s=null;
		char ch[] = st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		
		return s;
	}
	
	public void count(String s)
	{
		char ch[] = s.toCharArray();
		int c = 0;
		for(int i=0;i<ch.length;i++)
		{
			c++;
		}
		System.out.println("length is : "+c);	
	}
}

public class S003_strinManipulation {
	public static void main(String[] args) {
		
		
		StM st = new StM();
		st.rev("hello");
		System.out.println();
		st.rev("hello java");
		System.out.println("");
		st.count("abc");
	}
	
	
}
