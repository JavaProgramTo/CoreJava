package com.javaprogramto.java8.dates.conversion.totimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;

public class LocalDateToTimeStampExample {

	public static void main(String[] args) {
		
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Local Date - "+localDate);
		
		Timestamp timestamp = Timestamp.valueOf(localDate.atStartOfDay());
		
		System.out.println("Timestamp from localdate is "+timestamp);

	}
}
