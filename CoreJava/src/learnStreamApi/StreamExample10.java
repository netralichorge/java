package learnStreamApi;

import java.util.ArrayList;
import java.util.Optional;

public class StreamExample10 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=100; i++)
		{
			list.add(i);
		}
		
		System.out.println(list);
		
		Optional<Integer> any = list.parallelStream().findAny();
		System.out.println(any);
		
		list.parallelStream().forEach(n->System.out.println(n));
		
		System.out.println("---------------------------------------");
		
		boolean evenMatch = list.stream().anyMatch(n->n%2==0);
		
		System.out.println(evenMatch);
		
		System.out.println("---------------------------------------");
		
		boolean greaterThan1000 = list.stream().anyMatch(n->n>1000);
		System.out.println(greaterThan1000);
		
		System.out.println("---------------------------------------");
		
		boolean match=  list.stream().allMatch(n->n%2==0);
		System.out.println(match);
		
		System.out.println("---------------------------------------");
		
		boolean m=  list.stream().noneMatch(n->n>100);
		System.out.println(m);

	}

}
