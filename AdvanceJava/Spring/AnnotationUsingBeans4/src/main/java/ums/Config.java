package ums;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import mms.Sim;

@Configuration
@ComponentScan(basePackages = {"mms","ums"})
public class Config {
	
//	@Bean 
//	Sim simgen() {
//		return new Sim();
//	}
	@Bean
	ArrayList arrayList(){
		
//		return new ArrayList();
		ArrayList<String> a = new ArrayList<String>();
		a.add("som");
		a.add("Smith");
		return a;
	}
}
