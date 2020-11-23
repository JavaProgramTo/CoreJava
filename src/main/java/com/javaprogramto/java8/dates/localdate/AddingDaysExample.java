package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

public class AddingDaysExample {

	public static void main(String[] args) {
		// creating current date time
		LocalDate currentDate = LocalDate.now();
		
		// Getting the next date
		LocalDate nextDay = currentDate.plusDays(1);
		
		// Getting the previous date
		LocalDate previousDay = currentDate.minusDays(1);
		
		System.out.println("Current date : "+currentDate);
		System.out.println("Next date : "+nextDay);
		System.out.println("Previous date : "+previousDay);
	}
}
