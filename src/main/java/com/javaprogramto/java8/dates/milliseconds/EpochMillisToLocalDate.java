package com.javaprogramto.java8.dates.milliseconds;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * java Example to convert millisconds to LocalDate
 * 
 * @author JavaProgramTo.com
 *
 */
public class EpochMillisToLocalDate {

	public static void main(String[] args) {

		// current time in epoch format
		long epochMilliSeconds = 1608647457000l;
		
		// epoch time to Instant
		Instant instant = Instant.ofEpochMilli(epochMilliSeconds);
		
		// Instant to ZonedDateTime
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
		
		// ZonedDateTime to LocalDate
		LocalDate localDate1 = zonedDateTime.toLocalDate();
		
		System.out.println("LocalDate 1 : "+localDate1);
		
		// simplified code
		LocalDate localDate2 = Instant.ofEpochMilli(epochMilliSeconds).atZone(ZoneId.systemDefault()).toLocalDate();

		System.out.println("LocalDate 2 : "+localDate2);
	}
}
