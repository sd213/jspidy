package com.jsp.twentyboot_eventapp.exceptionclasses;

import lombok.Builder;

@Builder

public class InvalidIdEventIdException extends RuntimeException {
	private String message;
	public InvalidIdEventIdException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
}
