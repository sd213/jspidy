package com.jsp.twentyboot_eventapp.exceptionclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class AlreadyDeletedEventException extends RuntimeException {
	private String message;
}
