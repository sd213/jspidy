package org.jsp.sixteenboot_ems.exceptionsclasses;

public class NoEmployeeFoundException extends RuntimeException{
	private String message;
	public NoEmployeeFoundException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}

}
