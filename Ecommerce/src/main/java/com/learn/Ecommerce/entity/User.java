package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id    // to mark column as primary key
	private String id;
	
	@Column(nullable = false)
	private String firstname;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false,unique = true)
	private String emailId;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private int age;
	
	

}
