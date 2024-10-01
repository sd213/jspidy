package org.jsp.elevenboot_doctormanagement.repository;

import org.jsp.elevenboot_doctormanagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
}
