package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterLocalTimeToStringExample {

	public static void main(String[] args) {

		// Creating a custom formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:ss a");

		// Getting current date time using LocalTime.now() method
		LocalTime datetime = LocalTime.now();

		// converting date to string
		String fullForm = datetime.format(formatter);

		// printing date string form
		System.out.println("LocalTime form in string : " + fullForm);
	}
}
