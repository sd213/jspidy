package org.jsp.sixteenboot_ems.exceptionhandler;

import java.io.NotActiveException;

import org.jsp.sixteenboot_ems.exceptionsclasses.InvalidCredentialsException;
import org.jsp.sixteenboot_ems.exceptionsclasses.InvalidEmployeeIdException;
import org.jsp.sixteenboot_ems.exceptionsclasses.NoActiveEmployeeFoundException;
import org.jsp.sixteenboot_ems.exceptionsclasses.NoEmployeeFoundException;
import org.jsp.sixteenboot_ems.responsestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
//	service -> ExceptionHandler->
	@ExceptionHandler(NoActiveEmployeeFoundException.class)
//	public String noActiveEmployeeFoundExceptionHandler() {
//		return "hi"
//	}
	public ResponseEntity<ResponseStructure<String>> noActiveEmployeeFoundExceptionHandler(NoActiveEmployeeFoundException e) {
		
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("No Active Employee....");
		structure.setBody(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidEmployeeIdException.class)
	public ResponseStructure<String> invalidEmployeeIdExceptionHandler(InvalidEmployeeIdException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("Invalid Employee Id ....");
		structure.setBody(e.getMessage());
		return structure;
	}
	
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseStructure<String> invalidCredentialsExceptionHandler(InvalidCredentialsException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("Invalid Email and Passwords....");
		structure.setBody(e.getMessage());
		return structure;
	}
	
	@ExceptionHandler(NoEmployeeFoundException.class)
	public ResponseEntity<ResponseStructure<String>> noEmployeeFoundExceptionHandler(NoEmployeeFoundException e){
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMesg("No Employee Found ....");
		structure.setBody(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_FOUND);
	}
}

//The ResponseStructure class is used to encapsulate the response message and data.
//The controller checks if the provided ID is valid. If not, it returns a ResponseEntity with a ResponseStructure and an HTTP status of NOT_FOUND.
//If the ID is valid, it returns a success response.
