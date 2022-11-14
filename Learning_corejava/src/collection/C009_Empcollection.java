package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class C009_Empcollection {
	public static void main(String[] args) {
		
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(10, "Tops", 596.55, "java"));
		emp.add(new Employee(05, "Saurabh", 589.36, "selenium"));
		emp.add(new Employee(12, "Nidhi", 485.69, "php"));
		emp.add(new Employee(25,"Kinjal", 3695.33, "Testing"));
		
		//Collections.sort(emp,new SortById());
		Collections.sort(emp, new SortByname());
		
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext())
		{
			itr.next().display();
		}
			
		
		
		
	}
}
