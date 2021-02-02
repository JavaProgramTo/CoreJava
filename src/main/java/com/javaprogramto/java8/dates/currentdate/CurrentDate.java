package com.javaprogramto.java8.dates.currentdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentDate {

	public static void main(String[] args) {
		
		// getting the current date from LocalDate.now() method
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("Current Date from LocalDate : "+currentDate);
		
		// Getting the current daet in Gmt +5
		LocalDate gmtPlus5 = LocalDate.now(ZoneId.of("GMT+05"));
		
		System.out.println("Current time in GMT +05:00 : "+gmtPlus5);
		
		// Gettting the date from LocalDateTime object.
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDate fromLocalDateTime = localDateTime.toLocalDate();
		System.out.println("From LocalDateTime : "+fromLocalDateTime);
	}
}
