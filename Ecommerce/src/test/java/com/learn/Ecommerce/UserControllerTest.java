package com.learn.Ecommerce;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.controller.UserController;
import com.learn.Ecommerce.service.UserService;

@WebMvcTest(controllers = UserController.class) // testing for APIs
public class UserControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserService userService;
	
	@Test
	public void testGetUserById() throws Exception
	{
		UserDto user = new UserDto();
		user.setId("U123");
		user.setFirstname("Neha");
		user.setLastName("Sharma");
		user.setAge(23);
		user.setEmailId("neha@itvedant.com");
		
		Mockito.when(userService.getuserById("U123")).thenReturn(user);
		
		mockMvc.perform(get("/users/U123"))
		.andExpect(status().isFound())
		.andExpect(jsonPath("$.firstname").value("Neha"))
		.andExpect(jsonPath("$.lastName").value("Sharma"))
		.andExpect(jsonPath("$.emailId").value("neha@itvedant.com"));
	}
	
	@Test
	public void testAddUser() throws Exception
	{
		UserDto user = new UserDto();
		user.setId("U123");
		user.setFirstname("Neha");
		user.setLastName("Sharma");
		user.setAge(23);
		user.setEmailId("neha@itvedant.com");
		user.setConfirmPassword("User@1234");
		user.setPassword("User@1234");
		
		Mockito.when(userService.addUser(user)).thenReturn(user);
		
		mockMvc.perform(post("/users")
				.contentType("application/json")
				.content("{\"id\":\"U123\",\"firstname\":\"Neha\",\"lastName\":\"Sharma\",\"password\":\"User@1234\",\"confirmPassword\":\"User@1234\",\"age\":23,\"emailId\":\"neha@itvedant.com\"}"))
		.andExpect(status().isCreated())
		.andExpect(jsonPath("$.firstname").value("Neha"))
		.andExpect(jsonPath("$.lastName").value("Sharma"));
				
		
	}
	
	
	
}
