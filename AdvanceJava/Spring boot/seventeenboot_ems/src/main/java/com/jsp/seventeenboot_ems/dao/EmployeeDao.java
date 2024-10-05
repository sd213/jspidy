package com.jsp.seventeenboot_ems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.seventeenboot_ems.entity.Employee;
import com.jsp.seventeenboot_ems.repository.EmployeeRepository;

@Component
public class EmployeeDao {
	@Autowired
	private EmployeeRepository repos;
	public Employee saveEmployee(Employee employee) {
		return repos.save(employee);
	}
	public Employee updateEmployee(Employee employee) {
		return repos.save(employee);
	}
	public Optional<Employee> findEmployeeById(int id){
		return repos.findById(id);
	}
	public List<Employee> findAllEmployees(){
		return repos.findAll();
	}
	public List<Employee> findAllActiveEmployees(){
		return repos.findAllActiveEmployees();
	}
	public void deleteEmployeeById(int id) {
		repos.deleteById(id);
	}
	public Optional<Employee> findEmployeeByEmailAndPassword(String email,String password){
		return repos.findByEmailAndPassword(email, password);
	}
	public List<Employee> findEmployeeByName(String name){
		return repos.findByName(name);
	}
	
}