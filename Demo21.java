class Student
{
	int rollNo;  // Instance variables
	String name;
}


class Demo21
{
	public static void main(String args[])
	{
		Student s1=new Student(); // object
		
		s1.rollNo=101;
		s1.name="Netrali";
		
		Student s2=new Student();
		
		s2.rollNo=102;
		s2.name="Gurjeet";
		

		System.out.println(s1.rollNo);
		System.out.println(s1.name);
		System.out.println(s2.rollNo);
		System.out.println(s2.name);
		
	}
}