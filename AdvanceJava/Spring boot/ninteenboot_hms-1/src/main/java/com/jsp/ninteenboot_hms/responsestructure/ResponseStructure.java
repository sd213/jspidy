package com.jsp.ninteenboot_hms.responsestructure;

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
