package inheritance;

class C
{
	void methodC()
	{
		System.out.println("Method of C class");
	}
}

class D extends C
{
	void methodD()
	{
		System.out.println("Method of D class");
	}
}

class E extends D
{
	void methodE()
	{
		System.out.println("Method of E class");
	}
}

class F extends E
{
	void methodF()
	{
		System.out.println("Method of F class");
	}
}

public class MultiLevelInheritanceExample {
	
	public static void main(String[] args) {
		
		F f1 = new F();
		f1.methodC();
		f1.methodD();
		f1.methodE();
		f1.methodF();
	}

}
