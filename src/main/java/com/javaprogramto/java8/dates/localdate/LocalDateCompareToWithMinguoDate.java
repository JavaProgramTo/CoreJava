package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;

/**
 * Java 8 LocalDate.compareTo() method examples with MinguoDate
 * 
 * @author javaprograto.com
 *
 */

public class LocalDateCompareToWithMinguoDate {

	public static void main(String[] args) {

		// Creating LocalDate date objects using now() method
		LocalDate localDate = LocalDate.now();
		
		// Creating MinguoDate date objects using now() method
		MinguoDate minguoDate = MinguoDate.now();

		// printing localDate and minguoDate
		System.out.println("localDate : " + localDate);
		System.out.println("minguoDate : " + minguoDate);

		// calling compareTo() method on two local dates
		int compareToResult = localDate.compareTo(minguoDate);

		// Printing output of compareTo() method
		System.out.println("compareToResult : "+compareToResult);
		
		// LocalDate equals example
		if (compareToResult == 0) {
			System.out.println("localDate and minguoDate are same");
		} else if (compareToResult > 0) {
			System.out.println("localDate is after minguoDate ");
		} else {
			System.out.println("localDate is before minguoDate ");
		}
	}
}
