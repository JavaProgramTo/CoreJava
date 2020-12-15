package com.javaprogramto.java8.dates.getdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		// using LocalDateTime class now() method
		LocalDateTime now = LocalDateTime.now();
		
		// printing
		System.out.println("Current date time from LocalDateTime : "+now);
	}
}
