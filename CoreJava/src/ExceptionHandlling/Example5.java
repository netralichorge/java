package ExceptionHandlling;

public class Example5 {

	public static void main(String[] args) {
		
		try
		{
			System.out.println(5/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception handle");
		}
		
		finally  // finally block always execute
		{
			System.out.println("finally block");
		}

		System.out.println("Code after exception");
	}

}
