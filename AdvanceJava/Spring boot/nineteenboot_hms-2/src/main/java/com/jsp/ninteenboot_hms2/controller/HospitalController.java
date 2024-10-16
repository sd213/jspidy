package com.jsp.ninteenboot_hms2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms2.entity.Hospital;
import com.jsp.ninteenboot_hms2.responsestructure.ResponseStructure;
import com.jsp.ninteenboot_hms2.service.HospitalService;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
	
	@Autowired
	private HospitalService hservice;
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Object>> findAllHospitals(){
		return hservice.findAllHospitals();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<Object>> findHospitalById(@PathVariable int id){
		return hservice.findHospitalById(id);
	}
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Object>> saveHospitalDetails(@RequestBody Hospital h){
		return hservice.saveHospitalDetails(h);
	}
	
	@PutMapping 
	public ResponseEntity<ResponseStructure<Object>> updateHospitalDetails(@RequestParam int id , @RequestBody Hospital h){
		return hservice.updateHospitalDetails(id,h);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseStructure<Object>> deleteHospitalById(@PathVariable int id){
		return hservice.deleteHospitalById(id);
	}
	
}
