package org.jsp.elevenboot_doctormanagement.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.elevenboot_doctormanagement.entity.Doctor;
import org.jsp.elevenboot_doctormanagement.repository.DoctorRepository;
import org.jsp.elevenboot_doctormanagement.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	@Autowired
	private DoctorRepository repos;
	
	@PostMapping("/doctors")
	public ResponseStructure<Doctor> saveUser(@RequestBody Doctor doc){
		repos.save(doc);
		ResponseStructure<Doctor> structure = new ResponseStructure<>();
		structure.setStatus(201);
		structure.setMessage("Patient Saved Successfully");
		structure.setBody(doc);
		return structure;
	}
	@GetMapping("/doctors")
	public ResponseStructure<List<Doctor>> findAllUsers() {
		List<Doctor> pl = repos.findAll();
		ResponseStructure<List<Doctor>> structure =  new ResponseStructure<>();
		if(pl.isEmpty()) {
			structure.setStatus(404);
			structure.setMessage("No Patients Found");
			structure.setBody(null);
			return structure;
		}else {
			structure.setStatus(200);
			structure.setMessage("Query Executed Successfully");
			structure.setBody( pl);
			return structure;
		}
	}
	@GetMapping("/doctors/{id}")
	public ResponseStructure<Object> findUserById(@PathVariable int id) {
		Optional<Doctor> op =repos.findById(id);
		ResponseStructure<Object> structure = new ResponseStructure<>();
		if(op.isPresent()) {
			Doctor p= op.get();
			structure.setStatus(200);
			structure.setMessage("Found Doctor Successfully");
			structure.setBody(p);
			return structure;
			
		}
		else {
			
			structure.setStatus(404);
			structure.setMessage("No Doctor Found");
			structure.setBody(null);
			return structure;
		}
	}
	@DeleteMapping("/doctors")
	public ResponseStructure<String> deleteUserById(@RequestParam int id) {
		Optional<Doctor> op =repos.findById(id);
		ResponseStructure<String> structure = new ResponseStructure<>();
		
		if(op.isPresent()) {
			repos.deleteById(id);
			op=repos.findById(id);
			if(op.isEmpty()) {
				structure.setStatus(200);
				structure.setMessage("Deleted  Successfully");
				structure.setBody("Doctor Deleted");
				return structure;
			}else {
				structure.setStatus(500);
				structure.setMessage("Deletion Operation performed Unsuccesfully");
				structure.setBody("No Doctor Found");
				return structure;
			}
		}
		else {
			structure.setStatus(404);
			structure.setMessage("No Users Found");
			structure.setBody("No Doctor is there to delete");
			return structure;
		}
	}
	
	@PutMapping("/doctors")
	public ResponseStructure<Doctor> updateDoctor(@RequestBody Doctor doc){
		
		repos.save(doc);
		ResponseStructure<Doctor> structure =  new ResponseStructure<>();
		structure.setStatus(201);
		structure.setMessage("Doctor Updated Successfully");
		structure.setBody(doc);
		return structure;	
	}

}
