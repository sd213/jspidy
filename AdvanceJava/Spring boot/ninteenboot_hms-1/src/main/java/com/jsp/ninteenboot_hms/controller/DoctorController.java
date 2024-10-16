package com.jsp.ninteenboot_hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms.entity.Doctor;
import com.jsp.ninteenboot_hms.responsestructure.ResponseStructure;
import com.jsp.ninteenboot_hms.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService docservice;
	
	@PostMapping("/doctors/{hid}")
	public ResponseEntity<ResponseStructure<Object>> saveDoctor1(@PathVariable int hid,@RequestBody Doctor doctor){
		return docservice.saveDoctor1(hid,doctor);
	}
	
	@PostMapping("/doctors/{hid}/{did}")
	public ResponseEntity<ResponseStructure<Object>> saveDoctor2(@PathVariable int hid,@PathVariable int did,@RequestBody Doctor doctor){
		return docservice.saveDoctor2(hid,did,doctor);
	}
	
	@GetMapping("/doctors/{hid}")
	public ResponseEntity<ResponseStructure<Object>> findAllDoctorsbyHid(@PathVariable int hid){
		return docservice.findAllDoctorsByHid(hid);
	}
	
	@PatchMapping("/doctors/{did}/{deptid}")
	public ResponseEntity<ResponseStructure<Object>> patchDoctorsbydidAndDeptId(@PathVariable int did,@PathVariable int deptid){
		return docservice.patchDoctorsbydidAndDeptId(did,deptid);
	}
	
}
