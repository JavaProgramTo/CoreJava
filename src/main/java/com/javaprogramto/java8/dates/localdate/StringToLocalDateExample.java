package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

// String to LocalDate in java 8
public class StringToLocalDateExample {

	public static void main(String[] args) {

		// Example 1
		String dateInStr = "2021-01-01";
		LocalDate date1 = LocalDate.parse(dateInStr);
		System.out.println("String to LocalDate : " + date1);

		// Example 2
		String dateInStr2 = "2025-11-30";
		LocalDate date2 = LocalDate.parse(dateInStr2);
		System.out.println("String to LocalDate : " + date2);

	}

}
