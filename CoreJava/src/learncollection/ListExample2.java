package learncollection;

import java.util.ArrayList;

public class ListExample2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(46);
		list.add(67);
		list.add(34);
		list.add(19);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		System.out.println(list.size());  //size use for count size of arraylist
		
		System.out.println("----------------------------");
		
		list.remove(2);               // remove use for remove element in arraylist
		System.out.println(list);
		
		
		list.remove(list.size()-1);
		System.out.println(list);
		
		System.out.println("----------------------------");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(101);
		list2.add(102);
		list2.add(103);
		
		list.addAll(list2); // addAll use for add all elements in one arraylist 
		System.out.println(list);
		
		System.out.println("----------------------");
		
		list.removeAll(list2);  // used for remove elements in arraylist
		System.out.println(list);
		
		System.out.println("----------------------");
		
		list.clear();
		System.out.println(list);

		
		
	}

}
