package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Bookauthor {

	private int id;
	@Id
	private String AuthorName;
	private String des;
	private int noofbooks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getNoofbooks() {
		return noofbooks;
	}
	public void setNoofbooks(int noofbooks) {
		this.noofbooks = noofbooks;
	}
	public Bookauthor(int id, String authorName, String des, int noofbooks) {
		super();
		this.id = id;
		AuthorName = authorName;
		this.des = des;
		this.noofbooks = noofbooks;
	}
	public Bookauthor() {
		super();
	}
	
	
	

}
