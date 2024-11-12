package com.learn.springboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot1.entity.Student;

// we have two annottions - 1) @Controller  2) @RestController

@RestController
public class FirstController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Netrali";
	}
	
	@GetMapping("/netrali")
	public String netrali()
	{
		return "Hello World";
	}
	
	@GetMapping("/student")
	public Student getStudent()
	{
		Student s = new Student();
		s.setId(101);
		s.setMarks(50);
		s.setName("Nisha");
		return s;
	}

}
