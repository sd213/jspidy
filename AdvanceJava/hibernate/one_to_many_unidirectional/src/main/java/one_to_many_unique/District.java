package one_to_many_unique;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class District {
	@Id
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public District() {
		
	}
	
	public District(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + "]";
	}
	
	
}
