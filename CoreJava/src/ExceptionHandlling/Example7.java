package ExceptionHandlling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example7 {
	
	// throws keyword used throw the exception to main method
	
	public static void fileHandling() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try
		{
			fileHandling();
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		

	}

}
