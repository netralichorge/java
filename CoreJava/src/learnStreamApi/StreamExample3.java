package learnStreamApi;

import java.util.ArrayList;

import learncollection.Product;

public class StreamExample3 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",7000));
		
		products.stream()
		.forEach((p)->System.out.println(p.getName()+" "+(p.getPrice()*0.8)));
		
	}

}
