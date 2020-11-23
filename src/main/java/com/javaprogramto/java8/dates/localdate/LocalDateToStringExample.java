package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateToStringExample {

	public static void main(String[] args) {

		// Converting LocalDate to String
		// Example 1
		LocalDate date1 = LocalDate.now();
		String date1Str = date1.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date1 in string :  " + date1Str);

		// Example 2
		LocalDate date2 = LocalDate.of(2000, 01, 01);
		String date2Str = date2.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date2 in string :  " + date2Str);

		// Example 3
		LocalDate date3 = LocalDate.of(2006, 01, 01);
		String date3Str = date3.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Date3 in string :  " + date3Str);

	}

}
