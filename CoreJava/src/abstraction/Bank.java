package abstraction;

public interface Bank {
	
	void details();  
	void address();
	default void methodBank()        //default methods are allow in interface
	{
		System.out.println("Default method");
	}
	
	
	static void staticMethod()
	{
		System.out.println("Static method from bank"); // Static methods are allows in interface.
	}

}
