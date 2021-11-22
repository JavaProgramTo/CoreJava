package com.javaprogramto.java8.dates.timestamp;

import java.sql.Timestamp;
import java.time.Instant;

public class CurrentTimestampExample4 {

	public static void main(String[] args) {

		long timeInMillis = System.currentTimeMillis();

		Timestamp timestamp = new Timestamp(timeInMillis);

		Instant instant = timestamp.toInstant();

		System.out.println("timestamp now : " + instant);
	}
}
