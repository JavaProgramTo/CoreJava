package com.javaprogramto.java8.dates.compare;

import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Example program to compare two dates in java 8 with ZonedDateTime.
 * 
 * @author JavaProgramTo.com
 *
 */
public class DateCompareZonedDateTimeInJava8 {

	public static void main(String[] args) throws ParseException {

		// Creating first date using ZonedDateTime.of() method with nano seconds and time zone id.
		ZonedDateTime zonesDatetime1 = ZonedDateTime.of(2021, 02, 01, 01, 01, 01, 1, ZoneId.systemDefault());

		// Creating second date using ZonedDateTime.now() method with milliseconds.
		ZonedDateTime zonedDatetime2 = ZonedDateTime.now();

		// comparing dates with isEqual(), isAfter() and isBefore() methods.
		boolean isEqual = zonesDatetime1.isEqual(zonedDatetime2);
		boolean isAfter = zonesDatetime1.isAfter(zonedDatetime2);
		boolean isBefore = zonesDatetime1.isBefore(zonedDatetime2);

		// java 8 date comparisons results
		System.out.println("ZonedDateTime 1 and ZonedDateTime 2 are equals? : " + isEqual);
		System.out.println("ZonedDateTime 1 is after ZonedDateTime 2? : " + isAfter);
		System.out.println("ZonedDateTime 1 is before ZonedDateTime 2? : " + isBefore);
	}

}
