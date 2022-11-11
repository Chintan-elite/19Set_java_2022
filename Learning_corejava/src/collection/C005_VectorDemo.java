package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C005_VectorDemo {
	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		v.addElement("Java");
		v.addElement("android");
		
		
		Enumeration<String> en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
		
	}
}
