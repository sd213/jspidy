package ums;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"mms","ums"})
public class Config {
	@Bean
	ArrayList arrayList(){
		
		return new ArrayList();
		
	}
}
