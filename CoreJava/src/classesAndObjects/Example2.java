package classesAndObjects;

public class Example2 {

	public static void main(String[] args) {
		
		Category c1 = new Category(1,"Electronics"); // object
		System.out.println(c1.categoryId);
		System.out.println(c1.categoryName);
		
		new Category();
		
	}

}
