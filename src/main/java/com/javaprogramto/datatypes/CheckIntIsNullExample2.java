package com.javaprogramto.datatypes;

public class CheckIntIsNullExample2 {

	public static void main(String[] args) {

		BookInteger book = new BookInteger();

		if (book.getId() == null) {
			System.out.println("given book id null");
		} else {
			System.out.println("book is given is "+book.getId());
		}
	}

}

class BookInteger {
	Integer id;
	String name;

	public BookInteger() {

	}

	public BookInteger(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}