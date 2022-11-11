package collection;

import java.util.Stack;

public class C006_stackDemo {
	public static void main(String[] args) {
		
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		
		System.out.println(st.peek());
		System.out.println("*************");
		
		for(Integer s : st)
		{
			System.out.println(s);
		}
		
		
	}
}
