package com.javaprogramto.java8.dates.diff.days;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Java8CalculatedNoOfDaysDatesInStringExample {

	public static void main(String[] args) throws ParseException {

		// Create two Dates in String variable
		String dateStr1 = "2021-05-01";
		String dateStr2 = "2021-05-16";

		// parsing the string date into LocalDate objects.
		LocalDate localDate1 = LocalDate.parse(dateStr1);
		LocalDate localDate2 = LocalDate.parse(dateStr2);

		// java 8 way - 1
		// Fetching the diff using between() method
		long noOfDaysDifference = ChronoUnit.DAYS.between(localDate1, localDate2);

		// print diff in days
		System.out.println("Java 8 way 1 between() - No of days diff is : " + noOfDaysDifference);

		// java 8 way - 2
		// using until() method
		noOfDaysDifference = localDate1.until(localDate2, ChronoUnit.DAYS);

		System.out.println("Java 8 way 2 untill() - No of days diff is : " + noOfDaysDifference);

	}
}
