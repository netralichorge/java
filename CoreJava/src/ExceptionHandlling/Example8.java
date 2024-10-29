package ExceptionHandlling;

public class Example8 {
	
	//throw keyword used for throw exception
	
	public static void throwException()
	{
		throw new NullPointerException("Priti");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		try 
		{
			throwException();
		
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Bye");
			

	}

}
