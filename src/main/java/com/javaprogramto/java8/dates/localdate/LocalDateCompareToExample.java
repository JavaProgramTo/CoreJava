package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

/**
 * Java 8 LocalDate.compareTo() method examples
 * 
 * @author javaprograto.com
 *
 */

public class LocalDateCompareToExample {

	public static void main(String[] args) {

		// Creating two LocalDate date objects using now() method
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.now();

		// printing localDate1 and localDate2
		System.out.println("localDate1 : " + localDate1);
		System.out.println("localDate2 : " + localDate2);

		// calling compareTo() method on two local dates
		int compareToResult = localDate1.compareTo(localDate2);

		// LocalDate equals example
		if (compareToResult == 0) {
			System.out.println("localDate1 and localDate2 are same");
		} else if (compareToResult == 1) {
			System.out.println("localDate1 is after localDate2 ");
		} else {
			System.out.println("localDate1 is before localDate2 ");
		}

		// Creating another two LocalDate date objects using of() method with different
		// dates
		LocalDate localDate3 = LocalDate.of(2025, 01, 01);
		LocalDate localDate4 = LocalDate.of(2030, 01, 01);

		// printing localDate3 and localDate4
		System.out.println("\nlocalDate3 : " + localDate3);
		System.out.println("localDate4 : " + localDate4);

		// calling compareTo() method on two local dates
		compareToResult = localDate3.compareTo(localDate4);

		// LocalDate equals example
		if (compareToResult == 0) {
			System.out.println("localDate3 and localDate4 are same");
		} else if (compareToResult == 1) {
			System.out.println("localDate3 is after localDate4 ");
		} else {
			System.out.println("localDate3 is before localDate4 ");
		}
	}
}
