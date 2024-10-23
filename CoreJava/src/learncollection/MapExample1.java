package learncollection;

import java.util.HashMap;
import java.util.Set;

public class MapExample1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> students = new HashMap<Integer,String>();
		
		students.put(101, "Pooja");  // insertion order will not maintained
		students.put(102, "Amit");  // key are always unique
		students.put(103, "Joel");   // value can be duplicate 
		students.put(null, null);  // only one null key value allowed
		students.put(101,"Netrali"); // key is  duplicate then value is override
		
		System.out.println(students);
		
		System.out.println(students.get(1));
		
		// the key value not present in data then print default value
		System.out.println(students.getOrDefault(1011,"Hello")); 
		
		System.out.println(students.getOrDefault(101,"Hello")); 
		
		System.out.println("----------------------");
		
		System.out.println(students.remove(101));
		System.out.println(students);
		
		System.out.println("-----------------------");
		
		System.out.println(students.keySet());
		
		System.out.println("-----------------------");
		
		System.out.println(students.values());
		
		System.out.println("-----------------------");
		
		Set<Integer> keys = students.keySet();
		
		for(Integer k : keys)
		{
			System.out.println(k+" "+students.get(k));
		}
		
		System.out.println("-------------------------------");
		
		System.out.println(students.containsKey(101));  // containsKey display output in boolean form
		
		System.out.println("-------------------------------");
		
		System.out.println(students.containsValue("Amit"));
	
	}

}
