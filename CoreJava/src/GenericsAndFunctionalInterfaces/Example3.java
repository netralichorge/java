package GenericsAndFunctionalInterfaces;

import java.util.function.Predicate;

import encapsulation.Student;

public class Example3 {

	public static void main(String[] args) {
		
		Predicate<Student> checkAge = new Predicate<Student>()
		{
			@Override
			public boolean test(Student t)
			{
				return t.getAge()>=18;
			}
		};
		
		Student student = new Student(101,"Priya",4);
		
		boolean ans = checkAge.test(student);
		
		System.out.println(ans);
	
	}

}
