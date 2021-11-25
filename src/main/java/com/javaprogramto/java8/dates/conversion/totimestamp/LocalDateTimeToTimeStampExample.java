package com.javaprogramto.java8.dates.conversion.totimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LocalDateTimeToTimeStampExample {

	public static void main(String[] args) {
		
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("Local Date Time - "+localDateTime);
		
		Timestamp timestamp = Timestamp.valueOf(localDateTime);
		
		System.out.println("Timestamp from localdatetime is "+timestamp);

	}
}
