package com.jsp.ninteenboot_hms2.responsestructure;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ResponseStructure <T>{

	private int status;
	private String mesg;
	private T body;
}
