package com.javaprogramto.java8.dates.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimePlusExample {

	public static void main(String[] args) {
		// Creating the date time object using of() method
		LocalDateTime datetime = LocalDateTime.of(2020, 10, 30, 23, 50, 55);
		System.out.println("Date time : " + datetime);

		// using plus(long, TemporalUnit)
		LocalDateTime yearModifed = datetime.plus(2, ChronoUnit.YEARS);
		LocalDateTime monthsModifed = datetime.plus(2, ChronoUnit.MONTHS);

		// using plusXXX() methods
		LocalDateTime daysModifed = datetime.plusDays(2);
		LocalDateTime hoursModifed = datetime.plusHours(2);
		LocalDateTime minssModifed = datetime.plusMinutes(2);
		LocalDateTime secsModifed = datetime.plusSeconds(2);
		LocalDateTime nanosModifed = datetime.plusNanos(2);

		System.out.println("years added : " + yearModifed);
		System.out.println("months added: " + monthsModifed);
		System.out.println("days added : " + daysModifed);
		System.out.println("hours added : " + hoursModifed);
		System.out.println("minutes added : " + minssModifed);
		System.out.println("seconds added : " + secsModifed);
		System.out.println("nonos added : " + nanosModifed);
	}
}
