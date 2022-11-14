package collection;

import java.util.Comparator;

public class SortByname implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		String n1 = o1.name; //new
		String n2 = o2.name; //exist
		
		return - n1.compareTo(n2);
	}

}
