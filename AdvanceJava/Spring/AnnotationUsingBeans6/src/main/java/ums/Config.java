package ums;

import java.util.ArrayList;
import java.util.TreeMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"mms","ums"})
public class Config {
	@Bean
	ArrayList arrayList(){
		
//		return new ArrayList();
		ArrayList<String> a = new ArrayList<String>();
		a.add("som");
		a.add("Smith");
		return a;
	}
	
	@Bean
	TreeMap<String, String> treeList(){
//		return new TreeMap();
		TreeMap<String, String> t = new TreeMap<String,String>();
		t.put("Father","Sanjay Das");
		t.put("Mother","Bijay Laxmi Sahoo");
		t.put("Uncle", "Sangram Das");
		t.put("Cousin", "Tanmay Das");
		
		return t;
	}
}
