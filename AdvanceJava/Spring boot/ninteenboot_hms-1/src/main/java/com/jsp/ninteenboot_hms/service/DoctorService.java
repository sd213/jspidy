package com.jsp.ninteenboot_hms.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms.dao.DepartmentDao;
import com.jsp.ninteenboot_hms.dao.DoctorDao;
import com.jsp.ninteenboot_hms.dao.HospitalDao;
import com.jsp.ninteenboot_hms.entity.Department;
import com.jsp.ninteenboot_hms.entity.Doctor;
import com.jsp.ninteenboot_hms.entity.Hospital;
import com.jsp.ninteenboot_hms.exceptionclasses.NoDepartmentFoundException;
import com.jsp.ninteenboot_hms.exceptionclasses.NoDoctorsFoundException;
import com.jsp.ninteenboot_hms.exceptionclasses.NoHospitalsFoundException;
import com.jsp.ninteenboot_hms.responsestructure.ResponseStructure;

@Component
public class DoctorService {

	@Autowired
	private DoctorDao docdao;
	
	@Autowired
	private HospitalDao hdao;
	
	@Autowired
	private DepartmentDao ddao;
	
	public ResponseEntity<ResponseStructure<Object>> saveDoctor1(int hid, Doctor doctor) {
//		System.out.println(doctor.getDept());
		Optional<Hospital> optional = hdao.findHospitalById(hid);
		if(optional.isEmpty()) {
			throw NoHospitalsFoundException.builder().message("No Hospital RecordFound ....").build();
		}
		Hospital h = optional.get();
		doctor.setHospital(h);
		Optional<Department>optional2 = ddao.findDepartmentByName(doctor.getDept().getName());
		Department d;
		if(optional2.isEmpty()) {
		    d = new Department();
			d.setName(doctor.getDept().getName());
			d.setHospital(doctor.getHospital());
			d=ddao.saveDepartment(d);
		}else {
			d=optional2.get();
		}
		doctor.setDept(d);
		Doctor savedDoc = docdao.saveDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().status(HttpStatus.CREATED.value()).mesg("New Doctor Saved..").body(savedDoc).build());
	}
	
	public ResponseEntity<ResponseStructure<Object>> saveDoctor2(int hid, int did, Doctor doctor) {
		Optional<Hospital> optional = hdao.findHospitalById(hid);
		if(optional.isEmpty()) {
			throw NoHospitalsFoundException.builder().message("No Hospital RecordFound ....").build();
		}
		Hospital h = optional.get();
		doctor.setHospital(h);
		Optional<Department>optional2 = ddao.findDepartmentByIdAndHospitalObject(did,h);
		Department d;
		if(optional2.isEmpty()) {
		    throw NoDepartmentFoundException.builder().message("No Department found in this Given Id").build();
		}else {
			d=optional2.get();
		}
		doctor.setDept(d);
		Doctor savedDoc = docdao.saveDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().status(HttpStatus.CREATED.value()).mesg("New Doctor Saved..").body(savedDoc).build());
		
	}
	
	public ResponseEntity<ResponseStructure<Object>> findAllDoctorsByHid(int hid) {
		
		List<Doctor> dl = docdao.findDoctorsByHid(hid);
		if(dl.size()<1) {
			throw NoDoctorsFoundException.builder().message("No Doctors Found Associated with Given Hospital Id...").build();
		}
		
		return  ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value()).mesg("New Doctor Saved..").body(dl).build());
	}

	public ResponseEntity<ResponseStructure<Object>> patchDoctorsbydidAndDeptId(int did, int deptid) {
		Optional<Doctor> optional1 = docdao.findDoctorsById(did);
		if(optional1.isEmpty()) {
			throw NoDoctorsFoundException.builder().message("No Doctors Found associated with given Doctor Id ....").build();
		}
		Doctor doc = optional1.get();
		Hospital h = doc.getHospital();
		Optional<Department> optional2 = ddao.findDepartmentByIdAndHospitalObject(deptid,h);
		if(optional2.isEmpty()) {
			throw NoDepartmentFoundException.builder().message("No Department Found  associated with given Department Id ....").build();
			
		}
		Department dept = optional2.get();
		
		
		
		
		doc.setDept(dept);
		Doctor updatedDoctor = docdao.saveDoctor(doc);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().status(HttpStatus.ACCEPTED.value()).mesg("New Doctor Saved..").body(updatedDoctor).build());
		
	}

//	public ResponseEntity<ResponseStructure<Object>> deleteAllDoctorsByHospital(Hospital h) {
//		// TODO Auto-generated method stub
//		
//		List<Doctor> dl = docdao.findDoctorsByHid(h.getId());
//		if(dl.size()<0) {
//			
//			throw NoDoctorsFoundException.builder().message("No Doctors Found to Delete").build();
//		}
//		Iterator<Doctor> di = dl.listIterator();
//		while(di.hasNext()) {
//			Doctor temp = di.next();
//			temp.setDept(null);
//			temp.setHospital(null);
//			docdao.saveDoctor(temp);
//			docdao.deleteDoctorById(temp.getId());
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().status(HttpStatus.ACCEPTED.value()).mesg("Deletion Done").body("Deleted Doctors By Hospital Successfully").build());
//		
//		
//	}
//	public void deleteAllDoctorsByDepartment(Department d){}

	
	

}
