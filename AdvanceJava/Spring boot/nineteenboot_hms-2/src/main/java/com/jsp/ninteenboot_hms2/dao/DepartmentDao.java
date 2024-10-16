package com.jsp.ninteenboot_hms2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ninteenboot_hms2.entity.Department;
import com.jsp.ninteenboot_hms2.entity.Hospital;
import com.jsp.ninteenboot_hms2.repository.DepartmentRepository;

@Component
public class DepartmentDao {

	@Autowired
	private DepartmentRepository deprepo;
//	public Optional<Department> findDepartmentById(int deptid) {
//	
//		return deprepo.findById(deptid);
//	}
	public Optional<Department> findDepartmentByIdAndHospitalObject(int did, Hospital h) {
		// TODO Auto-generated method stub
		return deprepo.findDepartmentByIdAndHospitalObject(did,h);
	}
	public Optional<Department> findDepartmentByName(String name) {
		// TODO Auto-generated method stub
		return deprepo.findDepartmentByName(name);
	}
	public List<Department> findAllDepartmentByHid(int hid) {
		
		return deprepo.findAllDepartmentByHid(hid);
	}
	public Department saveDepartment(Department dept) {
		// TODO Auto-generated method stub
		return deprepo.save(dept);
	}

	public void deleteDepartmentById(int id) {
		// TODO Auto-generated method stub
		deprepo.deleteById(id);;
	}


}
