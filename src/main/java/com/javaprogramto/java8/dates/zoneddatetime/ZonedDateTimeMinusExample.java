package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedDateTimeMinusExample {

	public static void main(String[] args) {

		// Create ZonedDateTime Object - using current date and time from now()
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime current time value : " + zonedDateTime);

		// using minusXXX() method
		ZonedDateTime daysSubtracted = zonedDateTime.minusDays(10);
		ZonedDateTime hoursSubtracted = zonedDateTime.minusHours(10);
		ZonedDateTime monthsSubtracted = zonedDateTime.minusMonths(1);
		ZonedDateTime yearsSubtracted = zonedDateTime.minusYears(2);

		System.out.println("Days Subtracted : "+daysSubtracted);
		System.out.println("Hours Subtracted : "+hoursSubtracted);
		System.out.println("Months Subtracted : "+monthsSubtracted);
		System.out.println("yearss Subtracted : "+yearsSubtracted);
		
		// Using minus(timeunit, value)
		ZonedDateTime secondsSubtracted = zonedDateTime.minus(10, ChronoUnit.SECONDS);
		ZonedDateTime weeksSubtracted = zonedDateTime.minus(2, ChronoUnit.WEEKS);
		
		System.out.println("Seconds Subtracted : "+secondsSubtracted);
		System.out.println("Weeks Subtracted : "+weeksSubtracted);
	}

}
