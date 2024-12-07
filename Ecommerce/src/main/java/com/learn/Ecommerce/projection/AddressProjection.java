package com.learn.Ecommerce.projection;

public interface AddressProjection {
	// for modify the json user projection
	String getCity();
	String getState();
	
	default String getAddress()
	{
		// for address:"mumbai,maharashtra" this type of output
		return getCity()+" , "+getState();  
	}


}
