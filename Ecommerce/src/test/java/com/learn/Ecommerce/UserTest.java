package com.learn.Ecommerce;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

@SpringBootTest
public class UserTest {
	
	@MockBean // it can not working on real database.
	private UserRepository userRepository;
	
	@Test
	public void testCreateUser()
	{
		User newUser = new User();
		newUser.setId("U1234");
		newUser.setFirstname("Nisha");
		newUser.setLastName("Sharma");
		newUser.setPassword("Nisha@123");
		newUser.setEmailId("nisha@itvedant.com");
		newUser.setAge(24);
		
		Mockito.when(userRepository.save(newUser)).thenReturn(newUser);
		
		User savedUser = userRepository.save(newUser);
		assertNotNull(savedUser);
		assertEquals("Nisha", savedUser.getFirstname());
		
	}
	

}
