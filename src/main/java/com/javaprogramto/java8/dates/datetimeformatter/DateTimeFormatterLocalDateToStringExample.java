package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterLocalDateToStringExample {

	public static void main(String[] args) {

		// Creating a custom formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");

		// Getting current date time using LocalDate.now() method
		LocalDate datetime = LocalDate.now();

		// converting date to string
		String fullForm = datetime.format(formatter);

		// printing date string form
		System.out.println("LocalDate form in string : " + fullForm);
	}

}
