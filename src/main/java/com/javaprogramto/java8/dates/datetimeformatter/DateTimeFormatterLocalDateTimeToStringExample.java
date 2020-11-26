package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterLocalDateTimeToStringExample {

	public static void main(String[] args) {

		// Creating a custom formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd 'at' hh:mm a");

		// Getting current date time using LocalDateTime.now() method
		LocalDateTime datetime = LocalDateTime.now();

		// converting date to string
		String fullForm = datetime.format(formatter);

		// printing date string form
		System.out.println("LocalDateTime form in string : " + fullForm);
	}

}
