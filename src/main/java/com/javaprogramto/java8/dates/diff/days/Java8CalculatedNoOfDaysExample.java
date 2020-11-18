package com.javaprogramto.java8.dates.diff.days;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Java8CalculatedNoOfDaysExample {

	public static void main(String[] args) {
		// java 8 way - 1

		// creating LocalDate object 1 using LocalDate.of() method.
		LocalDate localDate1 = LocalDate.of(2021, Month.JANUARY, 1);

		// creating the date 2 with sample input date.
		LocalDate localDate2 = LocalDate.of(2021, Month.JANUARY, 31);

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
