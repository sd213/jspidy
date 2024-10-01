package org.jsp.eightboot_pms.responsestructure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int status; //http status
	private String message;
	private T body;
	
}
