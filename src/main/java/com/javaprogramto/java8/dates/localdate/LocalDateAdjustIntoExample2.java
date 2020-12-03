package com.javaprogramto.java8.dates.localdate;

import java.time.LocalDate;

/**
 * 
 * LocalDate.adjustInfo() example in java 8
 * 
 * @author javaprogramto.com
 *
 */
public class LocalDateAdjustIntoExample {

	public static void main(String[] args) {

		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2020, 01, 02);

		System.out.println("Before");
		System.out.println("LocalDate 1 : " + localDate1);
		System.out.println("LocalDate 2 : " + localDate2);

		localDate1 = (LocalDate) localDate2.adjustInto(localDate1);

		System.out.println("After");
		System.out.println("LocalDate 1 : " + localDate1);
		System.out.println("LocalDate 2 : " + localDate2);
	}
}
