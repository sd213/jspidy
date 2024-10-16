package com.jsp.ninteenboot_hms.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms.entity.Doctor;
import com.jsp.ninteenboot_hms.entity.Hospital;
import com.jsp.ninteenboot_hms.repository.DoctorRepository;

@Component
public class DoctorDao {

	@Autowired
	private DoctorRepository drepos;
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return drepos.save(doctor);
	}
	public List<Doctor> findDoctorsByHid(int hid) {
		// TODO Auto-generated method stub
		return drepos.findDoctorsByHid(hid);
	}
	public Optional<Doctor> findDoctorsById(int did) {
		// TODO Auto-generated method stub
		return drepos.findById(did);
	}
	
	public void deleteDoctorById(int id) {
		// TODO Auto-generated method stub
		drepos.deleteById(id);
	}

}
