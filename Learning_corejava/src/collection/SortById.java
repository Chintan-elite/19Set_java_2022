package collection;

import java.util.Comparator;

public class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		int id1 = o1.eid; //new id  
		int id2 = o2.eid; //exist  
		int k=0;
		if(id1>id2)
		{
			k=-1;
		}
		else if(id1<id2)
		{
			k=1;
		}
		else
		{
			k=0;
		}
		return k;
	}

}
