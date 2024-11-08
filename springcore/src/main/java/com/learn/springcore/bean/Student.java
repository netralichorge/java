package com.learn.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	// if multiple bean available then use Qualifier annotation to select one bean
	@Qualifier("school2") 
	private School school;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public School getSchool() {
		return school;
	}
	
	public void setSchool(School school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}
	
	public Student(int id, String name, School school) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
