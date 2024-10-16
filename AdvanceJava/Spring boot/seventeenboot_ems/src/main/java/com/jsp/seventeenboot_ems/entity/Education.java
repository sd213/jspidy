package com.jsp.seventeenboot_ems.entity;

import com.jsp.seventeenboot_ems.util.HighestQualification;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

//
//@Getter
//@Setter
@Data
@Entity
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int e_id;
	private String qualification;
	private String universityName;
	private double percentage;
	private int completionYear;
	private HighestQualification highestQualification;
	
	@ManyToOne
	private Employee employee;
}
