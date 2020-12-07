package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Example for public ZonedDateTime atStartOfDay(ZoneId zoneid) method in
 * LocalDate class in java 8.
 * 
 * @author JavaProgramTo.com
 *
 */

public class LocalDateAtStartOfDayZoneIdExamples {

	public static void main(String[] args) {
		// Example 1 - IST

		// creating LocalDate object
		LocalDate localDate1 = LocalDate.now();

		// Getting the default timezone from system.
		ZoneId defaultId = ZoneId.systemDefault();

		// converting LocalDate object to ZonedDateTime object using timezone.
		ZonedDateTime zonedDateTime1 = localDate1.atStartOfDay(defaultId);

		// printing the LocalDate, ZonedDateTime objects
		System.out.println("localDate1 : " + localDate1);
		System.out.println("zonedDateTime1 : " + zonedDateTime1);

		// Example 2 - EST

		// creating LocalDate object
		LocalDate localDate2 = LocalDate.of(2023, 02, 02);

		// Getting the EST timezone from system.
		ZoneId timezoneESTId = ZoneId.of("US/Eastern");

		// converting LocalDate object to ZonedDateTime object using est zone id;
		ZonedDateTime zonedDateTime2 = localDate2.atStartOfDay(timezoneESTId);

		// printing the LocalDate, ZonedDateTime objects
		System.out.println("localDate2 : " + localDate2);
		System.out.println("zonedDateTime2 : " + zonedDateTime2);

		// Example 2 - Singapore

		// creating LocalDate object
		LocalDate localDate3 = LocalDate.of(2023, 02, 02);

		// Getting the Asia/Singapore timezone from system.
		ZoneId timezoneSingaporeId = ZoneId.of("Asia/Singapore");

		// converting LocalDate object to ZonedDateTime object using Asia/Singapore zone id;
		ZonedDateTime zonedDateTime3 = localDate3.atStartOfDay(timezoneSingaporeId);

		// printing the LocalDate, ZonedDateTime objects
		System.out.println("localDate3 : " + localDate3);
		System.out.println("zonedDateTime3 : " + zonedDateTime3);
	}
}
