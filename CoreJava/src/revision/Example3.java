package revision;

import java.util.function.Predicate;

public class Example3 {

	public static void main(String[] args) {
		
		Predicate<Integer> n1=new Predicate<Integer>() {
			
			public boolean test(Integer i)
			{
				return i%7==0;
			}
			
			};
			boolean ans = n1.test(21);
			System.out.println(ans);
			
			Predicate<Integer> n2=(i)->i%7==0;
			boolean ans2 = n2.test(78);
			System.out.println(ans2);

	}

}
