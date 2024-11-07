package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	
	@Value("10")
	private int categoryId;
	
	@Value("Electronics")
	private String categoryName;
	
	
	@Value("description for electronics")
	private String categoryDiscription;
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDiscription() {
		return categoryDiscription;
	}
	public void setCategoryDiscription(String categoryDiscription) {
		this.categoryDiscription = categoryDiscription;
	}
	
	
	public Category(int categoryId, String categoryName, String categoryDiscription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDiscription = categoryDiscription;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDiscription="
				+ categoryDiscription + "]";
	}
	
	

}
