package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class C012_MapPractice2 {
	public static void main(String[] args) {
		
		
		String str = "hello java java hello top hello world";
		char ch[] = str.toCharArray();
		
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(map.get(ch[i])==null)
			{
				map.put(ch[i], 1);
			}else
			{
				int k = map.get(ch[i]);
				k++;
				map.put(ch[i], k);
			}
		}
		
		
		Iterator itr =  map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
