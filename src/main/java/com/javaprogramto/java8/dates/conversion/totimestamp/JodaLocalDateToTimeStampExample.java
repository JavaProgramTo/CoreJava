package com.javaprogramto.java8.dates.conversion.totimestamp;

import java.sql.Timestamp;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

public class JodaLocalDateToTimeStampExample {

	public static void main(String[] args) {

		// joda localdate to timestamp
		LocalDate localDate = LocalDate.now();

		System.out.println("Joda Local Date - " + localDate);

		Timestamp timestamp = new Timestamp(localDate.toDateTimeAtStartOfDay().getMillis());

		System.out.println("Timestamp from joda localdate is " + timestamp);

		// joda localdatetime to timestamp
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println("Joda Local Date Time - " + localDateTime);

		Timestamp timestamp2 = new Timestamp(localDateTime.toDateTime().getMillis());

		System.out.println("Timestamp from joda localdate is " + timestamp2);

	}
}
