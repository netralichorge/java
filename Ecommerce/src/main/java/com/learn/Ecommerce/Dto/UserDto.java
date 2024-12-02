package com.learn.Ecommerce.Dto;

import com.learn.Ecommerce.entity.Address;
import com.learn.Ecommerce.validators.PasswordMatch;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//user Dto is a copy of user
//DTO - Data Transfer Objects

@Data
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatch
public class UserDto {
	
	// id is auto generate so we can not apply any annotation on id
	private String id;
	
	@NotNull
	@NotBlank(message = "firstname cannot be blank")
	@Size(min = 2)
	private String firstname;
	
	@NotNull
	@NotBlank(message = "lastname cannot be blank")
	@Size(min = 4,max = 20)
	private String lastName;
	
	@NotNull
	@Pattern(regexp ="^((?!\\.)[\\w\\-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$")
	@NotBlank(message = "email Id cannot be blank")
	private String emailId;
	
	@NotNull
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[^\\w\\d\\s:])([^\\s]){8,16}$")
	@NotBlank(message = "password cannot be blank")
	private String password;
	
	@NotNull
	@NotBlank(message = "confirm password cannot be blank")
	private String confirmPassword;
	
	@NotNull
	@Min(13)
	@Max(150)
	private int age;
	
	private Address address;
	

}
