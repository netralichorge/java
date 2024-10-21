package learncollection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListExample8 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(18);
		list.add(24);
		list.add(47);
		
		Iterator<Integer> iterator = list.iterator();
		
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
