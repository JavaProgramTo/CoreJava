package com.javaprogramto.java8.dates.conversion;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class CalenderToLocalDateExample {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        Date input = cal.getTime();
        LocalDate la = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.println("Calender to LocalDate : "+la);
    }
}
