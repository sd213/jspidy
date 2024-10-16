package com.jsp.eighteenboot_ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.dao.AddressDao;
import com.jsp.eighteenboot_ems.dao.EducationDao;
import com.jsp.eighteenboot_ems.dao.EmployeeDao;
import com.jsp.eighteenboot_ems.entity.Address;
import com.jsp.eighteenboot_ems.entity.Education;
import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.exceptionclasses.AlreadyActivatedException;
import com.jsp.eighteenboot_ems.exceptionclasses.AlreadyInActivatedException;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidCredentialsException;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidEmployeeIdException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoActiveEmployeeFoundException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoEmployeeFoundByNameException;

import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;
import com.jsp.eighteenboot_ems.util.EmployeeStatus;

@Component
public class EmployeeService {
	@Autowired
	private EmployeeDao edao;
	
	@Autowired 
	private EducationDao eddao;
	
	@Autowired 
	private AddressDao adao;


	public ResponseEntity<ResponseStructure<?>> saveEmployee(Employee employee) {
		
		employee.setStatus(EmployeeStatus.INACTIVE);
		Employee savedEmployee = edao.saveEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.
					builder().mesg("Successfully Created Employee")
					.statuscode(HttpStatus.CREATED.value()).body(savedEmployee).build());
	
	}



	public ResponseEntity<ResponseStructure<Object>> updateEmployee(Employee employee) {
		
		Optional<Employee> findEmployee = edao.findEmployeeByEmail(employee.getEmail());
		if(findEmployee.isEmpty()) {
			Employee savedEmployee = edao.saveEmployee(employee);
			return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.
						builder().mesg("Successfully Created Employee")
						.statuscode(HttpStatus.CREATED.value()).body(savedEmployee).build());
		}
			Employee oldEmployee = findEmployee.get();
			if(employee.getName()!= null) {
			oldEmployee.setName(employee.getName());
			}
			if(employee.getPassword()!=null) {
				
				oldEmployee.setPassword(employee.getPassword());
			}
			if(employee.getPhone()!=0) {
			oldEmployee.setPhone(employee.getPhone());
			}
			if(employee.getStatus()!= null) {
				oldEmployee.setStatus(employee.getStatus());
			}
			Employee updatedEmployee = edao.saveEmployee(oldEmployee);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.
					builder().mesg("Successfully Updated Employee")
					.statuscode(HttpStatus.ACCEPTED.value()).body(updatedEmployee).build());
		
	}



	public ResponseEntity<ResponseStructure<Object>> findAllEmployee() {
		
		List<Employee> el = edao.findAllEmployee();
		if(el.size()<1) {
			throw NoActiveEmployeeFoundException.builder().message("No Active Employee Found in Database ....").build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().statuscode(HttpStatus.OK.value()).mesg("Employee Found Succesfully").body(el).build());
	}



	public ResponseEntity<ResponseStructure<Object>> findEmployeeById(int id) {
		
		Optional<Employee> optional = edao.findEmployeeById(id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Invalid Employee Id Passed...").build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().statuscode(HttpStatus.OK.value()).mesg("Employee Found").body(optional.get()).build());
	}



	public ResponseEntity<ResponseStructure<Object>> findEmployeeByName(String name) {
	
		List<Employee> el = edao.findEmployeeByName(name);
		if(el.size()<1) {
			throw NoEmployeeFoundByNameException.builder().message("No Employee List  Found By this Name ....").build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().statuscode(HttpStatus.OK.value()).mesg("Employee Found").body(el).build());
		
	}



	public ResponseEntity<ResponseStructure<Object>> findEmployeeByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		
		Optional<Employee> optional = edao.findEmployeeByEmailAndPassword(email,password);
		if(optional.isEmpty()) {
			throw InvalidCredentialsException.builder().message("Invalid Email and Password").build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().statuscode(HttpStatus.OK.value()).mesg("Employee Found with Given Email and password ").body(optional.get()).build());
	
	}



	public ResponseEntity<ResponseStructure<Object>> deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = edao.findEmployeeById(id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Invalid Employee Id Passed...").build();
		}
		  // Get the employee entity
	    Employee employee = optional.get();
	    
	    // Delete associated education records, if present
	    List<Education> educationList = eddao.findEducationByEmp(employee);
//	    Iterator<Education> et = educationList.iterator();
	    System.out.println(educationList);
	    if (!educationList.isEmpty()) {
	        eddao.deleteAllEducation(employee);
	    }
	    
	    
	    // Delete associated address records, if present
	    List<Address> addressList = adao.findAddressByEmp(employee);
	    System.out.println(addressList);
//	    Iterator<Address> at = addressList.iterator();
	    if (!addressList.isEmpty()) {
	        adao.deleteAllAddress(employee);
	    }
	
    
	    // Delete the employee
	    edao.deleteEmployeeById(id);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().statuscode(HttpStatus.NOT_FOUND.value()).mesg("Delete Operation Occurred").body("Deleted Employee Successfully").build());
	
		
	}



	public ResponseEntity<ResponseStructure<Object>> patchInactiveToActiveEmployeesById(int id) {
		
		Optional<Employee> optional = edao.findEmployeeById(id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Invalid Employee Id Passed...").build();
		}
		else {
			Employee emp = optional.get();
			if(emp.getStatus()==EmployeeStatus.ACTIVE) {
				throw AlreadyActivatedException.builder().message("Failed Activation").build();
			}
			emp.setStatus(EmployeeStatus.ACTIVE);
			edao.saveEmployee(emp);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("Activated").body("Activated  Operation Occurred Successfully").build());
			
			
		}
		
	}



	public ResponseEntity<ResponseStructure<Object>> patchActiveToInActiveEmployeesById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = edao.findEmployeeById(id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Invalid Employee Id Passed ....").build();
		}
		else {
			Employee emp = optional.get();
			if(emp.getStatus()==EmployeeStatus.ACTIVE) {
				throw AlreadyInActivatedException.builder().message("Failed InActivation").build();
			}
			emp.setStatus(EmployeeStatus.INACTIVE);
			edao.saveEmployee(emp);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("INActivated").body("InActivation  Operation Occurred Successfully").build());
			
		}
		
	}
}
