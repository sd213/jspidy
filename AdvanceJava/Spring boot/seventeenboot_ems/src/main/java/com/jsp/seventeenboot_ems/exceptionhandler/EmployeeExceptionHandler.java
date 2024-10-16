package com.jsp.seventeenboot_ems.exceptionhandler;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.seventeenboot_ems.exceptionclasses.InvalidCredentialsException;
import com.jsp.seventeenboot_ems.exceptionclasses.InvalidEmployeeIdException;
import com.jsp.seventeenboot_ems.exceptionclasses.NoActiveEmployeeFoundException;
import com.jsp.seventeenboot_ems.exceptionclasses.NoEmployeeFoundByNameException;
import com.jsp.seventeenboot_ems.responsestructure.ResponseStructure;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(NoActiveEmployeeFoundException.class)

	public ResponseEntity<ResponseStructure<String>> noActiveEmployeeFoundExceptionHandler(NoActiveEmployeeFoundException e) {
		
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("No Active Employee....");
		structure.setBody(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(structure);
	}
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<ResponseStructure<String>> invalidEmployeeIdExceptionHandler(InvalidEmployeeIdException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("Invalid Employee Id ....");
		structure.setBody(e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(structure);
	}
	
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ResponseStructure<String>> invalidCredentialsExceptionHandler(InvalidCredentialsException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.FORBIDDEN.value());
		structure.setMesg(e.getMessage());
		structure.setBody(null);
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body(structure);
	}
	
	@ExceptionHandler(NoEmployeeFoundByNameException.class)
	public ResponseEntity<ResponseStructure<String>> noEmployeeFoundExceptionHandler(NoEmployeeFoundByNameException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("No Employee Found ....");
		structure.setBody(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(java.sql.SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ResponseStructure<?>> sqlIntegrityConstraintViolationExceptionHandler(java.sql.SQLIntegrityConstraintViolationException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		structure.setMesg("Given Email Already Present");
		structure.setBody(e.getMessage());
		return new ResponseEntity<ResponseStructure<?>>(structure,HttpStatus.BAD_REQUEST);
	}
}

