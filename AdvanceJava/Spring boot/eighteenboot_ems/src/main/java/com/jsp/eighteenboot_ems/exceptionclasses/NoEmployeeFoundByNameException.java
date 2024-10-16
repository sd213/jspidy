package com.jsp.eighteenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class NoEmployeeFoundByNameException extends RuntimeException  {

	private String message;
	public NoEmployeeFoundByNameException(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
