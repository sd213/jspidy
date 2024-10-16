package com.jsp.ninteenboot_hms2.exceptionclasses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class NoHospitalsFoundException extends RuntimeException {
	private String message;
}
