package learncollection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedHashMap<String, String> phoneNumbers = new LinkedHashMap<String, String>();
		
		phoneNumbers.put("Priti", "8967452398");
		phoneNumbers.put("Pooja", "8756340987");
		phoneNumbers.put("Amit", "9834568712");
		
		System.out.println(phoneNumbers);
		
		String name = sc.next();
		
		if(phoneNumbers.containsKey(name))
		{
			System.out.println("Your phone number is pressent "+phoneNumbers.get(name));
			System.out.println("Do you want to change it??(y/n)");
			char decision = sc.next().charAt(0);
			
			if(decision=='y')
			{
				String newPhoneNo= sc.next();
				phoneNumbers.put(name, newPhoneNo);
			}
		}
		else
		{
			String phoneNo = sc.next();
			phoneNumbers.put(name,phoneNo);
		}
		
		System.out.println(phoneNumbers);
		
	}

}
