package com.jsp.eighteenboot_ems.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.eighteenboot_ems.exceptionclasses.AlreadyActivatedException;
import com.jsp.eighteenboot_ems.exceptionclasses.AlreadyInActivatedException;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidCredentialsException;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidEmployeeIdException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoActiveEmployeeFoundException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoEmployeeFoundByNameException;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(NoActiveEmployeeFoundException.class)

	public ResponseEntity<ResponseStructure<Object>> noActiveEmployeeFoundExceptionHandler(NoActiveEmployeeFoundException e) {
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder()
				.statuscode(HttpStatus.NOT_FOUND.value())
				.mesg("Failed to retrieve data...")
				.body(e.getMessage())
				.build());
	}
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseEntity<ResponseStructure<Object>> invalidEmployeeIdExceptionHandler(InvalidEmployeeIdException e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder()
				.statuscode(HttpStatus.NOT_FOUND.value())
				.mesg("Invalid Employee Id ....")
				.body(e.getMessage())
				.build());
	}
	
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<ResponseStructure<Object>> invalidCredentialsExceptionHandler(InvalidCredentialsException e){

		return ResponseEntity.status(HttpStatus.FORBIDDEN)
				.body(ResponseStructure.builder()
				.statuscode(HttpStatus.FORBIDDEN.value())
				.mesg("Invalid Credentials....")
				.body(e.getMessage())
				.build());
	}
	
	@ExceptionHandler(NoEmployeeFoundByNameException.class)
	public ResponseEntity<ResponseStructure<Object>> noEmployeeFoundExceptionHandler(NoEmployeeFoundByNameException e){
		
		return ResponseEntity.status(HttpStatus.FORBIDDEN)
				.body(ResponseStructure.builder()
				.statuscode(HttpStatus.FORBIDDEN.value())
				.mesg("No Employee Found ....")
				.body(e.getMessage())
				.build());
		 
	}
	
	@ExceptionHandler(java.sql.SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<ResponseStructure<?>> sqlIntegrityConstraintViolationExceptionHandler(java.sql.SQLIntegrityConstraintViolationException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
				.statuscode(HttpStatus.BAD_REQUEST.value())
				.mesg("Integrity Constraint Violation Exception...")
				.body(e.getMessage())
				.build());
	}
	@ExceptionHandler(AlreadyActivatedException.class)
	public  ResponseEntity<ResponseStructure<Object>> AlreadyActivated(AlreadyActivatedException e){
		
//		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.statuscode(HttpStatus.BAD_REQUEST.value())
						.mesg(e.getMessage())
						.body("Activation Operation Failed")
						.build());
		 
	}
	@ExceptionHandler(AlreadyInActivatedException.class)
	public  ResponseEntity<ResponseStructure<Object>> AlreadyInActivated(AlreadyInActivatedException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.statuscode(HttpStatus.BAD_REQUEST.value())
						.mesg(e.getMessage())
						.body("InActivation Operation Failed")
						.build());
		 
	}
}
