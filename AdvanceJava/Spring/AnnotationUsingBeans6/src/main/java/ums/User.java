package ums;

import java.util.ArrayList;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mms.Mobile;
import mms.Sim;
@Component
public class User {

	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	@Autowired
	private Mobile m;
	@Autowired
	private ArrayList AliasList;
	
	@Autowired
	private TreeMap<String , String> relatives;
	
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
//	public void setM(Mobile m) {
//		this.m = m;
//	}
	public ArrayList getAliasList() {
		return AliasList;
	}
	public void setAliasList(ArrayList AliasList) {
		this.AliasList = AliasList;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
//				+ ", m=" + m + ", alias =" + AliasList + "]";
//	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", m=" + m + ", Alias Names =" + AliasList + ", relatives=" + relatives + "]";
	}
	public TreeMap<String, String> getRelatives() {
		return relatives;
	}
	public void setRelatives(TreeMap<String, String> relatives) {
		this.relatives = relatives;
	}
	
	
	
	
}
