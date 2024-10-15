package encapsulation;

public class ECP1 {

	public static void main(String[] args) {
		
		Student s1 = new Student(0, null, 0);
		
		s1.setId(101);
		// System.out.println(s1.getId());
		int id = s1.getId("U@1");
		System.out.println(id);
		
		s1.setName("Netrali");
		String name = s1.getName();
		System.out.println(name);
		
		
		s1.setAge(22);
		System.out.println(s1.getAge());
		
		

	}

}
