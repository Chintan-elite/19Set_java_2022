package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C004_Treeset {
	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("corejava");
		set.add("android");
		set.add("java");
		set.add("ios");
		set.add("sql");
		
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
