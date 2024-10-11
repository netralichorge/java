package ExceptionHandlling;

public class Example10 {
	
	public static void checkNumber(int n) throws NegativeNumber // throws keyword handle the exception
	{
		if(n>0)
		{
			System.out.println(n);
		}
		
		else
		{
			throw new NegativeNumber("Number is negative");
		}
	}

	public static void main(String[] args) {
		
		try {
			checkNumber(8);
		} catch (NegativeNumber e) {
			
			System.out.println(e);
		}

	}

}
