package com.example.project.model;

import java.util.List;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Bookstore")
public class Storemodel {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;
private String Title;
private String Author;
private String joner;
//@Column(name="p")
private long price;
private int stock;
//One to one
@OneToOne(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
@JoinColumn(name="storeid",referencedColumnName ="id")
private Books books;
public Books getBooks() {
	return books;
}
public void setBooks(Books books) {
	this.books = books;
}
public void setAuthor(List<Bookauthor> author) {
	this.author = author;
}
//one to many
@OneToMany(cascade =CascadeType.ALL,fetch =FetchType.EAGER)
@JoinColumn(name="authorid",referencedColumnName = "id")
private List<Bookauthor>author;

public Storemodel(int id, String title, String author, String joner, long price, int stock) {
	super();
	this.id = id;
	Title = title;
	Author = author;
	this.joner = joner;
	this.price = price;
	this.stock = stock;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public String getJoner() {
	return joner;
}
public void setJoner(String joner) {
	this.joner = joner;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Storemodel() {
	super();
}

}
