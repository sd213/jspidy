package com.jsp.eighteenboot_ems.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.eighteenboot_ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByName(String name);

	Optional<Employee> findByEmailAndPassword(String email, String password);

	Optional<Employee> findByEmail(String email);

}
