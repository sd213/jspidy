package com.jsp.eighteenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class InvalidCredentialsException extends RuntimeException  {

	private String message;
	public InvalidCredentialsException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
