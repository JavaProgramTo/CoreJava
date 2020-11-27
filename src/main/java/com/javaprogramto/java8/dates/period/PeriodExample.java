package com.javaprogramto.java8.dates.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {

		// Creating two dates
		LocalDate startDate = LocalDate.of(2020, 11, 01);
		LocalDate endDate = LocalDate.of(2021, 12, 31);
		
		// printing the start and end dates
		System.out.println("Start Date : "+startDate);
		System.out.println("End Date : "+endDate);

		// getting the differences between startDate and endDate
		Period periodDiff = Period.between(startDate, endDate);
		System.out.println("Period values - year : " + periodDiff.getYears() + ", Months : " + periodDiff.getMonths()
				+ ", Days : " + periodDiff.getDays());

		// checking the diff is negative
		boolean isNegative = periodDiff.isNegative();
		
		if(isNegative) {
			System.out.println("endDate is greater than startDate");
		} else {
			System.out.println("startDate is greater than endDate");
		}
		
		// Different ways to get Period objects
		Period period1 = Period.of(2,10, 30);
		Period periodDays = Period.ofDays(2);
		Period periodWeeks = Period.ofWeeks(10);

		System.out.println("period1 years : "+period1.getYears());
		System.out.println("periodDays days : "+periodDays.getDays());
		System.out.println("periodDays months : "+periodDays.getMonths());
		System.out.println("periodWeeks weeks : "+periodWeeks);
		System.out.println("periodWeeks days : "+periodWeeks.getDays());
		
		// Creating Period object from String
		Period periodParse1 = Period.parse("P2Y2M2D");
		System.out.println("Perod days : "+periodParse1.getDays());
		
		Period periodParse2 = Period.parse("P3M4D");
		System.out.println("Perod months : "+periodParse2.getMonths());
	}
}
