package data;

public class Translations {
	int id;
	String  language;
	String author_name;
	String description;
	public Translations(int id, String language, String author_name, String description) {
		super();
		this.id = id;
		this.language = language;
		this.author_name = author_name;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
