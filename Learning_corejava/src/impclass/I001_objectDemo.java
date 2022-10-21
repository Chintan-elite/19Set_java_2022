package impclass;

class Sample 
{
	int id = 10;
	public void display()
	{
		
	}
	
	@Override
	public String toString() {
		
		return "ku6bhi"+"id : "+id;
	}
}
class Demo extends Sample
{
	int id = 20;
	String name = "tops";
	
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class I001_objectDemo {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		System.out.println(s);
		
		Demo d = new Demo();
		System.out.println(d);
		
		
	}
}
