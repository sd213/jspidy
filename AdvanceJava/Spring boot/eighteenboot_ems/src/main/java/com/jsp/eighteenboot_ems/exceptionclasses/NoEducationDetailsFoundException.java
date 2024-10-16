package com.jsp.eighteenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class NoEducationDetailsFoundException extends RuntimeException {

	private String message;
	public NoEducationDetailsFoundException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
