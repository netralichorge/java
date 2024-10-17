package learncollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample6 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,56,78,90,0,1);
		System.out.println(numbers);
		
		Collections.sort(numbers); // sort method arrange list in ascending order
		System.out.println(numbers);
		
		
		System.out.println("Smallest Element "+numbers.get(0));
		
		System.out.println("Largest Element "+numbers.get(numbers.size()-1));

	}

}
