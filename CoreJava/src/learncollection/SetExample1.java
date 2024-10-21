package learncollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExample1 {

	public static void main(String[] args) {
		
		// it stores unique value
		// null value is allow
		// hashset not maintained insertion order
		HashSet<Integer> set= new HashSet<Integer>();
		
		set.add(23);
		set.add(23);
		set.add(69);
		set.add(87);
		set.add(null);
		
		System.out.println(set);
		
		System.out.println("----------------------");
		
		List<Integer> list = Arrays.asList(12,45,67,67,89,90,90);
		System.out.println(list);
		
		HashSet<Integer> hashSet = new HashSet<Integer>(list);
		System.out.println(hashSet);

	}

}
