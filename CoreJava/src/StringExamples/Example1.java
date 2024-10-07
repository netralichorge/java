package StringExamples;

public class Example1 {

	public static void main(String[] args) {
		
// ways to create String
// 1) By using String Literal
		
		String a="Hello";
		String c="Hello";
		
// 2) By using new keyword
		
		String b = new String("Hello");
		String d = new String("Hello");
		
		System.out.println("========================================");
		
		System.out.println(a==b);
		System.out.println(b==d);
		System.out.println(b==c);

	}

}

// It is checking for reference
