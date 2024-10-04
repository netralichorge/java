package abstraction;

@FunctionalInterface
interface Test       
{
	boolean isEven(int n);
}

//interface it has only one abstract method is called functional interface
// (n)->n%2==0; code after ()-> is implementation of abstract method

public class ExampleInterface3 {

	public static void main(String[] args) {
		
	/*	new Test() {
			public boolean isEven(int n)
			{
				return n%2==0;
			}
		};
	*/
		
		Test t1=(n)->n%2==0;
		boolean ans = t1.isEven(50);
		System.out.println(ans);
		
		

	}

}
