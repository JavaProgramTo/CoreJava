package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * 
 * LocalDate.adjustInfo() example in java 8 with different Temporal types.
 * 
 * @author javaprogramto.com
 *
 */
public class LocalDateAdjustIntoExample {

	public static void main(String[] args) {

		// created 3 datetime objects using different temporal objects such as ZonedDateTime, LocalDateTime
		ZonedDateTime date1 = ZonedDateTime.now();
		LocalDateTime date2 = LocalDateTime.now();
		LocalDateTime date3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());

		System.out.println("Before");
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println("date3 : " + date3);

		// adjusting the date1 and date2 values using adjustInto() method.
		date1 = (ZonedDateTime) date3.adjustInto(date1);
		date2 = (LocalDateTime) date3.adjustInto(date2);

		System.out.println("After");
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println("date3 : " + date3);
	}
}
