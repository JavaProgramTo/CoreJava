package com.javaprogramto.java8.dates.currentdate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class CurrentTime {

	public static void main(String[] args) {
		
		// getting the current date from LocalTime.now() method
		LocalTime currentDate = LocalTime.now();
		
		System.out.println("Current time from LocalTime in IST (+05:30): "+currentDate);
		
		// Getting the current daet in Gmt +5
		LocalTime gmtPlus5 = LocalTime.now(ZoneId.of("GMT+06:30"));
		
		System.out.println("Current time in GMT +05:00 : "+gmtPlus5);
		
		// Gettting the date from LocalTimeTime object.
		LocalDateTime LocalTimeTime = LocalDateTime.now();
		LocalTime fromLocalTimeTime = LocalTimeTime.toLocalTime();
		System.out.println("From LocalDateTime : "+fromLocalTimeTime);
	}
}
