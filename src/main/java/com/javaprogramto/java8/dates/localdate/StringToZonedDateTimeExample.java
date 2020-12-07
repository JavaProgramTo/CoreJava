package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Example to convert String to ZonedDateTime.
 * 
 * @author JavaProgramTo.com
 *
 */
public class StringToZonedDateTimeExample {

	public static void main(String[] args) {

		// date in string format
		String date = "2022-03-02";

		// Converting String to LocalDate.
		LocalDate localDate = LocalDate.parse(date);

		// Creating timezone
		ZoneId zoneid = ZoneId.systemDefault();

		// LocalDate to zoneddatetime
		ZonedDateTime zonedDateTimeFromString = localDate.atStartOfDay(zoneid);

		System.out.println("String date : " + date);
		System.out.println("ZonedDateTime : " + zonedDateTimeFromString);

	}

}
