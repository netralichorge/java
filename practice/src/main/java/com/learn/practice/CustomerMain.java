package com.learn.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.springcore.bean.BeanConfig;

public class CustomerMain {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Config.class);
		
		Product p1 = context.getBean("p1",Product.class);
		System.out.println(p1);
		
		Customer c1 = context.getBean("c1",Customer.class);
		System.out.println(c1);

	}

}
