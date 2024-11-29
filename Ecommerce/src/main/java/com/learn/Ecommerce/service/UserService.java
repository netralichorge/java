package com.learn.Ecommerce.service;

import java.util.List;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;

public interface UserService {
	
	// To add user
	UserDto addUser(UserDto userDto);
	
	//To fetch all users
	List<UserDto> getAllUsers();
	
	// To fetch user by id
	UserDto getuserById(String id);
	
	// To fetch user by emailId
	UserDto getUserByEmail(String email);
	
	// update user by Id
	UserDto updateUser(String id,UserDto userDto);
	
	//To delete user by Id
	String deleteUser(String id);
	
	// Entity to DTO conversion
	UserDto entityToDto(User user);
	
	//DTO to entity conversion
	User dtoToEntity(UserDto userDto);
	
	// To fetch user by FirstName
	List<UserDto> getUserByFirstName(String firstname);

	

	
	

}
