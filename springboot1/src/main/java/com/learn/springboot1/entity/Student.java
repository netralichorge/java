package com.learn.springboot1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // used for create getter setters with the help of lombok.
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private int id;
	private String name;
	private int marks;
	
	

}
