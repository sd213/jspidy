package com.jsp.eighteenboot_ems.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.dao.EducationDao;
import com.jsp.eighteenboot_ems.dao.EmployeeDao;
import com.jsp.eighteenboot_ems.entity.Education;
import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidEmployeeIdException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoAddressDetailsFoundException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoEducationDetailsFoundException;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;
import com.jsp.eighteenboot_ems.util.HighestQualification;

@Component
public class EducationService {
	@Autowired
	private EducationDao eddao;

	@Autowired
	private EmployeeDao edao;

	public ResponseEntity<ResponseStructure<Object>> findEducationByEmpId(int id) {
		Optional<Employee> optional = edao.findEmployeeById(id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		List<Education> le = eddao.findEducationByEmp(e);
		if(le.size()<1) {
			throw NoAddressDetailsFoundException.builder().message("No Education Details found for specified Employee Id").build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().statuscode(HttpStatus.OK.value()).mesg("Education Details Found").body(le).build());
	}

	public ResponseEntity<ResponseStructure<Object>> saveEducationUsingEmpId(int e_id, Education education) {
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		education.setEmployee(e);
		if(education.getHighestQualification()==null) {
			education.setHighestQualification(HighestQualification.NO);
		}
		else if(!(education.getHighestQualification().equals(HighestQualification.YES))) {
			education.setHighestQualification(HighestQualification.NO);
		}
		Education savedEducation = eddao.saveEducation(education);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().statuscode(HttpStatus.CREATED.value()).mesg("Added New Address").body(savedEducation).build());
	
	}

	public ResponseEntity<ResponseStructure<Object>> updateEducationUsingEmpId(int e_id, int ed_id,
			Education education) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Education> optional2 = eddao.findEducationByEmpAndEdId(e,ed_id);
		if(optional2.isEmpty()) {
			throw NoEducationDetailsFoundException.builder().message("No Education with Given Education Id Found With Specfied Employee Id to Update").build();
		}
		Education foundEducation = optional2.get();
		if(education.getQualification()!=null) {
			foundEducation.setQualification(education.getQualification());
		}
		if(education.getCompletionYear()!=0) {
			foundEducation.setCompletionYear(education.getCompletionYear());
		}
		if(education.getPercentage()!=0) {
			foundEducation.setPercentage(education.getPercentage());
		}
		if(education.getQualification()!=null) {
			foundEducation.setQualification(education.getQualification());
		}
		if(education.getUniversityName()!=null) {
			foundEducation.setUniversityName(education.getUniversityName());
		}
		if(education.getHighestQualification()!=null) {
			foundEducation.setHighestQualification(education.getHighestQualification());
		}
		
	
		Education updatedEducation =eddao.saveEducation(foundEducation);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("Updated Old education").body(updatedEducation).build());
		
	
	}

	public ResponseEntity<ResponseStructure<Object>> patchEducationUsingEmpId(int e_id, int ed_id,
			Education education) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Education> optional2 = eddao.findEducationByEmpAndEdId(e,ed_id);
		if(optional2.isEmpty()) {
			throw NoEducationDetailsFoundException.builder().message("No Addrress with Given Id Found With Specfied Employee Id to Update").build();
		}
		Education foundEducation = optional2.get();
		if(education.getQualification()!=null) {
			foundEducation.setQualification(education.getQualification());
		}
		if(education.getCompletionYear()!=0) {
			foundEducation.setCompletionYear(education.getCompletionYear());
		}
		if(education.getPercentage()!=0) {
			foundEducation.setPercentage(education.getPercentage());
		}
		if(education.getQualification()!=null) {
			foundEducation.setQualification(education.getQualification());
		}
		if(education.getUniversityName()!=null) {
			foundEducation.setUniversityName(education.getUniversityName());
		}
		if(education.getHighestQualification()!=null) {
			foundEducation.setHighestQualification(education.getHighestQualification());
		}
		
	
		Education updatedEducation =eddao.updateEducation(foundEducation);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("Patched Old education").body(updatedEducation).build());
		
	
	}

	public ResponseEntity<ResponseStructure<Object>> patchHighestQualificationUsingEmpId(int e_id, int ed_id,
			String hqualification) {
		if(!(hqualification.equals("true"))||!(hqualification.equals("false"))) {
			System.out.println("Throw Exception");
		}
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Education> optional2 = eddao.findEducationByEmpAndEdId(e,ed_id);
		if(optional2.isEmpty()) {
			throw NoEducationDetailsFoundException.builder().message("No Addrress with Given Id Found With Specfied Employee Id to Update").build();
		}
		Education foundEducation = optional2.get();
		
		switch(hqualification) {
		case "true":
			foundEducation.setHighestQualification(HighestQualification.YES);
			hqualification="Activated";
			break;
		case "false":
			foundEducation.setHighestQualification(HighestQualification.NO);
			hqualification="Deactivated";
			break;
		}
		Education updatedEducation =eddao.updateEducation(foundEducation);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("HigestQualification "+ hqualification).body(updatedEducation).build());
	
	}
	
	public ResponseEntity<ResponseStructure<Object>> deleteAllEducationUsingEmpId(int e_id) {
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		List<Education> educationFound = eddao.findEducationByEmp(e);
		Iterator<Education> it = educationFound.iterator();
		while(it.hasNext()) {
			Education temp =  it.next();
			temp.setEmployee(null);
			eddao.updateEducation(temp);
			
		}
		eddao.deleteAllEducation(e);
		
		return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(ResponseStructure.builder().statuscode(HttpStatus.NO_CONTENT.value()).mesg("Delete Operation done Successfully").body("Deleted All Education Details related to Given Employee Id").build());
	
	}

	public ResponseEntity<ResponseStructure<Object>> deleteEducationUsingEmpIdandAddId(int e_id, int ed_id) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("No Employee Specified with Given Id is  present").build();
		}
		Employee e = optional.get();
		Optional<Education> optional2 = eddao.findEducationByEmpAndEdId(e, ed_id);
		if(optional2.isEmpty()) {
			throw NoEducationDetailsFoundException.builder().message("No Education Details For Given Employee Id").build();
		}
		eddao.deleteEducation(ed_id);
		return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(ResponseStructure.builder().statuscode(HttpStatus.NO_CONTENT.value()).mesg("Delete Operation done Successfully").body("Deleted Particular given Education id related to Given Employee Id").build());
	
	}

	
	
	
}
