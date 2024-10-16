package com.jsp.ninteenboot_hms.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.ninteenboot_hms.exceptionclasses.NoDoctorsFoundException;
import com.jsp.ninteenboot_hms.responsestructure.ResponseStructure;

@RestControllerAdvice
public class DoctorExceptionHandler {
	@ExceptionHandler(NoDoctorsFoundException.class)
	public ResponseEntity<ResponseStructure<Object>> noDoctorsFound(NoDoctorsFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().status(HttpStatus.NOT_FOUND.value()).mesg("No Data Found").body(e.getMessage()).build());
	}
}
