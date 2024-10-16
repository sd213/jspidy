package com.jsp.eighteenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class AlreadyActivatedException extends RuntimeException{
	private String message;
	public AlreadyActivatedException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
