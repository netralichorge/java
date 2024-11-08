package com.learn.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(BeanConfig.class);
				  
		                            //("method name", type)
			Student s1 = context.getBean("s1",Student.class);
			System.out.println(s1);
				
			School school = context.getBean("school1",School.class);
			System.out.println(school);
			
			School school2 = context.getBean("school2",School.class);
			System.out.println(school2);

	}

}
