package com.javaprogramto.java8.streams.filter;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

public class FiterThrowsException {

	public static void main(String[] args) {

		Book b1 = new Book(123, "/bookstore/100/23/book123.pdf");
		Book b2 = new Book(145, "/bookstore/100/45/book145.pdf");
		Book b3 = new Book(167, "/bookstore/100/67/book167.pdf");

		List<Book> books = Arrays.asList(b1, b2, b3);

		List<Book> validBooks = books.stream().filter(t -> {
			try {
				return t.isValidBookLocation();
			} catch (IOException e) {
				System.out.println("Errorn while checking the file : "+e.getMessage());
				e.printStackTrace();
			}
			return false;
		}).collect(Collectors.toList());

	}

}

class Book {
	private long id;
	private String path;

	public Book(long id, String path) {
		this.id = id;
		this.path = path;
	}

	public boolean isValidBookLocation() throws IOException {
		URL url = new URL(this.path);
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
	}

}
