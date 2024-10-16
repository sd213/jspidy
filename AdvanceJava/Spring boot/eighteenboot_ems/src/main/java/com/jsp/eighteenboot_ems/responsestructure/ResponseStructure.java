package com.jsp.eighteenboot_ems.responsestructure;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class ResponseStructure <T>{
	
	private int statuscode;
	private String mesg;
	private T body;
}
