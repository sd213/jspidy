package org.jsp.sixteenboot_ems.exceptionsclasses;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InvalidCredentialsException extends RuntimeException {
	private String mesg;
	public InvalidCredentialsException(String mesg) {
		this.mesg=mesg;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}
	
}
