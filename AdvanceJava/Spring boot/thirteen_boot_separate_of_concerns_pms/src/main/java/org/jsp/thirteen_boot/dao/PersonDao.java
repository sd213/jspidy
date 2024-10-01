package org.jsp.thirteen_boot.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.thirteen_boot.entity.Person;
import org.jsp.thirteen_boot.repository.PersonRepository;
import org.jsp.thirteen_boot.responsestructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	@Autowired
	private PersonRepository repos;
	
	public Person savePersonDao(Person person) {
		return repos.save(person);
	}
	
	public List<Person> findAllUsersDao(){
		return repos.findAll();
	}
	public Optional<Person> findUserByIdDao(int id){
		return repos.findById(id);
	}
	public void  deleteUserByIdDao(int id){
		repos.deleteById(id);
	}
	public Person updatePersonDao(Person person){
		
		return repos.save(person);
	}
	
	public Optional<Person> findPersonByEmailAndIdDao(String email, String password) {
		return repos.findByEmailAndPassword(email, password);
	}
	public List<Person> findPersonByNameDao(String name) {
		// TODO Auto-generated method stub
		return repos.findByPersonName(name);
	}
}
