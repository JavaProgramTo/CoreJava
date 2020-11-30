package com.javaprogramto.java8.dates.zoneddatetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GetTimezoneExample {

	public static void main(String[] args) {
		// Create object using of() method
		ZonedDateTime zonedtime = ZonedDateTime.of(2023, 01, 01, 01, 01, 30, 1000, ZoneId.of("America/Chicago"));

		// Getting timezone in string
		ZoneId currentZoneId = zonedtime.getZone();

		// print the value onto console
		System.out.println("Get timezone : " + currentZoneId.getId());

		// printing the offset value
		System.out.println("Timezone offset value : " + currentZoneId.getRules());
	}
}
