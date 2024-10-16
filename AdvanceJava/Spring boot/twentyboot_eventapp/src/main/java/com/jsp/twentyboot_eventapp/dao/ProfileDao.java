package com.jsp.twentyboot_eventapp.dao;

import java.util.List;
import java.util.Optional;

import com.jsp.twentyboot_eventapp.entity.Profile;

public interface ProfileDao {
	Profile saveProfile(Profile profile);
	Profile updateProfile(Profile profile);
	Optional<Profile> findProfileById(int id);
	List<Profile> findAllProfiles();
//	delete
}
