package mobilemanf;

import org.springframework.stereotype.Component;

@Component
public class Sim {
	private int id;
	private String company;
	public Sim() {
		System.out.println("Sim No Argument Constructor");
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Sim [id=" + id + ", company=" + company + "]";
	}
	
	
	
	
}
