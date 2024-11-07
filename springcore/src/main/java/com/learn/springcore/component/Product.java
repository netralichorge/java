package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
	@Value("101")
	private int id;
	
	@Value("Laptop")
	private String name;
	
	@Value("50000")
	private int price;
	
	//@Autowired               // Field injection
	private Category category;
	
	public Category getCategory() {
		return category;
	}
	
	//@Autowired                             // setter injection
	public void setCategory(Category category) {
		
		System.out.println("Setter Method");
		
		this.category = category;
	}
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Product(int id, String name, int price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	@Autowired                   // Constructor injection
	public Product(Category category) {
		super();
		System.out.println("Constructor");
		this.category = category;
	}

	public Product() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	

}
