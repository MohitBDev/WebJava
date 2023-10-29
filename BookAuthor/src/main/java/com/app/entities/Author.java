package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="author")
@JsonIgnoreType

public class Author extends BaseEntity  {
	@Column(length = 30)
	private String aname;
	@Column(length = 30)
	private  String email;
	@Column(length = 30)
	private String  password;
	@OneToMany(mappedBy = "author",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Book> books =new ArrayList<>();
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Author() {
		super();
	}
	@Override
	public String toString() {
		return "Author [aname=" + aname + ", email=" + email + ", password=" + password + "]";
	}
	//helper methods
	public boolean addbook(Book b) {
		books.add(b);
		b.setAuthor(this);
		return true;
		
	}
	public boolean removebook(Book b) {
		books.remove(b);
		b.setAuthor(null);
		return true;
		
	}
	

}
