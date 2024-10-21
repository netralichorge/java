package learncollection;

import java.util.Stack;
import java.util.Scanner;

public class ListExample10 {
	
	public static void main(String[] args) {
		
		Stack<Product> products = new Stack<Product>();
		
		products.push(new Product (101,"Laptop",50000));
		products.push(new Product(102,"Mobile",35000));
		products.push(new Product(103,"Headphones",7000));
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Do you want to delete last added item?(Y/N)");
		
		System.out.println(products.peek());
		
		char decision = sc.next().charAt(0);
		
		if(decision == 'Y' || decision == 'y')
		{
			System.out.println(products.peek().getName()+ " deleted");
		}
	}
	
}


