package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * Example to convert from LocalDate to LocalDateTime using atStartOfDay() method.
 * 
 * @author javaprogramto.com
 *
 */
public class LocalDateAtStartOfDayExample {

	public static void main(String[] args) {
		
		// creating localdate object
		LocalDate localDate = LocalDate.now();
		
		// Getting the LocalDateTime from LocalDate with atStartOfDay()
		LocalDateTime localDateTime = localDate.atStartOfDay();
		
		// printing the dates
		System.out.println("LocalDate : "+localDate);
		System.out.println("LocalDateTime : "+localDateTime);
	}
}
