package learncollection;

import java.util.ArrayList;

public class ListExample1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		list.add(56);  // add method use for add values
		list.add("N");
		list.add(null);
		list.add(45.67);
		
		System.out.println(list);
		
		for(Object i : list)
		{
			System.out.println(i);
			
		}

	}

}
