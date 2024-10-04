package abstraction;

@FunctionalInterface
interface I2
{
	void printName(String name);
}

@FunctionalInterface
interface I3
{
	int add(int a, int b);
}

@FunctionalInterface
interface I4
{
	int square(int n);
}

public class ExampleInterface4 {

	public static void main(String[] args) {
// interface name object_name =(parameter)->
		
		I2 obj = (name)->System.out.println("My name is "+name);
		obj.printName("Netrali");
		
		I2 obj1 = (name)->{
			for(int i=1; i<=100; i++)
			{
				System.out.println(name);
			}
		};
		
		obj1.printName("Priti");
		
		
		I3 i =(a,b)->a+b;
		System.out.println(i.add(20,10));
		// OR
		/*int ans = i.add(20,10);
		System.out.println(ans);
		*/
			
		
		I4 sq =(n)->n*n;
		System.out.println(sq.square(4));
		

	}

}
