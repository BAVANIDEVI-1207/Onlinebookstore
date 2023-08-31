package com.example.project.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String BookName;
	private int Stocks;
	public Books() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public int getStocks() {
		return Stocks;
	}
	public void setStocks(int stocks) {
		Stocks = stocks;
	}
	public Books(int id, String bookName, int stocks) {
		super();
		this.id = id;
		BookName = bookName;
		Stocks = stocks;
	}
}
	