package classesAndObjects;

public class Product {
	
	int productId;
	String productName;
	int productPrice;
	
	void setProductDetails(int productId, String productName, int productPrice)
	{
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		
		System.out.println(this.productId+" "+this.productName+" "+this.productPrice);
	}
	double discount()
	{
		return this.productPrice*0.8;
	}

}
