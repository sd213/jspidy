package com.jsp.seventeenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class NoActiveEmployeeFoundException extends RuntimeException {
	private String message;
	public NoActiveEmployeeFoundException(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
