package com.jsp.eighteenboot_ems.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jsp.eighteenboot_ems.entity.Education;
import com.jsp.eighteenboot_ems.entity.Employee;

import jakarta.transaction.Transactional;

public interface EducationRepository extends JpaRepository<Education, Integer> {
	@Query("select ed from Education ed where ed.employee=:e and ed.id=:ed_id")
	
	Optional<Education> findEducationByEmpAndId(Employee e, int ed_id);
	@Query("select ed from Education ed where ed.employee=:e")
	List<Education> findEducationByEmp(Employee e);

	@Modifying
	@Transactional
	@Query("delete from Education ed WHERE ed.employee = :e ")
	void deleteAllEducation(Employee e);

}
