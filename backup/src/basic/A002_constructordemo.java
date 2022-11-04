package basic;

class Student
{
	int id;
	String name;
	
	public Student(int a, String b)
	{
		id = a;
		name = b;
	}
	
	public Student(int a)
	{
		id = a;
	}
	
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	
	
}

public class A002_constructordemo {
	public static void main(String[] args) {
		
		
		Student st = new Student(10,"tops");
		st.display();
		
		Student st1 = new Student(20,"tech");
		st1.display();
		
		Student st2 = new Student(10);
		st2.display();
	
		System.out.print("\n");
	}	
}
