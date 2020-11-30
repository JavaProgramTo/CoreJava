package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimePlusExample {

	public static void main(String[] args) {

		// Create ZonedDateTime Object - using current date and time from now()
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime current time value : " + zonedDateTime);

		// using plusXXX() method
		ZonedDateTime daysAdded = zonedDateTime.plusDays(10);
		ZonedDateTime hoursAdded = zonedDateTime.plusHours(10);
		ZonedDateTime monthsAdded = zonedDateTime.plusMonths(1);
		ZonedDateTime yearsAdded = zonedDateTime.plusYears(2);

		System.out.println("Days added : "+daysAdded);
		System.out.println("Hours added : "+hoursAdded);
		System.out.println("Months added : "+monthsAdded);
		System.out.println("yearss added : "+yearsAdded);
		
		// Using plus(timeunit, value)
		ZonedDateTime secondsAdded = zonedDateTime.plus(10, ChronoUnit.SECONDS);
		ZonedDateTime weeksAdded = zonedDateTime.plus(2, ChronoUnit.WEEKS);
		
		System.out.println("Seconds added : "+secondsAdded);
		System.out.println("Weeks added : "+weeksAdded);
	}

}
