package mms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Mobile {
	
	private String brand;
	
	@Autowired // Automatically Injected to the reference variable from Objec address
	private Sim sim;
	
	public Sim getSim() {
		return sim;
	}
	
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public Mobile() {
		System.out.println("Mobile No Argument Constructor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", sim=" + sim + "]";
	}

	
	
	
}

