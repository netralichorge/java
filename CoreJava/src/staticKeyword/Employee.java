package staticKeyword;

public class Employee {
	
	int empId;
	String empName;
	static String ceo="Amit";
			
	Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	static void changeCeo(String ceoName)
	{
		ceo=ceoName;
	}

}
