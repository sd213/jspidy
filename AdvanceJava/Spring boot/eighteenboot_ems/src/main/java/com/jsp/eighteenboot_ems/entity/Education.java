package com.jsp.eighteenboot_ems.entity;

import com.jsp.eighteenboot_ems.util.HighestQualification;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int edid;
	
	private String qualification;
	private String universityName;
	private double percentage;
	private int completionYear;
	private HighestQualification highestQualification;
	
	@ManyToOne
	private Employee employee;
}
