package inheritance;

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101,"Priya",40000);
		
		FullTimeEmployee f1=new FullTimeEmployee(102,"Rutu",48000,5,2000000);
		
		PartTimeEmployee p1=new PartTimeEmployee(103,"Raj",42000,10000);
		
		System.out.println(e1.id+" "+e1.name+" "+e1.monthlySalary);
		
		System.out.println(f1.id+" "+f1.name+" "+f1.monthlySalary+" "+f1.noOfLeaves+" "+f1.insurance);
		
		System.out.println(p1.id+" "+p1.name+" "+p1.monthlySalary+" "+p1.bonus);
		

	}

}
