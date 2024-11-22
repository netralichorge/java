package com.learn.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	
	//POST["/users"] TO add user
	
	@PostMapping
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto)
	{
		UserDto savedUser = userService.addUser(userDto);
		return new ResponseEntity<UserDto>(savedUser,HttpStatus.CREATED);
	}
	
	// GET ["/users/101"] To fetch by id
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getuserById(@PathVariable String id)
	{
		UserDto userDto = userService.getuserById(id);
		return new ResponseEntity<UserDto>(userDto,HttpStatus.FOUND);
	}
	
	//GET ["/users"] To fetch all users
	
	@GetMapping
	public ResponseEntity<List<UserDto>> fetchAllusers()
	{
		List<UserDto> users = userService.getAllUsers();
		return new ResponseEntity<List<UserDto>>(users,HttpStatus.OK);
	}
	
	// DELETE ["/users/{id}"]
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteuser(@PathVariable String id)
	{
		String message = userService.deleteUser(id);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	

}
