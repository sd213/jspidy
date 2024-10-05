package com.jsp.seventeenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class InvalidEmployeeIdException extends RuntimeException{
	private String message;
	public InvalidEmployeeIdException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
