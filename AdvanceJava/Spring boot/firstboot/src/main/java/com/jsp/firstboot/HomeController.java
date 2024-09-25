package com.jsp.firstboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
		
	@RequestMapping("/hi")			//
	public String hi() {
		System.out.println("Hi from HomeController Class");
//		return null;
		return "hi from homecontroller...";
	}
	
	@ResponseBody					//	
	@RequestMapping("/hi2")
	public String hi2() {
		System.out.println("Hi2 from HomeController Class");
//		return null;
		return "hi2 from homecontroller...";
	}
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "HELLO From Home";
	}
	
	@ResponseBody // Annotation that indicates a method return value should be bound to the webresponse body. Supported for annotated handler methods. 
	@RequestMapping("/hello2")
	public String hello2() {
		return "<h1>HELLO From Home2</h1>";
	}
	
	
	@ResponseBody
	@RequestMapping("/save")
	public String  saveUser() {
		return "User Saved Successfully ... ";
	}
}
