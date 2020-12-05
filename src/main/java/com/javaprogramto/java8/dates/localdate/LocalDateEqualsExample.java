package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

/**
 * Java 8 LocalDate.equals() method examples
 * 
 * @author javaprograto.com
 *
 */

public class LocalDateEqualsExample {

	public static void main(String[] args) {

		// Creating two LocalDate date objects using now() method
		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.now();

		// printing localDate1 and localDate2
		System.out.println("localDate1 : " + localDate1);
		System.out.println("localDate2 : " + localDate2);

		// LocalDate equals example
		if (localDate1.equals(localDate2)) {
			System.out.println("localDate1 and localDate2 are same");
		} else {
			System.out.println("localDate1 and localDate2 are not same");
		}

		// Creating another two LocalDate date objects using of() method with different dates
		LocalDate localDate3 = LocalDate.of(2025, 01, 01);
		LocalDate localDate4 = LocalDate.of(2030, 01, 01);

		// printing localDate3 and localDate4
		System.out.println("\nlocalDate3 : " + localDate3);
		System.out.println("localDate4 : " + localDate4);

		// LocalDate equals example
		if (localDate3.equals(localDate4)) {
			System.out.println("localDate3 and localDate24 are same");
		} else {
			System.out.println("localDate3 and localDate4 are not same");
		}
	}
}
