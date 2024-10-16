package com.jsp.eighteenboot_ems.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.dao.AddressDao;
import com.jsp.eighteenboot_ems.dao.EmployeeDao;
import com.jsp.eighteenboot_ems.entity.Address;
import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.exceptionclasses.InvalidEmployeeIdException;
import com.jsp.eighteenboot_ems.exceptionclasses.NoAddressDetailsFoundException;
import com.jsp.eighteenboot_ems.responsestructure.ResponseStructure;

@Component
public class AddressService {
	@Autowired
	private AddressDao addao;
	@Autowired
	private EmployeeDao edao;
	public ResponseEntity<ResponseStructure<Object>> findAddressByEmpId(int e_id) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		
		List<Address> la = addao.findAddressByEmp(e);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().statuscode(HttpStatus.CREATED.value()).mesg("Added New Address").body(la).build());
	}

	public ResponseEntity<ResponseStructure<Object>> saveAddressUsingEmpId(int e_id, Address address) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		address.setEmployee(e);
		Address  savedAddress = addao.saveAddress(address);
		return ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().statuscode(HttpStatus.CREATED.value()).mesg("Added New Address").body(savedAddress).build());
	}

	public ResponseEntity<ResponseStructure<Object>> updateAddressUsingEmpId(int e_id, int a_id, Address address) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Address> optional2 = addao.findAddressByEmpAndAddrId(e,a_id);
		if(optional2.isEmpty()) {
			throw NoAddressDetailsFoundException.builder().message("No Addrress with Given Id Found With Specfied Employee Id to Update").build();
		}
		Address foundAddress = optional2.get();
		if(address.getStreetAddress()!=null) {
			foundAddress.setStreetAddress(address.getStreetAddress());
		}
		if(address.getAddressLine2()!=null) {
			foundAddress.setAddressLine2(address.getAddressLine2());
		}
		if(address.getAddressType()!=null) {
			foundAddress.setAddressType(address.getAddressType());
		}
		if(address.getCity()!=null) {
			foundAddress.setCity(address.getCity());
		}
		if(address.getDoorNo()!=0) {
			foundAddress.setDoorNo(address.getDoorNo());
		}
		if(address.getCountry()!=null) {
			foundAddress.setCountry(address.getCountry());
		}
		
		if(address.getPostalCode()!=null) {
			foundAddress.setPostalCode(address.getPostalCode());
		}
		if(address.getState()!=null) {
			foundAddress.setState(address.getState());
		}
		Address updatedaddress =addao.updateAddress(foundAddress);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("Updated Old Address").body(updatedaddress).build());
		
	}

	public ResponseEntity<ResponseStructure<Object>> patchAddressUsingEmpId(int e_id, int a_id, Address address) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Address> optional2 = addao.findAddressByEmpAndAddrId(e,a_id);
		if(optional2.isEmpty()) {
			throw NoAddressDetailsFoundException.builder().message("No Addrress with Given Id Found With Specfied Employee Id to Update").build();
		}
		Address foundAddress = optional2.get();
		if(address.getStreetAddress()!=null) {
			foundAddress.setStreetAddress(address.getStreetAddress());
		}
		if(address.getAddressLine2()!=null) {
			foundAddress.setAddressLine2(address.getAddressLine2());
		}
		if(address.getAddressType()!=null) {
			foundAddress.setAddressType(address.getAddressType());
		}
		if(address.getCity()!=null) {
			foundAddress.setCity(address.getCity());
		}
		if(address.getDoorNo()!=0) {
			foundAddress.setDoorNo(address.getDoorNo());
		}
		if(address.getCountry()!=null) {
			foundAddress.setCountry(address.getCountry());
		}
		
		if(address.getPostalCode()!=null) {
			foundAddress.setPostalCode(address.getPostalCode());
		}
		if(address.getState()!=null) {
			foundAddress.setState(address.getState());
		}
		Address patchedAddress =addao.saveAddress(foundAddress);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(ResponseStructure.builder().statuscode(HttpStatus.ACCEPTED.value()).mesg("Patched Old Address").body(patchedAddress).build());
		
	
	}

	public ResponseEntity<ResponseStructure<Object>> deleteAllAddressUsingEmpId(int e_id) {
		
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		List<Address> la = addao.findAddressByEmp(e);
		if(la.size()<1) {
			throw NoAddressDetailsFoundException.builder().message("No Address Found On this Employee ID").build();
		}
		Iterator<Address> it = la.iterator();
			
		while(it.hasNext()) {
			Address temp = it.next();
			temp.setEmployee(null);
			
			addao.updateAddress(temp);
		}
		addao.deleteAllAddress(e);
		return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(ResponseStructure.builder().statuscode(HttpStatus.NO_CONTENT.value()).mesg("Delete Operation done Successfully").body("Deleted All Address Details related to Given Employee Id").build());
	}

	public ResponseEntity<ResponseStructure<Object>> deleteAddressUsingEmpIdandAddId(int e_id, int a_id) {
		Optional<Employee> optional = edao.findEmployeeById(e_id);
		if(optional.isEmpty()) {
			throw InvalidEmployeeIdException.builder().message("Employee Specified with given Id is not present").build();
		}
		Employee e = optional.get();
		Optional<Address> optional2 = addao.findAddressByEmpAndAddrId(e, a_id);
		if(optional2.isEmpty()) {
			throw NoAddressDetailsFoundException.builder().message("No Address Found Associated with this Emp id").build();
		}
		Address foundAddress = optional2.get();
		foundAddress.setEmployee(null);
		addao.saveAddress(foundAddress);
		addao.deleteAddress(a_id);
		return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(ResponseStructure.builder().statuscode(HttpStatus.NO_CONTENT.value()).mesg("Delete Operation done Successfully").body("Deleted Particular given Address id related to Given Employee Id").build());
	}
}
