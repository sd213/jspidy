package com.jsp.eighteenboot_ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.eighteenboot_ems.entity.Address;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;
import com.jsp.eighteenboot_ems.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	private AddressService aservice;
	
	@GetMapping(value="/address") 
	public ResponseEntity<ResponseStructure<Object>> findAddressByEmpId(@RequestParam int e_id){
	
		//	NoEmployeeFoundException
		//	NoAddressDetailsFound
		return aservice.findAddressByEmpId(e_id);
	}

	@PostMapping(value="/address")// RequestParam requestbody
	public ResponseEntity<ResponseStructure<Object>> saveAddressDetailsUsingEmpId(@RequestParam int e_id,@RequestBody Address address){
//		NoEmployeeFoundException
		return aservice.saveAddressUsingEmpId(e_id,address);
	}

	@PutMapping(value="/address/{e_id}/{a_id}") // RequestParam requestbody
	public ResponseEntity<ResponseStructure<Object>> updateAddressDetailsUsingEmpId(@PathVariable int e_id,@PathVariable int a_id,@RequestBody Address address){
	//	NoEmployeeFoundException
		return aservice.updateAddressUsingEmpId(e_id,a_id,address);
	}
    @PatchMapping(value="/address/{e_id}/{a_id}") 
    public ResponseEntity<ResponseStructure<Object>> patchAddressDetailsUsingEmpId(@PathVariable int e_id,@PathVariable int a_id, @RequestBody Address address){
//	NoEmployeeFoundException
//	NoAddressDetailsFound 
    	return aservice.patchAddressUsingEmpId(e_id,a_id,address);
    }
//
	@DeleteMapping(value="/address/{e_id}") 
	public ResponseEntity<ResponseStructure<Object>> deleteAllAddressDetailsUsingEmpId(@PathVariable int e_id){
		
//	NoEmployeeFoundException
//	NoAddressDetailsFound
		return aservice.deleteAllAddressUsingEmpId(e_id);
	}
	
	@DeleteMapping(value="/address/{e_id}/{a_id}")
	public ResponseEntity<ResponseStructure<Object>> deleteAddressDetailsUsingEmpIdandAddId(@PathVariable int e_id, @PathVariable int a_id){
		return aservice.deleteAddressUsingEmpIdandAddId(e_id,a_id);
		
	}
}
