package inheritance;

class Student
{
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo,String name,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
}

class SportStudent extends Student
{
	int graceMarks;
	String SportName;
	
	SportStudent(int rollNo,String name,int marks,int graceMarks,String SportName)
	{
		super(rollNo,name,marks);
		this.graceMarks=graceMarks;
		this.SportName=SportName;
	}
}

public class Inheritance_2 {
	
	public static void main(String[] args) {
		
		 SportStudent sp1=new SportStudent(10,"Amit",95,5,"Kabaddi");
		 
		 System.out.println(sp1.rollNo);
		 
		
	}

}
