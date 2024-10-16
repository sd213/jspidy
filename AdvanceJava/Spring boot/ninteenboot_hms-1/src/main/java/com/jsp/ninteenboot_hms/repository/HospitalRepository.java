package com.jsp.ninteenboot_hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms.entity.Hospital;

@Component
public interface HospitalRepository extends JpaRepository<Hospital, Integer>{
	
	
}
