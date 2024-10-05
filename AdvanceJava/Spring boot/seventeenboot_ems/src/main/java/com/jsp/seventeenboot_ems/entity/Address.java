package com.jsp.seventeenboot_ems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int doorNo;
	private String streetAddress;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private String addressType;
	
	@ManyToOne
	private Employee employee;
}
