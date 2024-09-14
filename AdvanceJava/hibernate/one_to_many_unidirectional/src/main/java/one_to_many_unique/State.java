package one_to_many_unique;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class State {
	@Id
	private int id;
	private String name;
	private String capital;
	
	@OneToMany
//    private ArrayList<District> districts; // org.hibernate.AnnotationException: java.util.ArrayList collection type not supported for property: one_to_many_unique.State.districts
	private List<District> districts;

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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", capital=" + capital + ", districts=" + districts + "]";
	}
	
	
	

}
