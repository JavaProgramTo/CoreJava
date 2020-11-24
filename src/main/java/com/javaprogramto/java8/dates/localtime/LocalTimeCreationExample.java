package com.javaprogramto.java8.dates.localtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeCreationExample {
	public static void main(String[] args) {

		// Getting the Los Angeles id from ZoneId.
		ZoneId zoneLosAngeles = ZoneId.of("America/Los_Angeles");

		// Getting the Amsterdam id from ZoneId.
		ZoneId zoneAmsterdam = ZoneId.of("Europe/Amsterdam");

		// LocalTime object with timezone 1
		LocalTime timeLosAngeles = LocalTime.now(zoneLosAngeles);
		System.out.println("timeLosAngeles : " + timeLosAngeles);

		// LocalTime object with timezone 2
		LocalTime timeAmsterdam = LocalTime.now(zoneAmsterdam);
		System.out.println("timeAmsterdam : " + timeAmsterdam);

		// Getting the time differences between these two times in hours
		long diffInHours = ChronoUnit.HOURS.between(timeLosAngeles, timeAmsterdam);
		System.out.println("Time diff in hours : "+diffInHours);
		
		// Getting the time differences between these two times in seconds
		long diffInSeconds = ChronoUnit.SECONDS.between(timeLosAngeles, timeAmsterdam);
		System.out.println("Time diff in seconds : "+diffInSeconds);
	}
}
