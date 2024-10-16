package com.jsp.eighteenboot_ems.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jsp.eighteenboot_ems.entity.Address;
import com.jsp.eighteenboot_ems.entity.Employee;

import jakarta.transaction.Transactional;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	@Query("select a from Address a where a.employee=:e")
	List<Address> findAddressByEmp(Employee e);

	@Query("select a from Address a where a.employee=:e and a.id=:a_id")
	Optional<Address> findAddByEmpAndId(Employee e, int a_id);
	
	@Modifying
	@Transactional
	@Query("delete from Address a WHERE a.employee = :e and a.id = :a_id")
	void deleteAddress(Employee e, int a_id);

	@Modifying
	@Transactional
	@Query("delete from Address a WHERE a.employee = :e")
	void deleteAllAddress(Employee e);


}
