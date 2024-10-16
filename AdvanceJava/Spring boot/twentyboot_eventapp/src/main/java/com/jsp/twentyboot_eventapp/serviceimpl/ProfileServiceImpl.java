package com.jsp.twentyboot_eventapp.serviceimpl;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.jsp.twentyboot_eventapp.dao.EventDao;
import com.jsp.twentyboot_eventapp.dao.ProfileDao;
import com.jsp.twentyboot_eventapp.entity.Event;
import com.jsp.twentyboot_eventapp.entity.Profile;
import com.jsp.twentyboot_eventapp.exceptionclasses.NoEventFoundException;
import com.jsp.twentyboot_eventapp.responsestructure.ResponseStructure;
import com.jsp.twentyboot_eventapp.service.ProfileService;
@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDao profileDao;
	
	@Autowired EventDao eventDao;
	
	private static final String FOLDER_PATH="C:\\Users\\somit\\OneDrive\\Desktop\\event profiles\\";
	@Override
	public ResponseEntity<?> saveProfile(MultipartFile file) {
		
		String name = file.getOriginalFilename();
		String type = file.getContentType();
		String path = FOLDER_PATH+name;
		
		try {
			file.transferTo(new File(path));
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Profile p = Profile.builder().name(name).type(type).path(path).build();
		p = profileDao.saveProfile(p);
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Profile Saved Successfully.....")
						.body(p)
						.build());
	}
	@Override
	public ResponseEntity<?> saveProfileWithEvents(int eid, MultipartFile file) {
		Optional<Event> optionalEvent= eventDao.findEventById(eid);
		if(optionalEvent.isEmpty()) {
			throw NoEventFoundException.builder()
			.message("No Event Associated with Given Event Id Found ")
			.build();
		}
		Event foundEvent = optionalEvent.get();
		String name = file.getOriginalFilename();
		String type = file.getContentType();
		String path = FOLDER_PATH+name;
		
		try {
			file.transferTo(new File(path));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		Profile p = Profile.builder().name(name).type(type).path(path).build();
		p = profileDao.saveProfile(p);
		foundEvent.setProfile(p);
		eventDao.saveEvent(foundEvent);
		
		return  ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("Profile Saved Successfully.....")
						.body(p)
						.build());
	}

}
