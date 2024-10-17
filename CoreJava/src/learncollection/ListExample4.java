package learncollection;

import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(35);
		list.add(78);
		list.add(67);
		
		System.out.println(list);
		
		for(Integer i : list)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		list.add(2,90); // 2 is index and 90 is value insert in list
		System.out.println(list);
		
		System.out.println("-------------------------");
		
		Integer i = list.get(3);
		System.out.println(i);
		
		
		System.out.println("--------------------------");
		
		list.set(2,100);   // set method replace the things
		System.out.println(list);
		
		Predicate<Integer> even = (num)->num%2==0;
		list.removeIf((num)->num%2==0);
		System.out.println(list);
		

	}

}
