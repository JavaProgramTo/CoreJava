package com.javaprogramto.java8.dates.datetimeformatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterZonedDateTimeToStringExample {

	public static void main(String[] args) {

		// Creating a custom formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/dd/yyyy 'at' hh:mm a z");

		// Getting current date time using ZonedDateTime.now() method
		ZonedDateTime datetime = ZonedDateTime.now();

		// converting date to string
		String fullForm = datetime.format(formatter);

		// printing date string form
		System.out.println("ZonedDateTime form in string : " + fullForm);
	}
}
