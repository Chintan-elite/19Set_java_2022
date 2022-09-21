package oops;

class P
{
	P()
	{
		System.out.println("Running p class constructor...");
	}
}

class Q extends P
{
	Q()
	{
		super();
		System.out.println("Running q class constructor...");
	}
	
	Q(int k)
	{
		this();
		System.out.println("Num is : "+k);
	}
	
	Q(String name)
	{
		this(10);
		System.out.println("name is  : "+name);
	}
}

class R extends Q
{
	R()
	{ 
	
		super("Tops");
		System.out.println("Running R class constructor...");
	}
	
	public void run()
	{
		System.out.println("Running run");
	}
}

public class O005_constructorChaining {
	public static void main(String[] args) {
		
		R a = new R();
		//a.run();
	}
}
