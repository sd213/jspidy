package com.jsp.eighteenboot_ems.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.eighteenboot_ems.exceptionclasses.NoAddressDetailsFoundException;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;

@RestControllerAdvice
public class AddressExceptionHandler {
	@ExceptionHandler(NoAddressDetailsFoundException.class)
	public ResponseEntity<ResponseStructure<Object>> noEducationDetailsFound(NoAddressDetailsFoundException e){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().statuscode(HttpStatus.NOT_FOUND.value()).mesg("No Address Details Found").body(e.getMessage()).build());
	}
}
