package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		
		//default inialization : 10
		// ( oldsize * 3/2 )+ 1 : 16
		// maintain insertion order 
		//allowed duplication
		//allowed multiple null
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("android");
		al.add(null);
		al.add(".net");
		al.add("pl,sql");
		al.add("node");
		al.add("react");
		al.add("rubby");
		al.add("angular");
		al.add("express");
		al.add("java");
		
		//al.add(2,"sql");
		//al.set(2, "sql");
		//al.remove(2);
		//System.out.println(al.size());
		//System.out.println(al.get(1));
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("cricket");
		al1.add("Hockey");
		//al1.addAll(al);
		
		
//		for(String s : al1)
//		{
//			System.out.println(s);
//		}
//		
		
//		Iterator<String> itr = al1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for (int i = 0; i < al.size(); i++) {
			if(i%2!=0)
			{
				System.out.println(al.get(i));
			}
		}
		
		
		
	}
}
