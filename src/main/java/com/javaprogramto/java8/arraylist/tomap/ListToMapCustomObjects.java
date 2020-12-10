package com.javaprogramto.java8.arraylist.tomap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapCustomObjects {

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(
										new Book(100, "book 1", 2017), 
										new Book(101, "book 2", 2018),
										new Book(102, "book 3", 2019), 
										new Book(103, "book 4", 2020)
										);

		// map1 with key = id and value is book object
		Map<Integer, Book> map1 = books.stream().
												collect(Collectors.toMap(Book::getId, Function.identity()));
		
		// map2 with key = yearReleased and value is book object
		Map<Integer, Book> map2 = books.stream().
												collect(Collectors.toMap(Book::getYearRealeased, Function.identity()));
		
		// map3 with key = author name and value is year released
		Map<String, Integer> map3 = books.stream().
												collect(Collectors.toMap(Book::getAuthor, Book::getYearRealeased));
		
		// printing
		System.out.println("List of books --> "+books);
		System.out.println("Map1 --> "+map1);
		System.out.println("Map2 --> "+map2);
		System.out.println("Map3 --> "+map3);

	}

}
