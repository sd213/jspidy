package org.jsp.fourteen_boot.responsestructure;

import java.util.List;

import org.jsp.fourteen_boot.entity.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int statusCode;
	private String statusMesg;
	private T resbody;
}
