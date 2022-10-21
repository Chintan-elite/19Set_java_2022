package basic;

class Student
{
	int id;
	String name;
	
	Student(int a, String b)
	{
		id = a;
		name = b;
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
		
		
	}
}
