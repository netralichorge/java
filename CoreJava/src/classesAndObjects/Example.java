package classesAndObjects;

public class Example {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductDetails(101,"Laptop",50000);
		
		System.out.println("You have to pay "+p1.discount());
		
		
		Product p2 = new Product();
		p2.setProductDetails(102,"Mobile",35000);
		System.out.println("You have to pay "+p2.discount());
	}

}
