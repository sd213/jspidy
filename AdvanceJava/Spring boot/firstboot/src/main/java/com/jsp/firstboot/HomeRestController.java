package com.jsp.firstboot;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	@RequestMapping("/hi3")			//
	public String hi3() {
		System.out.println("Hi from HomeRestController Class");
//		return null;
		return "hi from HomeRestController...";
	}
	

	
	
	@RequestMapping("/hello3")
	public String hello3() {
		return "HELLO From Home";
	}

	@RequestMapping("/save2")
	public String  saveUser2() {
		return "User Saved Successfully ... ";
	}
	
	@RequestMapping("/findall")
	public String findAllUsers() {
		return "All Users Found Successfully";
	}
	
	@RequestMapping("/save3")
	public User saveUser3() {
		User u = new User();
		return u;
	}
	
	@RequestMapping("/save4")
	public User saveUser4(@RequestParam int id, @RequestParam String name, @RequestParam String email,@RequestParam long phone,@RequestParam String password) {
		
		System.out.println("id"+id);
		System.out.println("name :"+name);
		System.out.println("email :"+email);
		System.out.println("phone :"+phone);
		System.out.println("password :"+password);
		
		User u = new User();
		u.setId(id);
		u.setName(name);
		u.setEmail(email);
		u.setPassword(password);
		u.setPhone(phone);
		
		return u;
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password) {
		
		System.out.println(username);
		System.out.println(password);
		if(username.equals("som") && "mos".equals(password)) {			
				return "Login Successfull :) ..";
		}else {
			return "Login Unsuccessfull :(";
		}
		
		
	}
	
	@RequestMapping("/save5")
	public User saveUser5(@RequestBody User user) {
		
		
		return user;
	}
	
	@RequestMapping("/findPerson")
	public Person findPerson(@RequestBody Person person) {
		return person;
	}
}

