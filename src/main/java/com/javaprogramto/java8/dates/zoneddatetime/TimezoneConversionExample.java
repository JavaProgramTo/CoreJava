package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimezoneConversionExample {

	public static void main(String[] args) {

		// Getting the current timezone.
		LocalDateTime localDateTime = LocalDateTime.now();

		// IST zone id
		ZoneId istZoneId = ZoneId.of("Asia/Kolkata");

		// Creating IST timezone datetime
		ZonedDateTime istTime = ZonedDateTime.of(localDateTime, istZoneId);

		// print ist time
		System.out.println("IST time : " + istTime);

		// creating est time zoneId.
		ZoneId estZoneId = ZoneId.of("America/New_York");
		
		// converting the ist time to est time using withZoneSameInstant() method
		ZonedDateTime estTime = istTime.withZoneSameInstant(estZoneId);
		
		// print est time
		System.out.println("EST time : "+estTime);
	}
}
