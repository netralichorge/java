package learncollection;

import java.util.ArrayList;

public class ListExample3 {

	public static void main(String[] args) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",7000));
		
		System.out.println(products);
		
		for(Product p:products)
		{
			System.out.println(p);
					
		}
		
		System.out.println("--------------");
		
		for(Product p:products)
		{
			if(p.getPrice() > 20000)
			{
				System.out.println(p);
			}
					
		}
		
		System.out.println("-------------------");
		
		for(Product p:products)
		{
			if(p.getName().startsWith("M"))
			{
				System.out.println(p);
			}
		}
		

	}

}
