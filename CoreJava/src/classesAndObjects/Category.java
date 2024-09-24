package classesAndObjects;

public class Category {
	
	int categoryId;
	String categoryName;
	
	// Constructor
	// constructor name always same as class name
	// Constructor call automatically
	// java create default constructor
	
	Category()  // Non-parameterized constructor
	{
		System.out.println("Category object created");
	}
	
	Category(int categoryId,String categoryName) // Parameterized constructor
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	
	}
	
	Category(String categoryName,int categoryId)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	
	}
	

}
