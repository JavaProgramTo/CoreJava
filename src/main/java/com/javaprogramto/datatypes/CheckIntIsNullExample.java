package com.javaprogramto.datatypes;

public class CheckIntIsNullExample {

	public static void main(String[] args) {

		Book book = new Book();

		if (book.getId() == null) {
			System.out.println("given book id null");
		}
	}

}

class Book {
	int id;
	String name;

	public Book() {

	}

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}

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
}