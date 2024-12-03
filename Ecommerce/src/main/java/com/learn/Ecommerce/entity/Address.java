package com.learn.Ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)   
	private int addressId;
	
	@Column(nullable = false)
	private String addressLine1;
	
	@Column(nullable = false)
	private String addressLine2;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private int pincode;
	
	//foreign key
	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
	private User user;

}

// spring boot created auto increment table address_seq

