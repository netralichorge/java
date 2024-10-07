package StringExamples;

public class Example2 {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "HELLO";
		
		//use equals method for the comparesion
		
		System.out.println(a.equals(b));
		System.out.println(b.equals("HELLO"));
		
		System.out.println("===============================");
		
		System.out.println(a.equalsIgnoreCase(b));// Ignore Upper and Lower case
		
		System.out.println("===============================");
		
		String c = "A";
		String d = "a";
		
		System.out.println(c.compareTo(d)); // check ASCII values
		
		System.out.println("===============================");
		
		String s = "INDIA";
		System.out.println(s.toLowerCase());
		//s=s.toLowerCase();
		System.out.println(s);

	}

}
