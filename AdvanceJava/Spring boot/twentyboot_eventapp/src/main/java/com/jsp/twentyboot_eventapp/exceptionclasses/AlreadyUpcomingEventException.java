package com.jsp.twentyboot_eventapp.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class AlreadyUpcomingEventException extends RuntimeException {
	private String message;
	
}
