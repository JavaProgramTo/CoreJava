package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Example to convert java.time.LocalDate to java.util.Date.
 * 
 * @author javaprogramto.com
 */
public class LocalDateToDateExample {

	public static void main(String[] args) {

		// Creating the LocalDatetime object
		LocalDate currentLocalDate = LocalDate.now();
		
		// Getting system timezone
		ZoneId systemTimeZone = ZoneId.systemDefault();
		
		// converting LocalDateTime to ZonedDateTime with the system timezone
		ZonedDateTime zonedDateTime = currentLocalDate.atStartOfDay(systemTimeZone);
		
		// converting ZonedDateTime to Date using Date.from() and ZonedDateTime.toInstant()
		Date utilDate = Date.from(zonedDateTime.toInstant());
		
		// Printing the input and output dates
		System.out.println("LocalDate  : "+currentLocalDate);
		System.out.println("Util Date : "+utilDate);

	}

}
