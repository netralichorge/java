package com.learn.Ecommerce.entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Order is a keyword so we can not create table name like Order

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderDetails") // table annotation helps to change the table name
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String orderId;
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	private List<Product> products;

}
