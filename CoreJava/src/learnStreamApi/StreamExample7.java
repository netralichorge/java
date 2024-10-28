package learnStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import learncollection.Product;

public class StreamExample7 {

	public static void main(String[] args) {
		
		// map returns the value
		
		List<Integer> numbers = Arrays.asList(12,5,6,7);
		
		Function<Integer, Integer> squareFunctions = (n)->n*n;
		
		List<Integer> squares = numbers.stream()
				.map(squareFunctions)
				.collect(Collectors.toList());
		
		System.out.println(squares);
		
		System.out.println("------------------------");
		
		
		List<Integer> collect = numbers.stream()
				.map(n->n*10)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("-------------------------------------");
		
		List<String> names = Arrays.asList("Pooja","Sanika","Amit","Gurjeet","Shriya");
		
		List<Integer> length = names.stream()
				.map(name->name.length())
						.collect(Collectors.toList());
				
		System.out.println(length);
		
		System.out.println("------------------------------");
		
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",35000));
		products.add(new Product(103,"Headphones",7000));
		
		List<String> name = products.stream().map(p->p.getName())
				.collect(Collectors.toList());
		
		System.out.println(name);
				

	}

}
