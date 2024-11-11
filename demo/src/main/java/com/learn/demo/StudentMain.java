package com.learn.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.practice.Config;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(com.learn.demo.Config.class);
				
			Student student = context.getBean("s1",Student.class);
			System.out.println(student);
				
			Teacher t1= context.getBean("t1",Teacher.class);
			System.out.println(t1);


	}

}
