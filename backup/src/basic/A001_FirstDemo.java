package basic;

class Pen
{
	//data member
	static int price = 10;
	String color = "red";
	String company = "cello";
	
	//function member
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("Running display");
	}
}

public class A001_FirstDemo {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		p.price=500;
		p.toWrite();
		p.display();
		
		
		Pen p1 = new Pen();
		p1.color="black";
		p1.toWrite();
		p1.display();
		
		Pen.display();
		//Pen.toWrite();
	}
}
