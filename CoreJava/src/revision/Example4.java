package revision;

import java.util.function.Predicate;

public class Example4 {

	public static void main(String[] args) {
		
		Predicate<String> s1 = new Predicate<String>() {
			
			public boolean test(String s)
			{
				return s.length()<3;
				
			}
				
		};
		boolean ans = s1.test("Netrali");
		System.out.println(ans);

	}

}
