package com.jsp.ninteenboot_hms2.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms2.dao.DepartmentDao;
import com.jsp.ninteenboot_hms2.dao.DoctorDao;
import com.jsp.ninteenboot_hms2.dao.HospitalDao;
import com.jsp.ninteenboot_hms2.entity.Department;
import com.jsp.ninteenboot_hms2.entity.Doctor;
import com.jsp.ninteenboot_hms2.entity.Hospital;
import com.jsp.ninteenboot_hms2.exceptionclasses.NoDepartmentFoundException;
import com.jsp.ninteenboot_hms2.exceptionclasses.NoDoctorsFoundException;
import com.jsp.ninteenboot_hms2.exceptionclasses.NoHospitalsFoundException;
import com.jsp.ninteenboot_hms2.responsestructure.ResponseStructure;

@Component
public class HospitalService {

	@Autowired
	private HospitalDao hdao;
	@Autowired
	private DepartmentDao dedao;
	@Autowired
	private DoctorDao docdao;
	
	
	public ResponseEntity<ResponseStructure<Object>> findAllHospitals() {
		// TODO Auto-generated method stub
		List<Hospital> lh = hdao.findAllHospitals();
		if(lh.size()<1) {
			throw NoHospitalsFoundException.builder().message("No Hospital Records Found...").build();
		}
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("List of Hospital Record Found")
						.body(lh)
						.build()) ;
	}
	public ResponseEntity<ResponseStructure<Object>> findHospitalById(int id) {
		// TODO Auto-generated method stub
		Optional<Hospital> optional = hdao.findHospitalById(id);
		if(optional.isEmpty()) {
			throw NoHospitalsFoundException.builder().message("No Hospital Records Found...").build();
			
		}
		Hospital h = optional.get();
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
				.status(HttpStatus.OK.value())
				.mesg("Hospital Record Found")
				.body(h)
				.build()) ;
	}
	public ResponseEntity<ResponseStructure<Object>> saveHospitalDetails(Hospital h) {
		
//		List<Department> deptList = h.getDepartment();
//		List<Doctor> doctorList = h.getDoctor();
		
//		Iterator<Department> deptIt = deptList.iterator();
//		Iterator<Doctor> doctorIt = doctorList.iterator();
//		Department tempDept;
//		Doctor tempDoctor;
//		while(deptIt.hasNext()) {
//			tempDept=deptIt.next();
////			tempDept.setHospital(h);
//			tempDept.getDoctor();
//			docdao.saveDoctor((Doctor) tempDept.getDoctor());
//			dedao.saveDepartment(tempDept);
//		}
//		while(doctorIt.hasNext()) {
//			tempDoctor = doctorIt.next();
////			tempDoctor.setHospital(h);
//			docdao.saveDoctor(tempDoctor);
//		}
//		deptIt = deptList.iterator();
//		doctorIt = doctorList.iterator();
//		
//		while(deptIt.hasNext()) {
//			tempDept=deptIt.next();
//			tempDept.setHospital(h);
//			dedao.saveDepartment(tempDept);
//		}
//		while(doctorIt.hasNext()) {
//			tempDoctor = doctorIt.next();
////			tempDoctor.setHospital(h);
//			docdao.saveDoctor(tempDoctor);
//		}
		
		
//		Hospital  savedHospital = hdao.saveHospital(h);
		
		// First, save all departments and their related doctors
//		for (Department tempDept : deptList) {
//		    tempDept.setHospital(h);  // Set the hospital reference for the department
//		    // Save each doctor associated with the current department
//		    for (Doctor tempDoctor : tempDept.getDoctor()) {
//		        tempDoctor.setDept(tempDept);  // Set the department reference for the doctor
//		        docdao.saveDoctor(tempDoctor);  // Save the doctor
//		    }
//		    dedao.saveDepartment(tempDept);  // Save the department
//		}
//
//		// Next, save any doctors directly associated with the hospital
//		for (Doctor tempDoctor : doctorList) {
//		    tempDoctor.setHospital(h);  // Set the hospital reference for the doctor
//		    docdao.saveDoctor(tempDoctor);  // Save the doctor
//		}

		// Finally, save the hospital
		Hospital savedHospital = hdao.saveHospital(h);

		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder()
				.status(HttpStatus.CREATED.value())
				.mesg("New hospital Added")
				.body(savedHospital)
				.build()) ;
	}
	
	public ResponseEntity<ResponseStructure<Object>> updateHospitalDetails(int id, Hospital h) {
		Optional<Hospital> optional = hdao.findHospitalById(id);
		if(optional.isEmpty()) {
			
			throw NoHospitalsFoundException.builder().message("No Hospital Records Found By Given Id...").build();
		}
		Hospital oldh = optional.get();
		if(h.getLocation()!=null) {
			oldh.setLocation(h.getLocation());
		}
		if(h.getName()!=null) {
			oldh.setName(h.getName());
		}
		oldh = hdao.saveHospital(oldh);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().status(HttpStatus.ACCEPTED.value())
				.mesg("Hospital Data Updated")
				.body(oldh)
				.build()) ;
	}
	public ResponseEntity<ResponseStructure<Object>> deleteHospitalById(int id) {
		Optional<Hospital> optional = hdao.findHospitalById(id);
		if(optional.isEmpty()) {
			
			throw NoHospitalsFoundException.builder().message("No Hospital Records Found By Given Id...").build();
		}
		Hospital h = optional.get();
//		docservice.deleteAllDoctorsByHospital(h);
		List<Doctor> doctorList = docdao.findDoctorsByHid(h.getId());
		if(doctorList.size()<0) {
			
			throw NoDoctorsFoundException.builder().message("No Doctors Found to Delete").build();
		}
		Iterator<Doctor> doctorIt = doctorList.listIterator();
		while(doctorIt.hasNext()) {
			Doctor temp = doctorIt.next();
			temp.setDept(null);
			temp.setHospital(null);
			docdao.saveDoctor(temp);
			docdao.deleteDoctorById(temp.getId());
		}
//		deservice.deleteAllDepartmentByHospital(h);
		List<Department> deptList = dedao.findAllDepartmentByHid(h.getId());
		if(deptList.size()<1) {
			
			throw NoDepartmentFoundException.builder().message("No Department Found to Delete").build();
		}
		Iterator<Department> deptIt = deptList.listIterator();
		while(deptIt.hasNext()) {
			Department temp = deptIt.next();
			
			temp.setHospital(null);
			temp =dedao.saveDepartment(temp);
			dedao.deleteDepartmentById(temp.getId());
		}
		
		hdao.deleteHospitalById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().status(HttpStatus.ACCEPTED.value()).mesg("Delete Successfull").body("Deleted Hospital and It's data succesfully").build());
	}
	
}
