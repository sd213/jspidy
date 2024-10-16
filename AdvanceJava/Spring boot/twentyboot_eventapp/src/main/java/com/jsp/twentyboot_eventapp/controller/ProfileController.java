package com.jsp.twentyboot_eventapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.twentyboot_eventapp.service.ProfileService;

@RestController
@RequestMapping("/profiles")
//@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	@PostMapping
	public ResponseEntity<?> saveProfile(@RequestParam MultipartFile file ){
		return profileService.saveProfile(file);
	}
	
	@PostMapping("/{eid}")
	public ResponseEntity<?> saveProfileWithEvents(@PathVariable int eid,@RequestParam MultipartFile file){
		return profileService.saveProfileWithEvents(eid,file);
	}
}
