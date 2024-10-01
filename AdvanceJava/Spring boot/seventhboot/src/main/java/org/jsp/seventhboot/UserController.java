package org.jsp.seventhboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User u) {
	
		User saveduser = repository.save(u);
		return saveduser;
	}
	@GetMapping("/users")
	public List<User> findAllUsers(){
		List<User> ul = repository.findAll();
		return ul;
	}
	@GetMapping("/user")
	public Object findUserById(@RequestParam int id) {
		Optional<User> op = repository.findById(id);
		if(op.isEmpty()) {
			return "Empty ";
		}
		if(op.isPresent()) {
			User u= op.get();
			return u;
		}else {
			return "Invalid User ID: ";
		}
		
	}
	@DeleteMapping("/user")
	public String deleteUserById(@RequestParam int id) {
		Optional<User> op = repository.findById(id);
		if(op.isEmpty()) {
			return "No User Found  to delete";
		}else {
			op = null;
			repository.deleteById(id);
			op=repository.findById(id);
			if(op.isPresent()) {
				return "Something Wrong occurred";
			}else {
				return "User Removed Successfully...";
			}
		}
		
	}
	
	

}
