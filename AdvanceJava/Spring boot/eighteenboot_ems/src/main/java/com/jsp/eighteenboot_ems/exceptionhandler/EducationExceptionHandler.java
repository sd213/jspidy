package com.jsp.eighteenboot_ems.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.eighteenboot_ems.exceptionclasses.NoEducationDetailsFoundException;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;

@RestControllerAdvice
public class EducationExceptionHandler {

	@ExceptionHandler(NoEducationDetailsFoundException.class)
	public ResponseEntity<ResponseStructure<Object>> noEducationDetailsFound(NoEducationDetailsFoundException e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().statuscode(HttpStatus.NOT_FOUND.value()).mesg(e.getMessage()).body("No Education Details Found/Associated with Given Employee Id").build());
	}
}
