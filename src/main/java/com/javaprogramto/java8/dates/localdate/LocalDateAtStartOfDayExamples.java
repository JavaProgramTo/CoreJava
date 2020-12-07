package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Example for public LocalDateTime atStartOfDay() method in LocalDate class in
 * java 8.
 * 
 * @author JavaProgramTo.com
 *
 */

public class LocalDateAtStartOfDayExamples {

	public static void main(String[] args) {
		// Example 1

		// creating LocalDate object
		LocalDate localDate1 = LocalDate.now();

		// converting LocalDate object to LocalDateTime object
		LocalDateTime localDateTime1 = localDate1.atStartOfDay();

		// printing the LocalDate, LocalDateTime objects
		System.out.println("localDate1 : " + localDate1);
		System.out.println("localDateTime1 : " + localDateTime1);

		// Example 2

		// creating LocalDate object
		LocalDate localDate2 = LocalDate.of(2023, 02, 02);

		// converting LocalDate object to LocalDateTime object
		LocalDateTime localDateTime2 = localDate2.atStartOfDay();

		// printing the LocalDate, LocalDateTime objects
		System.out.println("localDate2 : " + localDate2);
		System.out.println("localDateTime2 : " + localDateTime2);
	}
}
