package backup;

public class S002_Stringmethods {
	public static void main(String[] args) {
		
		
		String str= "Java is platform independent";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.charAt(5));
		System.out.println(str.endsWith("t"));
		System.out.println(str.startsWith("K"));
		System.out.println(str.replace("i", "K"));
		System.out.println(str.substring(8,12));
		System.out.println(str.trim());
		
		System.out.println("****************");
		
		 String s[] =  str.split(" ");
		 for(int i=0;i<s.length;i++)
		 {
			 System.out.println(s[i]);
		 }
		
		 System.out.println("***************");
		 
		 char ch[] = str.toCharArray();
		 for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		 
		 System.out.println("****************");
		 
		 byte b[] = str.getBytes();
		 
		 for (int i = 0; i < b.length; i++) {
			
			 System.out.println(b[i]);
		}
		 
		 
		 
	}
}
