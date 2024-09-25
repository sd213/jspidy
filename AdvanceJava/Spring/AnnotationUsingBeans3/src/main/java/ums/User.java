package ums;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import mms.Mobile;
import mms.Sim;
@Component
public class User {

	@Value(value="101")
	private int id;
	@Value(value="Somit")
	private String name;
	@Value(value="somitdas212@gmail.com")
	private String email;
	@Value(value="44558588554")
	private long phone;
	@Value(value="Skl994e994")
	private String password;
	
	@Autowired
	private Mobile m;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Mobile getM() {
		return m;
	}
	public void setM(Mobile m) {
		this.m = m;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", mobile =" + m +  "]";
	}
	
	
}
