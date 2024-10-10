package ExceptionHandlling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		
		try
		{
			int n = sc.nextInt();
		}
		
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid input");
		}
		
		
		System.out.println("Code after taking input");
	}

}
