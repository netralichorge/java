package learncollection;

import java.util.LinkedList;

public class QueueExample3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.addLast(50);  // addLast method same as add method
		
		for(int i=1; i<=10; i++)
		{
			list.add(i);
		}
		
		list.addFirst(12);  // addfirst method add element on first
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		// remove first and last element
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

	}

}
