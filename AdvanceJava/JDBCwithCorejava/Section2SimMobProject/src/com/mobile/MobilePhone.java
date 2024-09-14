package com.mobile;

public class MobilePhone {
	
	private String brand;
	private String model;
	private SimCard sim;
	
	public MobilePhone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void insertSimCard(SimCard sim) {
		if(!sim.isActivated()) {
			sim.Activate();
			this.sim = sim;
		}
		else {
			this.sim = sim;
		}
	}
	public void makeCall(String phoneNumber) {
		if(sim == null) {
			System.out.println("Can't Make Call As No Sim Available");
		}
		else if(sim.getPhoneNumber()== phoneNumber) {
			System.out.println("Same Phone Number Calling is not possible");
		}
		else {
			if(sim.isActivated()) {
				System.out.println("Calling " + phoneNumber + " From Your No. "+sim.getPhoneNumber());
			}
			else {
				System.out.println("Sim is Present But for Use We have to Activate Sim");
			}
		}
	}
	public void displayPhoneInfo() {
		System.out.println("##### Mobile Details ####");
		System.out.println("Brand :- "+ brand + " , Model :-"+model);
		if(sim == null) {
			System.out.println("Sorry No Sim is Prsent As for Now");
		}
		else {
			if(sim.isActivated()) {
				System.out.println("Sim: "+ sim.getPhoneNumber()+" is currently Present and Activated");
			}
			else {
				System.out.println("Sim: "+ sim.getPhoneNumber()+" is currently Present but Deactivated");
			}
		}
	}

}
