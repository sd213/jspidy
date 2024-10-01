package org.jsp.eightboot_pms.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.eightboot_pms.entity.Person;
import org.jsp.eightboot_pms.repository.PersonRepository;
import org.jsp.eightboot_pms.responsestructure.ResponseStructure;
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
public class PersonController {
	
		
		@Autowired
		PersonRepository repos;
		
		
		
		@PostMapping("/persons")
		public ResponseStructure<Person> savePerson(@RequestBody Person person) {
			
			repos.save(person);
			ResponseStructure<Person> structure =  new ResponseStructure<>();
			structure.setStatus(201);
			structure.setMessage("Person Saved Successfully");
			structure.setBody(person);
			return structure;
		}
		
		@GetMapping("/persons")
		public ResponseStructure<List<Person>> findAllUsers() {
			List<Person> pl = repos.findAll();
			ResponseStructure<List<Person>> structure =  new ResponseStructure<>();
			if(pl.isEmpty()) {
				structure.setStatus(404);
				structure.setMessage("No Users Found");
				structure.setBody(null);
				return structure;
				
			}else {
				structure.setStatus(200);
				structure.setMessage("Query Executed Successfully");
				structure.setBody( pl);
				return structure;
			}
		}
		
		
		@GetMapping("/persons/{id}")
		public ResponseStructure<Object> findUserById(@PathVariable int id) {
			Optional<Person> op =repos.findById(id);
			ResponseStructure<Object> structure = new ResponseStructure<>();
			if(op.isPresent()) {
				Person p= op.get();
				structure.setStatus(200);
				structure.setMessage("Found Person Successfully");
				structure.setBody(p);
				return structure;
				
			}
			else {
				
				structure.setStatus(404);
				structure.setMessage("No Person Found");
				structure.setBody(null);
				return structure;
			}
		}

//		@DeleteMapping("/persons")
//		public ResponseStructure<Object> deleteUserById(@RequestParam int id) {
//			Optional<Person> op =repos.findById(id);
//			ResponseStructure<Object> structure = new ResponseStructure<>();
//			
//			if(op.isPresent()) {
//				Person p = op.get();
//				repos.deleteById(id);
//				op=repos.findById(id);
//				if(op.isEmpty()) {
//					structure.setStatus(200);
//					structure.setMessage("Deleted  Successfully");
//					structure.setBody(p);
//					return structure;
//				}else {
//					structure.setStatus(500);
//					structure.setMessage("Deletion Operation performed Unsuccesfully");
//					structure.setBody(p);
//					return structure;
//				}
//			}
//			else {
//				structure.setStatus(404);
//				structure.setMessage("No Users Found");
//				structure.setBody(null);
//				return structure;
//			}
//		}
		@DeleteMapping("/persons")
		public ResponseStructure<String> deleteUserById(@RequestParam int id) {
			Optional<Person> op =repos.findById(id);
			ResponseStructure<String> structure = new ResponseStructure<>();
			
			if(op.isPresent()) {
				Person p = op.get();
				repos.deleteById(id);
				op=repos.findById(id);
				if(op.isEmpty()) {
					structure.setStatus(200);
					structure.setMessage("Deleted  Successfully");
					structure.setBody("Person Deleted");
					return structure;
				}else {
					structure.setStatus(500);
					structure.setMessage("Deletion Operation performed Unsuccesfully");
					structure.setBody("No Person Found");
					return structure;
				}
			}
			else {
				structure.setStatus(404);
				structure.setMessage("No Users Found");
				structure.setBody("No Person is there to delete");
				return structure;
			}
		}
		
		@PutMapping("/persons")
		public ResponseStructure<Person> updatePerson(@RequestBody Person person){
			
			repos.save(person);
			ResponseStructure<Person> structure =  new ResponseStructure<>();
			structure.setStatus(201);
			structure.setMessage("Person Updated Successfully");
			structure.setBody(person);
			return structure;	
		}

}
