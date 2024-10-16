package com.jsp.ninteenboot_hms2.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.dao.DepartmentDao;
import com.jsp.ninteenboot_hms2.dao.HospitalDao;
import com.jsp.ninteenboot_hms2.entity.Department;
import com.jsp.ninteenboot_hms2.entity.Hospital;
import com.jsp.ninteenboot_hms2.exceptionclasses.NoDepartmentFoundException;
import com.jsp.ninteenboot_hms2.exceptionclasses.NoHospitalsFoundException;
import com.jsp.ninteenboot_hms2.responsestructure.ResponseStructure;

@Component
public class DepartmentService {

	@Autowired
	private DepartmentDao dedao;
	
	@Autowired
	private HospitalDao hdao;
	
	public ResponseEntity<ResponseStructure<Object>> saveDepartmentByHid(int hid, Department dept) {
		Optional<Hospital> optional = hdao.findHospitalById(hid);
		if(optional.isEmpty()) {
			throw NoHospitalsFoundException.builder().message("No Hospital found on this Hospital id").build();
		}
		Hospital h = optional.get();
		dept.setHospital(h);
		Department savedDepartment = dedao.saveDepartment(dept);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(ResponseStructure.builder()
						.status(HttpStatus.CREATED.value())
						.mesg("New Department Added In This Hospital...")
						.body(savedDepartment).build());
	}

	public ResponseEntity<ResponseStructure<Object>> findAllDepartmentByHid(int hid) {
		Optional<Hospital> optional = hdao.findHospitalById(hid);
		if(optional.isEmpty()) {
			throw NoHospitalsFoundException.builder().message("No Hospital found on this Hospital id").build();
		}
		Hospital h = optional.get();
		List<Department> departmentList = dedao.findAllDepartmentByHid(hid);
		if(departmentList.size()<1) {
			throw NoDepartmentFoundException.builder().message("No Department Found On this Hospital Id").build();
		}
		return ResponseEntity.status(HttpStatus.OK)
				.body(ResponseStructure.builder()
						.status(HttpStatus.OK.value())
						.mesg("List of Department Found In This Hospital...")
						.body(departmentList).build());
	}

//	public ResponseEntity<ResponseStructure<?>> deleteAllDepartmentByHospital(Hospital h) {
//		List<Department> dl = dedao.findAllDepartmentByHid(h.getId());
//		if(dl.size()<1) {
//			
//			throw NoDepartmentFoundException.builder().message("No Department Found to Delete").build();
//		}
//		Iterator<Department> di = dl.listIterator();
//		while(di.hasNext()) {
//			Department temp = di.next();
//			
//			temp.setHospital(null);
//			temp =dedao.saveDepartment(temp);
//			dedao.deleteDepartmentById(temp.getId());
//		}
//		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().status(HttpStatus.ACCEPTED.value()).mesg("Deletion Done").body("Deleted Departments By Hospital Successfully").build());
//		
//		
//	}

	

}
