package com.javaprogramto.java8.dates.timestamp;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimestampExample6 {

	public static void main(String[] args) {

		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime localDateTime = ZonedDateTime.now(zoneId);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss SSS");

		String timestamp = formatter.format(localDateTime);

		System.out.println("timestamp now : " + timestamp);
	}
}
