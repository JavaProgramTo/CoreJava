package com.javaprogramto.java8.dates.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeCreationExample {

	public static void main(String[] args) {
		// Creating the current date and time using LocalDateTime.now() method
		LocalDateTime currentDatetime = LocalDateTime.now();
		System.out.println("Current date time : "+currentDatetime);

		// Creating the future date and time using LocalDateTime.of() method
		LocalDateTime futureDateTime = LocalDateTime.of(2025, 01, 01, 00, 45);
		System.out.println("Future date time : "+futureDateTime);
	}

}
