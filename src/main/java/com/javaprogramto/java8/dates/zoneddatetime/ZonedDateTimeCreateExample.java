package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeCreateExample {

	public static void main(String[] args) {

		// Create ZonedDateTime Object - using current date and time from now()
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("ZonedDateTime current time value : " + zonedDateTime);

		// using of() method
		ZonedDateTime tokyoTime = ZonedDateTime.of(2025, 01, 01, 01, 01, 30, 1000, ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo time : " + tokyoTime);

		// using of() method with localdate and localtime objects
		ZonedDateTime usaCentralTime = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("America/Chicago"));
		System.out.println("chicago time : " + usaCentralTime);

		// using of() and LocalDateTime class
		ZonedDateTime estTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/New_York"));
		System.out.println("new york time : " + estTime);
	}

}
