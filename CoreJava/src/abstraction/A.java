package abstraction;

public class A implements I1{
	
	public void display()
	{
		System.out.println("Overriden method of A class");
		
	}
	
	public void square(int n)
	{
		System.out.println(n*n);
	}
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

}
