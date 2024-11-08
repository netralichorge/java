package com.learn.springcore.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // has all the settings
public class BeanConfig {
	
	@Bean
	public Student s1()
	{
		return new Student(101, "Nisha", null);
	}
	
	@Bean  // method level annotation
	public School school1()
	{
		return new School(678, "National School");
	}
	
	@Bean
	public School school2()
	{
		return new School(45, " J.M. School");
	}

}
