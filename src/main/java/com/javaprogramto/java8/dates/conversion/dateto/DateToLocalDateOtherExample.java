package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Example to convert java.util.Date to java.time.LocalDateTime using
 * Instant.ofEpochMillis() and sql.Date.toLcoalDateTime() methods
 * 
 * @author javaprogramto.com
 */
public class DateToLocalDateOtherExample {

	public static void main(String[] args) {

		// Creating date using util.Date api
		Date currentDate = new Date();

		// using instant.ofEpochMilli() method
		LocalDate localDate = Instant.ofEpochMilli(currentDate.getTime()).atZone(ZoneId.systemDefault())
				.toLocalDate();

		// using java.sql.TimeStamp
		LocalDate localDate2 = new java.sql.Date(currentDate.getTime()).toLocalDate();

		// printing the dates in LocalDate
		System.out.println("java.util Date : " + currentDate);
		System.out.println("java.time.LocalDate from instat : " + localDate);
		System.out.println("java.time.LocalDate from TimeStamp : " + localDate2);

	}

}
