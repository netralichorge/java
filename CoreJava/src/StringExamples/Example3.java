package StringExamples;
import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		
		String password="X#123";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		sc.close();  //to remove warning
		
		// if(password.compareTo(pwd)==0)
		
		if(password.equals(pwd)) // equals method
			System.out.println("Login Successfull");
		else
			System.out.println("Login Failed");
		
			
	}

}
