package com.javaprogramto.java8.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import pl.touk.throwing.ThrowingFunction;

public class ThrowingFunctionExample {

	public static void main(String[] args) {
		Book b1 = new Book(123, "/bookstore/100/23/book123.pdf");
		Book b2 = new Book(145, "/bookstore/100/45/book145.pdf");
		Book b3 = new Book(167, "/bookstore/100/67/book167.pdf");

		List<Book> books = Arrays.asList(b1, b2, b3);

		Stream<Boolean> validBooks = books.stream().map(ThrowingFunction.unchecked(Book::isValidBookLocation));

	}

}
