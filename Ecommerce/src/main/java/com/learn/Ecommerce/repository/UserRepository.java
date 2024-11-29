package com.learn.Ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	Optional<User> findByEmailId(String email);
	
	List<User> findByFirstname(String firstname);
	
	List<User> findByLastName(String lastName);
	
	List<User> findByFirstnameStartingWith(String firstname);

}
