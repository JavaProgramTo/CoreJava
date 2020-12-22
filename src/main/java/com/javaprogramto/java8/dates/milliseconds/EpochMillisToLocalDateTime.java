package com.javaprogramto.java8.dates.milliseconds;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * java Example to convert millisconds to LocalDateTime
 * 
 * @author JavaProgramTo.com
 *
 */
public class EpochMillisToLocalDateTime {

	public static void main(String[] args) {

		// current time in epoch format
		long epochMilliSeconds = 1608647457000l;
		
		// epoch time to Instant
		Instant instant = Instant.ofEpochMilli(epochMilliSeconds);
		
		// Instant to ZonedDateTime
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		
		// ZonedDateTime to LocalDate
		LocalDateTime localDateTime1 = zonedDateTime.toLocalDateTime();
		
		System.out.println("LocalDateTime 1 : "+localDateTime1);
		
		// simplified code
		LocalDateTime localDateTime2 = Instant.ofEpochMilli(epochMilliSeconds).atZone(ZoneId.systemDefault()).toLocalDateTime();

		System.out.println("LocalDateTime 2 : "+localDateTime2);
	}
}
