package ExceptionHandlling;

public class NegativeNumber extends Exception { // for compiletime exception class extends Exception
	
	public NegativeNumber()
	{
		super();
	}
	
	public NegativeNumber(String message)
	{
		super(message);
	}


}
