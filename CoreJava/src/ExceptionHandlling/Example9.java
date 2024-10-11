package ExceptionHandlling;

public class Example9 {
	
	public static void checkAge(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is Invalid");
		}
		else
		{
			System.out.println("Registration successfull");
		}
	}

	public static void main(String[] args) {
		
		checkAge(16);
			
	}

}
