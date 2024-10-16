package com.jsp.ninteenboot_hms2.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.ninteenboot_hms2.exceptionclasses.NoHospitalsFoundException;
import com.jsp.ninteenboot_hms2.responsestructure.ResponseStructure;


@RestControllerAdvice
public class HospitalExceptionHandler {
	@ExceptionHandler(NoHospitalsFoundException.class)
	public ResponseEntity<ResponseStructure<Object>> noHospitalFound(NoHospitalsFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder()
						.status(HttpStatus.NOT_FOUND.value())
						.mesg("No Data Found")
						.body(e.getMessage())
						.build());
	}
}
