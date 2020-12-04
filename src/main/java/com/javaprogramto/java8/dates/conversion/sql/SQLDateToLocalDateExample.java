package com.javaprogramto.java8.dates.conversion.sql;

import java.sql.Date;
import java.time.LocalDate;

public class SQLDateToLocalDateExample {

	public static void main(String[] args) {

		// Creating sql date
		Date sqlDate = Date.valueOf("2020-12-31");
		
		// converting sql date to localdate using toLocalDate() method.
		LocalDate localDate1 = sqlDate.toLocalDate();

		// printing the local date.
		System.out.println("Local Date 1 : "+localDate1);
	}
}
