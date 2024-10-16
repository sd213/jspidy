package com.jsp.eighteenboot_ems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.entity.Education;
import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.repository.EducationRepository;

@Component
public class EducationDao {
	@Autowired
	private EducationRepository edrepos;

	public Education saveEducation(Education education) {
		// TODO Auto-generated method stub
		return edrepos.save(education);
	}

	public List<Education> findEducationByEmp(Employee e) {
		// TODO Auto-generated method stub
		return edrepos.findEducationByEmp(e);
	}

	public Optional<Education> findEducationByEmpAndEdId(Employee e, int ed_id) {
		// TODO Auto-generated method stub
		return edrepos.findEducationByEmpAndId(e,ed_id);
	}

	public Education updateEducation(Education foundEducation) {
		// TODO Auto-generated method stub
		return edrepos.save(foundEducation);
	}

	public void deleteEducation(int ed_id) {
		// TODO Auto-generated method stub
		edrepos.deleteById(ed_id);
		
	}

	public void deleteAllEducation(Employee e) {
		// TODO Auto-generated method stub
		
		edrepos.deleteAllEducation(e);
	}

	
}
