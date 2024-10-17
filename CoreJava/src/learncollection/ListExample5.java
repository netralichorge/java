package learncollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample5 {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Kiran");
		names.add("Raj");
		names.add("Gurjeet");
		names.add("Priti");
		
		System.out.println(names);
		
		Predicate<String> rem  = (name)->name.startsWith("P");
		
		names.removeIf((name)->name.startsWith("P"));
		
		System.out.println(names);
		
		System.out.println("------------------------------");
		
		LinkedList<Product> products = new LinkedList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",7000));
		
		System.out.println(products);
		
		products.removeIf(p->p.getPrice()<10000);
		System.out.println(products);
		
		
		

	}

}
