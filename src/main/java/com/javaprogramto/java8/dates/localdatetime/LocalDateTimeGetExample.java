package com.javaprogramto.java8.dates.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeGetExample {

	public static void main(String[] args) {
		// Getting current date and time using now() method
		LocalDateTime currentDatetime = LocalDateTime.now();
		System.out.println("Current date time : " + currentDatetime);

		// Date format in yyyy-MMM-dd hh:mm
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MMM-dd hh:mm");

		// converting LocalDateTime to String type
		String dateInStr = currentDatetime.format(dateFormat);
		System.out.println("Date time in string : " + dateInStr);
	}
}
