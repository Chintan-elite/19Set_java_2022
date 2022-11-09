package backup;

public class S001_StringDemo {
	public static void main(String[] args) {
		
		String str = "data";
		String str1 = new String("data");
		
		//string is immutable/not changable
		String s =  str.concat("base");
		//System.out.println(s);
		
		
		String s1 = "java";
		String s2 = "selenium";
		String s3 = "java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		System.out.println("*******************");
		
		String st1 = new String("java");
		String st2 = new String("selenium");
		String st3 = new String("java");
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1 == st3);
		
		
		
	}
}
