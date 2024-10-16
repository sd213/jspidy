package com.jsp.ninteenboot_hms2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.entity.Department;
import com.jsp.ninteenboot_hms2.entity.Hospital;

@Component
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	@Query("select d from Department d where d.hospital.id=:hid")
	List<Department> findAllDepartmentByHid(int hid);

	@Query("select d from Department d where d.name=:name")
	Optional<Department> findDepartmentByName(String name);
	
	@Query("select d from Department d where d.id=:did and d.hospital=:h")
	Optional<Department> findDepartmentByIdAndHospitalObject(int did, Hospital h);

	

}
