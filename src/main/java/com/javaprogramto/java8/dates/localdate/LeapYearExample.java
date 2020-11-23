package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

public class LeapYearExample {
	public static void main(String[] args) {
		//	Example 1 - leap year checking
		LocalDate date1 = LocalDate.now();
		boolean isLeapYear = date1.isLeapYear();
		System.out.println(date1 + " is leap year ? " + isLeapYear);

		//	Example 2
		LocalDate date2 = LocalDate.of(2000, 01, 01);
		isLeapYear = date2.isLeapYear();
		System.out.println(date2 + " is leap year ? " + isLeapYear);

		//	Example 3
		LocalDate date3 = LocalDate.of(2006, 01, 01);
		isLeapYear = date3.isLeapYear();
		System.out.println(date3 + " is leap year ? " + isLeapYear);
		
	}
}
