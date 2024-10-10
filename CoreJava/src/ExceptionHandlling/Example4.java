package ExceptionHandlling;

public class Example4 {

	public static void main(String[] args) {
		
		String s = "Laptop";
		try
		{
			s.charAt(80); // System.out.println(s.charAt(80));
		}
		
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("Invalid index");
		}
		
		System.out.println("Code after exception");
	
		

	}

}
