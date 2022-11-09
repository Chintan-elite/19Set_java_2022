package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C002_linkedHashSetDemo2 {
	public static void main(String[] args) {
		
		//only one null allowed
		//initial size : 16
		//load factor : 0.75
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
