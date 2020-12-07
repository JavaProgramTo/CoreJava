package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Example to convert LocalDate to ZonedDateTime with PST zone.
 * 
 * @author JavaProgramTo.com
 *
 */
public class LocalDateToZonedDateTimePSTExample {

	public static void main(String[] args) {

		// Creating LocalDate object
		LocalDate localDate = LocalDate.now();

		// Creating timezone with PST zone id. We can pass here any timezone id supported by java.
		ZoneId zoneid = ZoneId.of("US/Pacific");

		// LocalDate to PST zoneddatetime
		ZonedDateTime zonedDateTimeInPST = localDate.atStartOfDay(zoneid);

		System.out.println("localDate : " + localDate);
		System.out.println("ZonedDateTime in PST : " + zonedDateTimeInPST);
	}
}
