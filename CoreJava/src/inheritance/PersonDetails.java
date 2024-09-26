package inheritance;

public class PersonDetails {

	public static void main(String[] args) {
	
		Person p1=new Person(101,"Nisha");
		
		SchoolPassOutPerson sp=new SchoolPassOutPerson(102,"Priti","A1234");
		
		CollegePassOutPerson cp=new CollegePassOutPerson(103,"Riya","A4563","CLG34");
		
		System.out.println(cp.id+" "+cp.name+" "+cp.schoolCertificateNo+" "+cp.collegeCertificateNo);;

	}

}
