package com.learn.Ecommerce.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.Ecommerce.Dto.UserDto;
import com.learn.Ecommerce.entity.User;
import com.learn.Ecommerce.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDto addUser(UserDto userDto) {
		UUID randomUUID = UUID.randomUUID();
		
		// to string method used for converting data type to string
		String id = randomUUID.toString();
		
		userDto.setId(id);
		
		User user = dtoToEntity(userDto);
		User savedUser = userRepository.save(user);
		UserDto savedDto = entityToDto(savedUser);
		
		return savedDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		
	    List<User> users = userRepository.findAll();
	    
	    List<UserDto> userDtoList = users.stream()
	    .map(u->entityToDto(u))
	    .collect(Collectors.toList());
	    
		return userDtoList;
	}

	@Override
	public UserDto getuserById(String id) {
		
		User user = userRepository.findById(id)
		.orElseThrow(()->new RuntimeException(id+"Not found"));
		return entityToDto(user);
	}
	
	@Override
	public UserDto getUserByEmail(String email) {
		
		User user = userRepository.findByEmailId(email)
		.orElseThrow(()->new RuntimeException(email+"Not found"));
		return entityToDto(user);
	}

	@Override
	public UserDto updateUser(String id, UserDto userDto) {
		
		User user = userRepository.findById(id)
		.orElseThrow(()->new RuntimeException(id+"not found"));
		
		user.setFirstname(userDto.getFirstname());
		user.setLastName(userDto.getLastName());
		user.setEmailId(userDto.getEmailId());
		user.setAge(userDto.getAge());
		user.setPassword(userDto.getPassword());
		
		User updateUser = userRepository.save(user);
		
		return entityToDto(updateUser);
	}

	@Override
	public String deleteUser(String id) {
		
		User user = userRepository.findById(id)
		.orElseThrow(()->new RuntimeException(id+ "Not Found"));
		
		userRepository.delete(user);
		return user.getId()+"deleted successfully";
	}

	@Override
	public UserDto entityToDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstname(user.getFirstname());
		userDto.setLastName(user.getLastName());
		userDto.setPassword(user.getPassword());
		userDto.setEmailId(user.getEmailId());
		userDto.setAge(user.getAge());
		
		return userDto;
	}

	@Override
	public User dtoToEntity(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setFirstname(userDto.getFirstname());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setEmailId(userDto.getEmailId());
		user.setAge(userDto.getAge());
		
		return user;
	}
	
	

}
