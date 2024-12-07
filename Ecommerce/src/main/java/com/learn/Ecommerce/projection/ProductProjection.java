package com.learn.Ecommerce.projection;

import org.springframework.beans.factory.annotation.Value;

public interface ProductProjection {
	//post man pe sirf product name display hoga
	String getProductName();
	
	@Value("#{target.category?.categoryName}") // target- current object 
	String getCategory();
	
}
