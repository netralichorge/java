package abstraction;

abstract class Product
{
	abstract void details();
}

class Mobile extends Product
{
	void details()
	{
		System.out.println("Mobile details");
	}
}


public class AbstractionExample2 {
	
	public static void main(String[] args) {
		
		 Mobile mb = new Mobile();
		 mb.details();
		 
		 // Anonymous Inner class
		 
		 Product laptop = new Product()
		 {
			 void details()
			 {
				 System.out.println("Laptop details");
			 }
		 };
		 
		 laptop.details();
		 
		 Product headphones = new Product()
		 {
			 void details()
			 {
				 System.out.println("Headphone details");
			 }
		};
		
		headphones.details();
		
	}

}
