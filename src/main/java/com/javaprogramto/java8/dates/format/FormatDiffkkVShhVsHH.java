package com.javaprogramto.java8.dates.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDiffkkVShhVsHH {

	public static void main(String[] args) {

		// Creating the Date object
		Date date = new Date(2020, 12, 1, 00, 30, 30);
		System.out.println("Example date 1 : " + date);

		// Example with kk
		SimpleDateFormat formatkk = new SimpleDateFormat("kk:mm:ss");
		String kkValue = formatkk.format(date);
		System.out.println("Date Time format with kk : " + kkValue);

		// Example with HH
		SimpleDateFormat formatHH = new SimpleDateFormat("HH:mm:ss");
		String HHValue = formatHH.format(date);
		System.out.println("Date Time format with HH : " + HHValue);

		// Example with hh
		SimpleDateFormat formathh = new SimpleDateFormat("hh:mm:ss a");
		String hhValue = formathh.format(date);
		System.out.println("Date Time format with hh : " + hhValue);

	}

}
