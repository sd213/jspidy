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
import com.jsp.eighteenboot_ems.entity.Education;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;
import com.jsp.eighteenboot_ems.service.EducationService;

@RestController
public class EducationController {
	@Autowired
	private EducationService edservice;
	
	@GetMapping(value="/education") 
	public ResponseEntity<ResponseStructure<Object>> findEducationByEmpId(@RequestParam int id){
	
		//	NoEmployeeFoundException
		//	NoEducationDetailsFound
		return edservice.findEducationByEmpId(id);
	}

	@PostMapping(value="/education")
	public ResponseEntity<ResponseStructure<Object>> saveEducationDetailsUsingEmpId(@RequestParam int e_id,@RequestBody Education education){
//		NoEmployeeFoundException
		return edservice.saveEducationUsingEmpId(e_id,education);
	}

	@PutMapping(value="/education/{e_id}/{ed_id}") // RequestParam requestbody
	public ResponseEntity<ResponseStructure<Object>> updateEducationDetailsUsingEmpId(@PathVariable int e_id,@PathVariable int ed_id,@RequestBody Education education){
	//	NoEmployeeFoundException
		return edservice.updateEducationUsingEmpId(e_id,ed_id,education);
	}
    @PatchMapping(value="/education/{e_id}/{ed_id}") // RequestParam requestbody
    public ResponseEntity<ResponseStructure<Object>> patchEducationDetailsUsingEmpId(@PathVariable int e_id,@PathVariable int ed_id,@RequestBody Education education){
//	NoEmployeeFoundException
//	NoEducationDetailsFound 
    	return edservice.patchEducationUsingEmpId(e_id,ed_id,education);
    }
    
    @PatchMapping(value="/education/{e_id}/{ed_id}/{highestqualification}")
    public ResponseEntity<ResponseStructure<Object>> patchHighestQualificationUsingEmpId(@PathVariable int e_id,@PathVariable int ed_id,@PathVariable String highestqualification){
    	return edservice.patchHighestQualificationUsingEmpId(e_id,ed_id,highestqualification);
    }
    
//
	@DeleteMapping(value="/education/{e_id}") 
	public ResponseEntity<ResponseStructure<Object>> deleteEducationDetailsUsingEmpId(@PathVariable int e_id){
		
//	NoEmployeeFoundException
//	NoEducationDetailsFound
		return edservice.deleteAllEducationUsingEmpId(e_id);
	}
	@DeleteMapping(value="/education/{e_id}/{ed_id}")
	public ResponseEntity<ResponseStructure<Object>> deleteEducationDetailsUsingEmpIdandAddId(@PathVariable int e_id, @PathVariable int ed_id){
		return edservice.deleteEducationUsingEmpIdandAddId(e_id,ed_id);
		
	}
	
	
}
