package learnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample8 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,3,6,2);
		
		Optional<Integer> reduce = numbers.stream().reduce((a,b)->a+b);
		
		System.out.println(reduce);

	}

}
