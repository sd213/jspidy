package com.jsp.eighteenboot_ems.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;
import com.jsp.eighteenboot_ems.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService emservice;
	@PostMapping(value="/employees") 
	public ResponseEntity<ResponseStructure<?>> saveEmployee(@RequestBody Employee employee){
//	DuplicateEntryException
		return emservice.saveEmployee(employee);
	}
	@PutMapping(value="/employees") 
	public ResponseEntity<ResponseStructure<Object>> updateEmployee(@RequestBody Employee employee){
		//	{no Exceptions}
		return emservice.updateEmployee(employee);
	}
	@GetMapping(value="/employees") 
	public ResponseEntity<ResponseStructure<Object>> findAllEmployee(){
		//	NoActiveEmployeesFoundException
		return emservice.findAllEmployee();
	}
	@GetMapping(value ="/employee/{id}") 
	//	NoEmployeeFoundException
	public ResponseEntity<ResponseStructure<Object>> findEmployeeById(@PathVariable int id){
		return emservice.findEmployeeById(id);
	}
	
    @GetMapping(value="/employees/name/{name}") 
    //	NoEmployeeFoundException
	public ResponseEntity<ResponseStructure<Object>> findEmployeeByName(@PathVariable String name){
    	return emservice.findEmployeeByName(name);
    }

	@GetMapping(value="/{email}/{password}") 
    public ResponseEntity<ResponseStructure<Object>> findEmployeeByEmailAndPassword(@PathVariable String email,@PathVariable String password){
	//	InvalidCredentialsException
    	return emservice.findEmployeeByEmailAndPassword(email,password);
    }	
	@DeleteMapping(value="/employees")
	public ResponseEntity<ResponseStructure<Object>> deleteEmployeeById(@RequestParam int id){
		//	NoEmployeeFoundException
		return emservice.deleteEmployeeById(id);
	}	
	@PatchMapping("/employees/active/{id}")
	public ResponseEntity<ResponseStructure<Object>> patchInactiveToActiveEmployeesById(@PathVariable int id){
	//	NoEmployeeFoundException
	//	AlreadyActivatedException
		return emservice.patchInactiveToActiveEmployeesById(id);
	}
// 
	@PatchMapping("/employees/inactive/{id}")	
	public ResponseEntity<ResponseStructure<Object>> patchActiveToInActiveEmployeesById(@PathVariable int id){
	//	NoEmployeeFoundException
	//	AlreadyInActivatedException
		return emservice.patchActiveToInActiveEmployeesById(id);
	}
}
