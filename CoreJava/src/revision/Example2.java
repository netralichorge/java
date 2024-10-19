package revision;

@FunctionalInterface
interface I3
{
	void printAnyName(int n);
}

@FunctionalInterface
interface I5
{
	int add(int a, int b);
}

public class Example2 {

	public static void main(String[] args) {
		
		I3 name =(n)->{
			
			for(int i=1; i<=n; i++)
			{
				System.out.println("Netrali");
			}	
		};
		
		name.printAnyName(6);
		
		//Annonemous Inner Class
		
		I5 i= new I5() {
			
			public int add(int a, int b)
			{
				return a+b;
			}
		};
		
		System.out.println(i.add(20,10));
		
		//Lambda for I5 interfacce
		
		I5 s =(a,b)->a+b;
		
		System.out.println(s.add(7,10));
		

	}

}
