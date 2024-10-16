package com.jsp.ninteenboot_hms.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ninteenboot_hms.dao.DepartmentDao;
import com.jsp.ninteenboot_hms.dao.DoctorDao;
import com.jsp.ninteenboot_hms.dao.HospitalDao;
import com.jsp.ninteenboot_hms.entity.Department;
import com.jsp.ninteenboot_hms.entity.Doctor;
import com.jsp.ninteenboot_hms.entity.Hospital;
import com.jsp.ninteenboot_hms.exceptionclasses.NoDepartmentFoundException;
import com.jsp.ninteenboot_hms.exceptionclasses.NoDoctorsFoundException;
import com.jsp.ninteenboot_hms.exceptionclasses.NoHospitalsFoundException;
import com.jsp.ninteenboot_hms.repository.HospitalRepository;
import com.jsp.ninteenboot_hms.responsestructure.ResponseStructure;

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
		
		Hospital  savedHospital = hdao.saveHospital(h);
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
