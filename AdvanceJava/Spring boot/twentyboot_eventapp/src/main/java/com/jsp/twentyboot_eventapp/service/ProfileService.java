package com.jsp.twentyboot_eventapp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;


public interface ProfileService {

	ResponseEntity<?> saveProfile(MultipartFile file);

	ResponseEntity<?> saveProfileWithEvents(int eid, MultipartFile file);

}
