package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateToLocalDateTimeAtTimeExample {

	public static void main(String[] args) {
		// localdate
		LocalDate localDate = LocalDate.now();

		int hour = 10;
		int minute = 20;
		int second = 30;
		
		// setting time details and converting LocalDate to LocalDateTime. Remaining parts are set to 0.
		LocalDateTime dateAndTime1 = localDate.atTime(hour, minute);

		// this produces the output as same as atStartOfDay()
		LocalDateTime dateAndTime2 = localDate.atTime(0, 0);

		// with custom time parts
		LocalDateTime dateAndTime3 = localDate.atTime(hour, minute, second);
		
		// From LocalTime
		LocalDateTime dateAndTime4 = localDate.atTime(LocalTime.now());

		// printing the LocalDateTime values
		System.out.println("LocalDate : " + localDate);
		System.out.println("LocalDateTime with hour, minute : " + dateAndTime1);
		System.out.println("LocalDateTime with hour minute as 00 : " + dateAndTime2);
		System.out.println("LocalDateTime with hour, minute, second : " + dateAndTime3);
		System.out.println("LocalDateTime 4 with LocalTime inlcuding nano seconds : " + dateAndTime4);

	}

}
