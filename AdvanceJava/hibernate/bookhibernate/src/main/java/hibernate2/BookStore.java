package hibernate2;

import java.util.ArrayList;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookStore {
	
	@Id
	private int id;
	private String title;
	private long isbn;
	private int pageCount;
	private Date publishedDate;
	private String categories;
	private ArrayList<String> authors;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Date getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "BookStore [id=" + id + ", title=" + title + ", isbn=" + isbn + ", pageCount="
				+ pageCount + ", publishedDate=" + publishedDate + ", categories=" + categories + ", authors=" + authors
				+ "]";
	}
   
	
  
	
}
