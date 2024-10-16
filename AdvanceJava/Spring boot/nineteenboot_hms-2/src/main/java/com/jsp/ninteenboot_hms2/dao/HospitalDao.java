package com.jsp.ninteenboot_hms2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.entity.Hospital;
import com.jsp.ninteenboot_hms2.repository.HospitalRepository;

@Component
public class HospitalDao {

	@Autowired
	private HospitalRepository hrepo;
	public List<Hospital> findAllHospitals() {
		// TODO Auto-generated method stub
		return hrepo.findAll();
	}
	public Optional<Hospital> findHospitalById(int id) {
		// TODO Auto-generated method stub
		return hrepo.findById(id);
	}
	public Hospital saveHospital(Hospital h) {
		// TODO Auto-generated method stub
		return hrepo.save(h);
	}
	public void deleteHospitalById(int id) {
		// TODO Auto-generated method stub
		hrepo.deleteById(id);
	}

}
