package org.jsp.elevenboot_doctormanagement.responsestructure;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int status;
	private String message;
	private T body;
}
