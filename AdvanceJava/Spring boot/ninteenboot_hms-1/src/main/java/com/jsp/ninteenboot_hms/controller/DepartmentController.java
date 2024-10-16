package com.jsp.ninteenboot_hms.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms.entity.Department;
import com.jsp.ninteenboot_hms.responsestructure.ResponseStructure;
import com.jsp.ninteenboot_hms.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService deservice;
	
	@GetMapping("/dept/{hid}")
	public ResponseEntity<ResponseStructure<Object>> findAllDepartmentByHid(@PathVariable int hid){
		return deservice.findAllDepartmentByHid(hid);
	}
	
	@PostMapping("/dept/{hid}")
	public ResponseEntity<ResponseStructure<Object>> saveDepartmentByHid(@PathVariable int hid,@RequestBody Department dept){
		
		return deservice.saveDepartmentByHid(hid,dept);
	}
}
