package org.jsp.eightboot_pms.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.eightboot_pms.entity.Person;
import org.jsp.eightboot_pms.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 *  Here i have comment out RestController so that it will not be used to handle REST requests .
 *  This code lacks Response Structure...
 */
//@RestController  
public class PersonController_old {
	
	@Autowired
	PersonRepository repos;
	@PostMapping("/persons")
	public Person savePerson(@RequestBody Person person) {
		
		return repos.save(person);
	}
	@GetMapping("/persons")
	public List<Person> findAllUsers() {
		return repos.findAll();
	}
	@GetMapping("/persons/{id}")
	public Object findUserById(@PathVariable int id) {
		Optional<Person> op =repos.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		else {
			return "Invalid User";
		}
	}
//	@DeleteMapping("/persons/{id}")
//	public String deleteUserById(@PathVariable int id) {
//		Optional<Person> op =repos.findById(id);
//		if(op.isPresent()) {
//			repos.deleteById(id);
//			return "Successful Deletion";
//		}
//		else {
//			return "User not Found";
//		}
//	}
	@DeleteMapping("/persons")
	public String deleteUserById(@RequestParam int id) {
		Optional<Person> op =repos.findById(id);
		if(op.isPresent()) {
			repos.deleteById(id);
			return "Successful Deletion";
		}
		else {
			return "User not Found";
		}
	}
}
