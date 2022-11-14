package collection;

public class Employee {
	
	int eid;
	String name;
	double sal;
	String dept;
	public Employee(int eid, String name, double sal, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
	}
	
	public void display()
	{
		System.out.println(eid+" "+name+" "+sal+" "+dept);
	}
	
	
}
