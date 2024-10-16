package com.jsp.eighteenboot_ems.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AlreadyInActivatedException extends RuntimeException{
	private String message;
	
}
