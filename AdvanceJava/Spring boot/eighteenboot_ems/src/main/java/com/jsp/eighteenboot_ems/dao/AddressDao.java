package com.jsp.eighteenboot_ems.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.eighteenboot_ems.entity.Address;
import com.jsp.eighteenboot_ems.entity.Employee;
import com.jsp.eighteenboot_ems.repository.AddressRepository;

@Component
public class AddressDao {
	@Autowired
	private AddressRepository arepos;

	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return arepos.save(address);
	}

	public List<Address> findAddressByEmp(Employee e) {
		// TODO Auto-generated method stub
		return arepos.findAddressByEmp(e);
	}

	public Optional<Address> findAddressByEmpAndAddrId(Employee e, int a_id) {
		// TODO Auto-generated method stub
		return arepos.findAddByEmpAndId(e,a_id);
	}

	public void deleteAddress(int id) {
		// TODO Auto-generated method stub
		arepos.deleteById(id);
	}

//	public void deleteAllAddress(Employee e, int a_id) {
//		// TODO Auto-generated method stub
//		arepos.deleteAddress(e,a_id);
//	}

	public Address updateAddress(Address foundAddress) {
		// TODO Auto-generated method stub
		return arepos.save(foundAddress);
	}

	public void deleteAllAddress(Employee e) {
		// TODO Auto-generated method stub
		arepos.deleteAllAddress(e);
	}

	
}
