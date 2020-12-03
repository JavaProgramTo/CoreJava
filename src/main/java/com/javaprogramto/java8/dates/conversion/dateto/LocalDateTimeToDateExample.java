package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Example to convert java.time.LocalDateTime to java.util.Date.
 * 
 * @author javaprogramto.com
 */
public class LocalDateTimeToDateExample {

	public static void main(String[] args) {

		// Creating the LocalDatetime object
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		
		// converting LocalDateTime to ZonedDateTime with the system timezone
		ZonedDateTime zonedDateTime = currentLocalDateTime.atZone(ZoneId.systemDefault());
		
		// converting ZonedDateTime to Date using Date.from() and ZonedDateTime.toInstant()
		Date utilDate = Date.from(zonedDateTime.toInstant());
		
		// Printing the input and output dates
		System.out.println("currentLocalDateTime : "+currentLocalDateTime);
		System.out.println("utilDate : "+utilDate);

	}

}
