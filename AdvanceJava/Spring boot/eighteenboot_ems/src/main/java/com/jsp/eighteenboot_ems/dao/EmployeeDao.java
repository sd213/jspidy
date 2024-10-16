package com.jsp.eighteenboot_ems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.repository.EmployeeRepository;

@Component
public class EmployeeDao {
	@Autowired
	private EmployeeRepository emrepos;

	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return emrepos.save(employee);
	}

	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return emrepos.findAll();
	}

	public Optional<Employee> findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return emrepos.findById(id);
	}

	public List<Employee> findEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return emrepos.findByName(name);
	}

	public Optional<Employee> findEmployeeByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return emrepos.findByEmailAndPassword(email,password);
	}


	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		emrepos.deleteById(id);
	}

	public Optional<Employee> findEmployeeByEmail(String email) {
		// TODO Auto-generated method stub
		return emrepos.findByEmail(email);
	}

}
