package com.javaprogramto.java8.dates.localdatetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMinusExample {

	public static void main(String[] args) {
		// Creating the date time object using of() method
		LocalDateTime datetime = LocalDateTime.of(2020, 10, 30, 23, 50, 55);
		System.out.println("Date time : " + datetime);

		// using minus(long, TemporalUnit)
		LocalDateTime yearModifed = datetime.minus(2, ChronoUnit.YEARS);
		LocalDateTime monthsModifed = datetime.minus(2, ChronoUnit.MONTHS);

		// using minusXXX() methods
		LocalDateTime daysModifed = datetime.minusDays(2);
		LocalDateTime hoursModifed = datetime.minusHours(2);
		LocalDateTime minssModifed = datetime.minusMinutes(2);
		LocalDateTime secsModifed = datetime.minusSeconds(2);
		LocalDateTime nanosModifed = datetime.minusNanos(2);

		System.out.println("years substracted : " + yearModifed);
		System.out.println("months substracted: " + monthsModifed);
		System.out.println("days substracted : " + daysModifed);
		System.out.println("hours substracted : " + hoursModifed);
		System.out.println("minutes substracted : " + minssModifed);
		System.out.println("seconds substracted : " + secsModifed);
		System.out.println("nonos substracted : " + nanosModifed);
	}
}
