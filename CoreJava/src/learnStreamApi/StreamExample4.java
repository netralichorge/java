package learnStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,56,1,3,5,90);
		
		Stream<Integer> even =list.stream().filter(n->n%2==0);
		
		even.forEach((n)->System.out.println(n));
		
	}

}
