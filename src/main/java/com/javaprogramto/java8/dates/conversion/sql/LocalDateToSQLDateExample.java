package com.javaprogramto.java8.dates.conversion.sql;

import java.sql.Date;
import java.time.LocalDate;

public class LocalDateToSQLDateExample {

	public static void main(String[] args) {

		// creating current local date usig now() method and which will return the
		// curren date.
		LocalDate currentDate = LocalDate.now();

		// LocalDate to SQL date using valueOf() method.
		Date sqlDate = Date.valueOf(currentDate);

		// printing
		System.out.println("With current local date");
		System.out.println("LocalDate : " + currentDate);
		System.out.println("SQL Date : " + sqlDate);
		
		// working with different dates.
		LocalDate pastDate = LocalDate.of(1990, 01, 01);
		LocalDate futureDate = LocalDate.of(2050, 01, 01);
		
		// converting Local dates to sql dates
		Date pastSqlDate = Date.valueOf(pastDate);
		Date futureSqlDate = Date.valueOf(futureDate);
		
		System.out.println("\nWith different local dates");
		System.out.println("Past LocalDate : " + pastDate);
		System.out.println("Past SQL Date : " + pastSqlDate);
		
		System.out.println("Future LocalDate : " + futureDate);
		System.out.println("Future SQL Date : " + futureSqlDate);
		
		LocalDate nullLocalDate = null;
		Date nullDate = Date.valueOf(nullLocalDate);
		

	}

}
