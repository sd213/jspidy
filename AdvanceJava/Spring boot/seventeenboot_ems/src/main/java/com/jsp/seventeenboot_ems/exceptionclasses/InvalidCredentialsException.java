package com.jsp.seventeenboot_ems.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Builder

@NoArgsConstructor
public class InvalidCredentialsException extends RuntimeException {
	private String message;
	public InvalidCredentialsException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}
	
}
