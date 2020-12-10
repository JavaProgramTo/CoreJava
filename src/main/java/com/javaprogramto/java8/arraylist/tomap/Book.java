package com.javaprogramto.java8.arraylist.tomap;

public class Book {

	private int id;
	private String author;
	private int yearRealeased;

	public Book(int id, String author, int yearRealeased) {
		this.id = id;
		this.author = author;
		this.yearRealeased = yearRealeased;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearRealeased() {
		return yearRealeased;
	}

	public void setYearRealeased(int yearRealeased) {
		this.yearRealeased = yearRealeased;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", yearRealeased=" + yearRealeased + "]";
	}
}
