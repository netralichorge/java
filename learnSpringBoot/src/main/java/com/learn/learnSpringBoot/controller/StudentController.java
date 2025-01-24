package com.learn.learnSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.learnSpringBoot.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public @ResponseBody Student home()
	{
		return new Student(101, " Netrali", 22);
	}
	
	

}
