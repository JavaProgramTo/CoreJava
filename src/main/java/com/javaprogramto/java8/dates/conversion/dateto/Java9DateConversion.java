package com.javaprogramto.java8.dates.conversion.dateto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 * Java 9 examples to convert to util.date to LocalDate and LocalDateTime.
 * 
 * @author javaprogramto.com
 *
 */
public class Java9DateConversion {

	public static void main(String[] args) {
		Date currentDate = new Date();

		// Convert Date to LocalDate
		LocalDate localDate = LocalDate.ofInstant(currentDate.toInstant(), ZoneId.systemDefault());

		// Convert Date to LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.ofInstant(currentDate.toInstant(), ZoneId.systemDefault());

		System.out.println("Localdate : " + localDate);
		System.out.println("LocalDateTime : " + localDateTime);
	}
}
