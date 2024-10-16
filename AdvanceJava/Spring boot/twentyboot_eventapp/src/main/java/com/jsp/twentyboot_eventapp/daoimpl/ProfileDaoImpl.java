package com.jsp.twentyboot_eventapp.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.twentyboot_eventapp.dao.ProfileDao;
import com.jsp.twentyboot_eventapp.entity.Profile;
import com.jsp.twentyboot_eventapp.repository.ProfileRepository;

@Repository
public class ProfileDaoImpl implements ProfileDao {
	
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public Profile saveProfile(Profile profile) {
		
		
		return profileRepository.save(profile);
	}

	@Override
	public Profile updateProfile(Profile profile) {
		
		return profileRepository.save(profile);
	}

	@Override
	public Optional<Profile> findProfileById(int id) {
		// TODO Auto-generated method stub
		return profileRepository.findById(id);
	}

	@Override
	public List<Profile> findAllProfiles() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}
	
	
}
