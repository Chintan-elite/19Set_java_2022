package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class C010_MaoDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "java");
		map.put(20, "php");
		map.put(30, "selenium");
		map.put(10, "js");
		
		//System.out.println(map);
		
		System.out.println(map.get(10));
		
//		Iterator itr = map.entrySet().iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() +" : "+m.getValue());
		}
	}
}
