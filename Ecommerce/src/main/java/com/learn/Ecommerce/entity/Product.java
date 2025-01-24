package com.learn.Ecommerce.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data     // @Data annotation create POJO class
@AllArgsConstructor
@NoArgsConstructor
@Entity   // Entity annotation to create table
//@Table(name = "product_details") 
// if you want change table name use Table annotation
// table name will be same as class name.

public class Product {
	
	@Id  // apply for primary key on table
	private int productId;
	
	@Column(nullable = false)
	private String productName;
	
	@Column(name = "description", nullable = false)
	private String productDescription;
	
	@Column(nullable = false)
	private int productPrice;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany(mappedBy = "products")
	private List<Order> orders;
	
	private String productImage;

}
