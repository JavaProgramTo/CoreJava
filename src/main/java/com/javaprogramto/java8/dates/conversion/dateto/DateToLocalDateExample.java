package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateToLocalDateExample {

	public static void main(String[] args) {

		// Creating date using util.Date api
		Date currentDate = new Date();

		// converting util date to java 8 Instnat
		Instant instant = currentDate.toInstant();

		// passing the current system timezone to the atZone() method to convert Instant
		// to ZonedDateTime object.
		ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());

		//convert ZonedDateTime to LocalDate using toLocalDate()
		LocalDate localDate = zonedDateTime.toLocalDate();
		
		// printing the dates
		System.out.println("java.util.Date : "+currentDate);
		System.out.println("java.time.LocalDate : "+localDate);

	}

}
