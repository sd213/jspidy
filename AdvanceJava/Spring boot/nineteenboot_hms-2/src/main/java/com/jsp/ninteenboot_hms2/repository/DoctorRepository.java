package com.jsp.ninteenboot_hms2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.entity.Doctor;

@Component
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

	@Query("select doc from Doctor doc where doc.hospital.id=:hid")
	List<Doctor> findDoctorsByHid(int hid);

	

}
