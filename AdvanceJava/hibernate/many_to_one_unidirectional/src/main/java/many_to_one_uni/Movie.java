package many_to_one_uni;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Movie {
	@Id
	private int id;
	private String name;
	private String yor;
	
	@ManyToOne
	private Director director;

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

	public String getYor() {
		return yor;
	}

	public void setYor(String yor) {
		this.yor = yor;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", yor=" + yor + ", director=" + director + "]";
	}
	
}
