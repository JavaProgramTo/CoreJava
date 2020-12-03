package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * Example to convert java.util.Date to java.time.LocalDateTime using
 * Instant.ofEpochMillis() and Timestamp.toLcoalDateTime() methods
 * 
 * @author javaprogramto.com
 */
public class DateToLocalDateTimeOtherExample {

	public static void main(String[] args) {

		// Creating date using util.Date api
		Date currentDate = new Date();

		// using instant.ofEpochMilli() method
		LocalDateTime localDateTime = Instant.ofEpochMilli(currentDate.getTime()).atZone(ZoneId.systemDefault())
				.toLocalDateTime();

		// using java.sql.TimeStamp
		LocalDateTime localDateTime2 = new java.sql.Timestamp(currentDate.getTime()).toLocalDateTime();

		// printing the dates
		System.out.println("java.util Date : " + currentDate);
		System.out.println("java.time.LocalDateTime from instat : " + localDateTime);
		System.out.println("java.time.LocalDateTime from TimeStamp : " + localDateTime2);

	}

}
