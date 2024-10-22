package learncollection;

import java.util.TreeSet;

public class SetExample6 {

	public static void main(String[] args) {
		TreeSet<Product> products = new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
		
		products.add(new Product(101,"Laptop",70000));
		products.add(new Product(102,"Mobile",50000));
		products.add(new Product(10,"Headphone",8000));
		
		System.out.println(products);
		
	}

}
