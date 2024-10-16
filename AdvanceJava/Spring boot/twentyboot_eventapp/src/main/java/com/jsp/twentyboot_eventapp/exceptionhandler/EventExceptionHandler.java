package com.jsp.twentyboot_eventapp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyCompletedEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyDeletedEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyOngoingEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.AlreadyUpcomingEventException;
import com.jsp.twentyboot_eventapp.exceptionclasses.InvalidIdEventIdException;
import com.jsp.twentyboot_eventapp.exceptionclasses.NoEventFoundException;
import com.jsp.twentyboot_eventapp.responsestructure.ResponseStructure;

@RestControllerAdvice
public class EventExceptionHandler {
	@ExceptionHandler(NoEventFoundException.class)
	
	ResponseEntity<?> noEventFound(NoEventFoundException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder()
						.status(HttpStatus.NOT_FOUND.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
	@ExceptionHandler(InvalidIdEventIdException.class)
	ResponseEntity<?> noEventFoundByThisId(InvalidIdEventIdException e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(ResponseStructure.builder()
						.status(HttpStatus.NOT_FOUND.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
	
	@ExceptionHandler(AlreadyOngoingEventException.class)
	ResponseEntity<?> alreadyOngoingEventFoundByThisId(AlreadyOngoingEventException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.status(HttpStatus.BAD_REQUEST.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
	
	@ExceptionHandler(AlreadyUpcomingEventException.class)
	ResponseEntity<?> alreadyUpcomingFoundByThisId(AlreadyUpcomingEventException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.status(HttpStatus.BAD_REQUEST.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
	@ExceptionHandler(AlreadyCompletedEventException.class)
	ResponseEntity<?> alreadyCompletedFoundByThisId(AlreadyCompletedEventException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.status(HttpStatus.BAD_REQUEST.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
	
	@ExceptionHandler(AlreadyDeletedEventException.class)
	ResponseEntity<?> alreadyDeletedFoundByThisId(AlreadyDeletedEventException e){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(ResponseStructure.builder()
						.status(HttpStatus.BAD_REQUEST.value())
						.mesg("No Events").body(e.getMessage()).build());
	}
}
