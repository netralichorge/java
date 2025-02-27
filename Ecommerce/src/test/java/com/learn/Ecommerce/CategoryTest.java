package com.learn.Ecommerce;

import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.learn.Ecommerce.entity.Category;
import com.learn.Ecommerce.repository.CategoryRepository;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@SpringBootTest
public class CategoryTest {
	
	@MockBean
	private CategoryRepository categoryRepository;
	

	@Test
	public void testCreateCategory()
	{
		Category newCategory = new Category();
		
		newCategory.setCategoryId(111);
		newCategory.setCategoryName("Electronics");
		
		Mockito.when(categoryRepository.save(newCategory)).thenReturn(newCategory);
		
		Category savedCategory = categoryRepository.save(newCategory);
		assertNotNull(savedCategory);
		assertEquals("Electronics",savedCategory.getCategoryName());
	}
	

}
