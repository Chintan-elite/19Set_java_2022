
class Pen
{
	String color = "red";
	int price = 200;
	
	public void toWrite()
	{
		System.out.println(color+" "+price);
	}
	
	public void toWrite(String abc)
	{
		System.out.println(color+" "+price);
	}
}
class notebook extends Pen
{
	public void todisplay()
	{
		System.out.println(color+" "+price);
	}
}
public class MyApp {
	public static void main(String[] args) {
		
		System.out.println("Program started...");
		Pen p = new Pen();
		p.toWrite();
	}
}
