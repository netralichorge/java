class Employee
{
	int empId;
	String empName;
	int salary;
	
	void setEmpDetails(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		
		System.out.println(this.empId+" "+this.empName+" "+this.salary);
	}
}

class Demo24
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setEmpDetails(101,"Riya",25000);
		
		Employee e2=new Employee();
		e2.setEmpDetails(102,"Meet",45000);
		
	}
}