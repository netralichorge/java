package polymorphism;

public class Calculator {
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	
	void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	
	void sub(float a, int b)
	{
		System.out.println(a-b);
	}
	
	void sub(float a, float b,int c)
	{
		System.out.println(a-b-c);
	}
	
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	
	void mul(float a,float b)
	{
		System.out.println(a*b);
	}

}
