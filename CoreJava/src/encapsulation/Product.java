package encapsulation;

public class Product {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Product() {
		super();
		
	}
	// POJO - plain old java class
	// display hash code on output screen then use toString method.
	// we can use toString method in all classes.
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	

}
