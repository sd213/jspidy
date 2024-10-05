package com.jsp.seventeenboot_ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.seventeenboot_ems.entity.Employee;
import com.jsp.seventeenboot_ems.responsestructure.ResponseStructure;
import com.jsp.seventeenboot_ems.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
//	@PostMapping(value ="/employee")
	@PostMapping
	public ResponseEntity<ResponseStructure<?>> saveEmployee(@RequestBody Employee e){
		return service.saveEmployee(e);
	}
//	@PutMapping(value="/employees")
	@PutMapping
	public ResponseEntity<ResponseStructure<Employee>> updateEmployee(@RequestBody Employee e){
		return service.updateEmployee(e);
	}
//	@GetMapping(value="/employees")
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Employee>>> findAllEmployees(){
		return service.findAllEmployee();
	}
//	@GetMapping(value ="/employee/{id}")
	@GetMapping(value="/{id}")
	
	public ResponseEntity<ResponseStructure<Employee>> findEmployeeById(@PathVariable int id){
		return service.findEmployeeById(id);
	}
//	@GetMapping(value="/employees/name/{name}")
	@GetMapping(value="/{name}")
	public ResponseEntity<ResponseStructure<List<Employee>>> findEmployeesByName(@PathVariable String name){
		return service.findEmployeeByName(name);
	}
	
//	@GetMapping(value="/employees/{email}/{password}")
	@GetMapping(value="/{email}/{password}")
	public ResponseEntity<ResponseStructure<Employee>> findEmployeeByEmailAndPassword(@PathVariable String email,@PathVariable String password){
		return service.findEmployeeByEmailAndPasword(email, password);
	}
	
//	@DeleteMapping(value="/employees/{id}")
	@DeleteMapping(value="/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteEmployeeById(@PathVariable int id){
		return service.deleteEmployeeById(id);
	}
	
//	@PatchMapping("/employees/active/{id}")
	@PatchMapping("/active/{id}")
	public ResponseEntity<ResponseStructure<Employee>> setEmployeeStatusToActive(@PathVariable int id){
		return service.setEmployeeStatusToActive(id);
	}
	
//	@PatchMapping("/employees/inactive/{id}")
	@PatchMapping("/inactive/{id}")
	public ResponseEntity<ResponseStructure<Employee>> setEmployeeStatusToInActive(@PathVariable int id){
		return service.setEmployeeStatusToInActive(id);
	}
	
}
