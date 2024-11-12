package com.learn.springboot1.entity;

import lombok.Data;

@Data  // used for create getter setters with the help of lombok.
public class Student {
	
	private int id;
	private String name;
	private int marks;
	
	

}
