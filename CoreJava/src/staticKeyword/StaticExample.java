package staticKeyword;

public class StaticExample {
	
	static {
		System.out.println("Static block");
	}

	public static void main(String[] args) {
		Employee.ceo="Priyanka";
		
		// for ChangeCeo("Nisha)
		
		Employee.changeCeo("Nisha");
		
		Employee e1=new Employee(101,"Netrali");
		Employee e2=new Employee(102,"Shriya");
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);

	}

}
