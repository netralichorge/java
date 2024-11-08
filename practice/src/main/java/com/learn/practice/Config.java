package com.learn.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Product p1()
	{
		return new Product(10,"Mobile",35000);
	}
	
	@Bean
	public Customer c1()
	{
		return new Customer(101,"Meet",null);
	}

}
