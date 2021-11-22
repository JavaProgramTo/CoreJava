package com.javaprogramto.java8.dates.timestamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTimestampExample3 {

	public static void main(String[] args) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateNow = new Date();

		String timestampNow = simpleDateFormat.format(dateNow);

		System.out.println("timestamp now : " + timestampNow);
	}

}
