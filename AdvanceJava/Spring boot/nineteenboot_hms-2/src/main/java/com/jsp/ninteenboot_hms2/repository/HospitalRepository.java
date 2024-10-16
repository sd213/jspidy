package com.jsp.ninteenboot_hms2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.entity.Hospital;

@Component
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
	
}
