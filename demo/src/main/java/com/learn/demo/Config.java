package com.learn.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Student s1()
	{
		return new Student(101,"Raj",19);
	}
	
	@Bean
	public Teacher t1()
	{
		return new Teacher(12,"Mrs.Dalvi","Physics");
	}
	
}
