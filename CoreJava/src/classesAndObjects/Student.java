package classesAndObjects;

public class Student {
	
	int studentId;
	String studentName;
	int studentAge;
	
	void setStudentDetails(int studentId, String studentName, int studentAge)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAge=studentAge;
		
		System.out.println(this.studentId+" "+this.studentName+" "+this.studentAge);
	}

}
