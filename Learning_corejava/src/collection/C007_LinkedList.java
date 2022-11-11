package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class C007_LinkedList {
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(10);
		link.add(20);
		link.add(30);
		
		//link.removeFirst();
		link.set(1, 50);
		
		Iterator<Integer> itr = link.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
