package string;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		
		String s = "Sun Ries In East";
		
		System.out.println("Length : "+s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('n'));
		System.out.println(s.lastIndexOf('n'));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,13));
		System.out.println(s.trim());
		System.out.println(s.endsWith("u"));
		System.out.println(s.startsWith("S"));
		
		String s1 = "javA";
		String s2 = "Java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		System.out.println("**********************");
		
		 String arr[] = s.split(" ");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		
		 System.out.println("***********************");
		 
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		 
		System.out.println("*********************");
		
		byte b[] = s.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
	}
}
