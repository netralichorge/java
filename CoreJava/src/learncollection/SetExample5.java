package learncollection;

import java.util.TreeSet;

public class SetExample5 {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(45);
		treeset.add(90);
		treeset.add(56);
		treeset.add(15);
		treeset.add(12);
		treeset.add(8);
		
		System.out.println(treeset);
		
		System.out.println(treeset.higher(19));
		
		System.out.println(treeset.lower(10));
		
		System.out.println("---------------------");
		
		System.out.println(treeset.ceiling(78));// if number present in list then number print else higher number print
		
		System.out.println(treeset.floor(14));
		
		System.out.println("-------------------------");
		
		System.out.println(treeset.headSet(45));
		
		System.out.println(treeset.headSet(45,true)); // true for including 45
		
		System.out.println("------------------------");
		
		System.out.println(treeset.tailSet(15));
		
		System.out.println(treeset.tailSet(15,false));
		
		System.out.println("----------------------------");
		
		System.out.println(treeset.subSet(12,56));
		
		System.out.println(treeset.subSet(12,false,56,true));

	}

}
