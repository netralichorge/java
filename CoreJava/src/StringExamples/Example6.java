package StringExamples;

public class Example6 {

	public static void main(String[] args) {
		
		// String Builder and String Buffer both are mutable
		
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.reverse();
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		System.out.println("----------------------");
		
		sb.replace(0, 2, "*************");
		// 2 is exclusive
		
		System.out.println(sb);

		System.out.println("----------------------");
		
		sb.append("world"); // append used for combine string at the end
		System.out.println(sb);
		
		System.out.println("----------------------");
		
		sb.delete(0, 15);
		System.out.println(sb);
		
		

	}

}
