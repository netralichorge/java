package learncollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {

	public static void main(String[] args) {
		
		// It will have null value
		//maintained insertion order in LinkedHashSet
		// set method removes duplicate values
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(46);
		set.add(46);
		set.add(78);
		
		System.out.println(set.size());
		
		System.out.println("----------------");
		
		Iterator<Integer> iterator = set.iterator();
		
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}

}
