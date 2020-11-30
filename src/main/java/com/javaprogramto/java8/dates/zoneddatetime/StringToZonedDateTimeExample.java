package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class StringToZonedDateTimeExample {

	public static void main(String[] args) {

		// date in strig format
		String dateInString = "2020-11-16T16:57:08.648655+05:30[Asia/Kolkata]";

		// convert string to date format
		ZonedDateTime date = ZonedDateTime.parse(dateInString);

		// print the date onto console
		System.out.println("Final date created from string : " + date);

		// exception part.
		// trying into 
		String onlyDateInString = "2020-11-16";
		
		ZonedDateTime onlyDate = ZonedDateTime.parse(onlyDateInString, DateTimeFormatter.ISO_DATE);

		System.out.println("Only date" + onlyDate);
	}
}
