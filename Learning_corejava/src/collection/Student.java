package collection;

public class Student  implements Comparable<Student>{
	
	int id;
	String name;
	String email;
	
	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}

	@Override
	public int compareTo(Student o) {
		
		int i1 = o.id;      //  10 20
		int i2 = this.id;   //  20 4
		int k = 0;
		if(i2>i1)
		{
			k = -1; //nagative
		}
		else if(i2<i1)
		{
			k = 1; //positive
		}
		else
		{
			k=0;
		}
		return k;
	}
	
}
