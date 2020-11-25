package com.javaprogramto.java8.dates.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeToStringExample {

	public static void main(String[] args) {
		// Creating the date time object using of() method
		LocalDateTime datetime = LocalDateTime.of(2020, 10, 30, 23, 50, 59);
		System.out.println("Date time : " + datetime);

		//
		int year = datetime.get(ChronoField.YEAR);
		int month = datetime.get(ChronoField.MONTH_OF_YEAR);
		int day = datetime.get(ChronoField.DAY_OF_MONTH);
		int hour = datetime.get(ChronoField.HOUR_OF_DAY);
		int minute = datetime.get(ChronoField.MINUTE_OF_HOUR);
		int second = datetime.get(ChronoField.SECOND_OF_MINUTE);
		
		
		System.out.println("year : "+year);
		System.out.println("month : "+month);
		System.out.println("day : "+day);
		System.out.println("hour : "+hour);
		System.out.println("minute : "+minute);
		System.out.println("second : "+second);
	}
}
