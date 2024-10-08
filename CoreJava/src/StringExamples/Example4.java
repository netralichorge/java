package StringExamples;

public class Example4 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		s1=s1.concat(" world");
		
		System.out.println(s1);
		
		System.out.println("==================================");
		
		// trim method used for remove space start and end.
		
		System.out.println("  He     ll     o     ".trim());
		
		System.out.println("Netrali".length());
		
		System.out.println("Priya".charAt(1)); // charAt will get single character
		
		System.out.println("====================================");
		
		System.out.println("Apple".indexOf('p'));
		System.out.println("Laptop".indexOf('p',3)); // Start count from 3rd index
		
		System.out.println("====================");
		
		System.out.println("Laptop".startsWith("La"));
		
		String s2 = "Bottle";
		char arr[]=s2.toCharArray();
		for(char ch : arr)  // Enhance for loop
		{
			System.out.println(ch);
		}
		
		
		
		

	}

}
