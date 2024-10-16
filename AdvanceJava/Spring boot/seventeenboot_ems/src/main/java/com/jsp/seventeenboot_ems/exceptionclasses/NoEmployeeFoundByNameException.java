package com.jsp.seventeenboot_ems.exceptionclasses;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
public class NoEmployeeFoundByNameException extends RuntimeException{
	private String message;
	public NoEmployeeFoundByNameException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
