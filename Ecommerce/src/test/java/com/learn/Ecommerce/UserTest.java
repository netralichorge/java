package com.learn.Ecommerce;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;

import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

@SpringBootTest
public class UserTest {
	
	@MockBean // it can not working on real database.
	private UserRepository userRepository;
	
	private User user;
	
	@BeforeEach 
	public void setUp() // before each method this method will be executed
	{
		user = new User();
		user.setId("U1234");
		user.setFirstname("Nisha");
		user.setLastName("Sharma");
		user.setPassword("Nisha@123");
		user.setEmailId("nisha@itvedant.com");
		user.setAge(24);
		
		Optional<User> optionalUser = Optional.of(user);
		
		Mockito.when(userRepository.findById("U1234")).thenReturn(optionalUser);
		
	}
	
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
	
	@Test
	public void testGetUserById()
	{
		User fetchedUser = userRepository.findById("U1234").get();
		String email="nisha@itvedant.com";
		assertEquals(email, fetchedUser.getEmailId());
	}
	
	@Test
	public void testUpdateUser()
	{
		user.setLastName("Gupta");
		Mockito.when(userRepository.save(user)).thenReturn(user);
		User updatedUser = userRepository.save(user);
		
		assertEquals("Gupta",updatedUser.getLastName());
	}
	
	@Test
	public void testDeleteUser()
	{
		userRepository.deleteById("U1234");
		
		Mockito.verify(userRepository).deleteById("U1234");
		
		Mockito.when(userRepository.existsById("U1234")).thenReturn(false);
		assertFalse(userRepository.existsById("U1234"));
		
		
	}
}
