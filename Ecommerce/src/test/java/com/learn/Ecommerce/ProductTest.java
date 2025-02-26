package com.learn.Ecommerce;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import com.learn.Ecommerce.entity.Product;
import com.learn.Ecommerce.repository.ProductRepository;

@SpringBootTest
public class ProductTest {
	
	@MockBean
	private ProductRepository productRepository;
	
	@Test
	public void testCreateProduct()
	{
		Product newProduct = new Product();
		
		newProduct.setProductId(101);
		newProduct.setProductName("Mobile");
		newProduct.setProductPrice(45000);
		
		Mockito.when(productRepository.save(newProduct)).thenReturn(newProduct);
		
		Product savedProduct = productRepository.save(newProduct);
		assertNotNull(savedProduct);
		assertEquals("Mobile",savedProduct.getProductName());
	}

}
