package learnStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamExample9 {

	public static void main(String[] args) {
		
		// List<Integer> numbers = Arrays.asList(12,45,3,4,9);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		Optional<Integer> first = numbers.stream().findFirst();
		
		System.out.println(first);
		
		// Integer integer = first.get();
		// System.out.println(integer);
		
		Integer i = first.
				orElseThrow(()->new ArithmeticException("List is empty"));
		
		System.out.println(i);

	}

}
