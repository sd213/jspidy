package org.jsp.sixteenboot_ems.repository;

import java.util.List;
import java.util.Optional;

import org.jsp.sixteenboot_ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	Optional<Employee> fetchByEmailAndPassword(String email,String password); // won't work you have to put @Query Before it ...
	Optional<Employee> findByEmailAndPassword(String email, String password);

	

	List<Employee> findByName(String name);


	@Query("Select e from Employee e where e.status='ACTIVE'")
	List<Employee> findAllActiveEmployees();

}
