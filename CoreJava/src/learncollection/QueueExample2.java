package learncollection;

import java.util.PriorityQueue;

public class QueueExample2 {

	public static void main(String[] args) {
		
		PriorityQueue<Product> products = new PriorityQueue<Product>((p1,p2)->p2.getPrice()-p1.getPrice());
		
		products.add(new Product(102,"Mobile",50000));
		products.add(new Product(103,"Headphone",8000));
		products.add(new Product(101,"Laptop",70000));
		
		
		System.out.println(products.peek());

	}

}
