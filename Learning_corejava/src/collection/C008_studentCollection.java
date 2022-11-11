package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C008_studentCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(10, "Saurabh", "saurabh@gmail.com"));
		al.add(new Student(20, "nidhi", "nidhi@gmail.com"));
		al.add(new Student(4, "Kinjal", "kinjal@gmail.com"));
		
		Collections.sort(al);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext())
		{
			itr.next().display();
		}
			
		
		
	}
}
