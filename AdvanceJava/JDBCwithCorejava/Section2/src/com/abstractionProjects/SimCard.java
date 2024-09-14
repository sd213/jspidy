package com.abstractionProjects;

public class SimCard {

	private String phoneNumber;
	private boolean activated = false;
	
	public SimCard(String phoneNumber){
		if(phoneNumber.length()==10) {
			this.phoneNumber = phoneNumber;
		}
		else {
			System.out.println("Invalid "+phoneNumber.length()+ "digit Phone Number");
		}
	}
	public boolean isActivated() {
		return activated;
	}
	public void Activate() {
		if(!activated) {
			System.out.println("\n\nActivating Sim "+ phoneNumber+"\n\n");
			activated = true;
		}
		else {
			System.out.println("Can Not Be Reactivate Again");
		}
	}
	public void Deactivate() {
		if(activated) {
			System.out.println("Deactivating Sim"+ phoneNumber +"\n\n");
			activated = false;
		}
		else {
			System.out.println("Already deactivated");
		}
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
