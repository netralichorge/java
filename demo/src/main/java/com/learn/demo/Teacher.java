package com.learn.demo;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	private int teacherId;
	private String name;
	private String subject;
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(int teacherId, String name, String subject) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		this.subject = subject;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", subject=" + subject + "]";
	}
	
	

}
