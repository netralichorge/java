package com.learn.springboot1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot1.entity.Student;

// we have two annotations - 1) @Controller  2) @RestController

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
	
	@GetMapping("/all-student")
	public List<Student> allStudent(){
		
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(101, "Nisha", 60));
		student.add(new Student(102, "Janki", 80));
		return student;
	}
	
	@GetMapping("/get-all-students")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "Nisha", 60));
		students.add(new Student(102, "Janki", 80));
		return new ResponseEntity<List<Student>>(students,HttpStatus.FOUND);
		
	}
	
	
	// for multiple id
	 //        ("/students/100")
	
	@GetMapping("/students/{id}") // path variable
	public String learnPathVariable(@PathVariable int id)  // java variable
	{
		System.out.println(id);         // id print on console
		return "Data fetched successfully"; // return statement print on postman
	}
	
	// Post used to add data
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) // @RequestBody used for read data
	{
		System.out.println(student);
		return student;
	}
	
	// ResponseEntity<List<Student>>  HttpStatus.CREATED  [enum.]
	@PostMapping("/add-student")
	public ResponseEntity<Student> addStudentWithResponseEntity(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	}
	
}

