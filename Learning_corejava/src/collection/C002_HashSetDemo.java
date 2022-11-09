package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C002_HashSetDemo {
	public static void main(String[] args) {
		
		//only one null allowed
		//initial size : 16
		//load factor : 0.75
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("corejava");
		set.add("android");
		set.add("java");
		set.add("ios");
		set.add("sql");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
