package com.jsp.fifthboot_ums;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@RequestMapping("/save")
	public User saveUser(@RequestBody User u) {
		System.out.println(u.getId());
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getPhone());
		User saveduser = repository.save(u);
		return saveduser;
	}
	@RequestMapping("/findallusers")
	public List<User> findAllUsers(){
		List<User> ul = repository.findAll();
		return ul;
	}
	@RequestMapping("/finduserbyid")
	public User findUserById(@RequestParam int id) {
		Optional<User> op = repository.findById(id);
		if(op.isEmpty()) {
			return null;
		}
		if(op.isPresent()) {
			User u= op.get();
			return u;
		}else {
			return null;
		}
		
	}

}
