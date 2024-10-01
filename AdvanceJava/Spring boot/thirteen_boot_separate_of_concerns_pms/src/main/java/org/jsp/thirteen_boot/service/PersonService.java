package org.jsp.thirteen_boot.service;

import java.util.List;
import java.util.Optional;

import org.jsp.thirteen_boot.dao.PersonDao;
import org.jsp.thirteen_boot.entity.Person;
import org.jsp.thirteen_boot.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {
	
	@Autowired
	private PersonDao dao;
	
	public ResponseStructure<Person> savePersonService(Person person) {
		Person dbUser = dao.savePersonDao(person);
		ResponseStructure<Person> structure = new ResponseStructure<>();
		structure.setStatus(201);
		structure.setMessage("Person Saved Successfully");
		structure.setBody(dbUser);
		return structure;
	}
	
	public ResponseStructure<List<Person>> findAllUsersService() {
		List<Person> pl = dao.findAllUsersDao();
		ResponseStructure<List<Person>> structure =  new ResponseStructure<>();
		if(pl.isEmpty()) {
			structure.setStatus(404);
			structure.setMessage("No Users Found");
			structure.setBody(null);
			return structure;
			
		}else {
			structure.setStatus(200);
			structure.setMessage("Query Executed Successfully");
			structure.setBody( pl);
			return structure;
		}
		
	}
	public ResponseStructure<Object> findUserByIdService(int id){
		Optional<Person> op =dao.findUserByIdDao(id);
		ResponseStructure<Object> structure = new ResponseStructure<>();
		if(op.isPresent()) {
			Person p= op.get();
			structure.setStatus(200);
			structure.setMessage("Found Person Successfully");
			structure.setBody(p);
			return structure;
			
		}
		else {
			
			structure.setStatus(404);
			structure.setMessage("No Person Found");
			structure.setBody(null);
			return structure;
		}
	}
	public ResponseStructure<String> deleteUserByIdService(int id){
		Optional<Person> op = dao.findUserByIdDao(id);
		ResponseStructure<String> structure = new ResponseStructure<>();
		if(op.isPresent()) {

			Person p = op.get();
			dao.deleteUserByIdDao(id);
			op=dao.findUserByIdDao(id);
			if(op.isEmpty()) {
				structure.setStatus(200);
				structure.setMessage("Deleted  Successfully");
				structure.setBody("Person Deleted");
				return structure;
			}else {
				structure.setStatus(500);
				structure.setMessage("Deletion Operation performed Unsuccesfully");
				structure.setBody("Person is Found but Can not able to delete Person");
				return structure;
			}
		}
		else {
			structure.setStatus(404);
			structure.setMessage("No Users Found");
			structure.setBody("No Person is there to delete");
			return structure;
		}
		
	}
	public ResponseStructure<Person> updatePersonService(Person person){
		dao.updatePersonDao(person);
		ResponseStructure<Person> structure =  new ResponseStructure<>();
		structure.setStatus(201);
		structure.setMessage("Person Updated Successfully");
		structure.setBody(person);
		return structure;
	}
	public ResponseStructure<Person> findPersonByEmailAndPassWordService(String email,String password){
		Optional<Person> op = dao.findPersonByEmailAndIdDao(email,password);
		ResponseStructure<Person> structure = new ResponseStructure<>();
		if(op.isEmpty()) {
			structure.setStatus(404);
			structure.setMessage("Invalid Credenetials ...");
			structure.setBody(null);
			return structure;
		}
		Person p = op.get();
		structure.setStatus(200);
		structure.setMessage("Person Verification Successfull....");
		structure.setBody(p);
		return structure;
	}

	public ResponseStructure<List<Person>> findUserByNameService(String name) {
		// TODO Auto-generated method stub
		List<Person> pl = dao.findPersonByNameDao(name);
		ResponseStructure<List<Person>> structure = new ResponseStructure<>();
		if(pl.size()<1) {
			structure.setStatus(404);
			structure.setMessage("Not found with Given name");
			structure.setBody(null);
			return structure;
		}
		
		structure.setStatus(200);
		structure.setMessage("Person Found...");
		structure.setBody(pl);
		return structure;
		
	}
}
