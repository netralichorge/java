package com.learn.Ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
	
	@Id
	private int categoryId;
	
	@Column(nullable = false)
	private String categoryName;
	
	@Column(name = "description", nullable = false)
	private String categoryDescription;
	

}
