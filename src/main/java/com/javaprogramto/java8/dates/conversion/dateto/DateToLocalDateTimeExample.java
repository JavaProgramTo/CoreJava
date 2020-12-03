package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Example to convert java.util.Date to java.time.LocalDateTime
 * 
 * @author javaprogramto.com
 */
public class DateToLocalDateTimeExample {

	public static void main(String[] args) {

		// Creating date using util.Date api
		Date currentDate = new Date();

		// converting util date to java 8 Instnat
		Instant instant = currentDate.toInstant();

		// passing the current system timezone to the atZone() method to convert Instant
		// to ZonedDateTime object.
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());

		// convert ZonedDateTime to LocalDateTime using toLocalDateTime()
		LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();

		// printing the dates
		System.out.println("java.util.Date : " + currentDate);
		System.out.println("java.time.LocalDateTime : " + localDateTime);
	}
}