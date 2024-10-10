package ExceptionHandlling;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter first number"); //One try block have multiple catch block
			int n1 = sc.nextInt();
			
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			
			System.out.println("Division is "+n1/n2);
			
		}
		
		catch(InputMismatchException ex)
		{
			System.out.println("Invalid input");
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("You cannot divide number by 0");
		}
		

	}

}
