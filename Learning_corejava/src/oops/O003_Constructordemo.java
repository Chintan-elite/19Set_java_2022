package oops;

class Student
{
	int id;
	
	String name;
	
	Student(int id, String name)
	{
		this.id =id;
		this.name=name;
	}
	
	Student(int id)
	{
		this.id =id;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}
public class O003_Constructordemo {

	
	public static void main(String[] args) {
		
		Student s1 = new Student(10,"tops");
		s1.display();
		
		Student s2 = new Student(20,"tech");
		s2.display();
		
		Student s3 = new Student(25);
		s3.display();
		
		
		
	}
	
}
