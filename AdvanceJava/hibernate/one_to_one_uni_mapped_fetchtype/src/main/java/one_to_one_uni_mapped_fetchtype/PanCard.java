package one_to_one_uni_mapped_fetchtype;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PanCard {
	
	@Id
	private int id;
	private String panNo;
	private int pinCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public PanCard(int id, String panNo, int pinCode) {
		super();
		this.id = id;
		this.panNo = panNo;
		this.pinCode = pinCode;
	}
	
	
}
