package com.javaprogramto.w3schools.programs.string;

import java.util.Locale;

public class StringToLowercase {

    public static void main(String[] args) {

        Locale defaultLocale = Locale.getDefault();
        System.out.println("Default locale : "+defaultLocale);

        String string = "I am Now Using the different locales";

        Locale french = Locale.forLanguageTag("co-FR");

        System.out.println("french loale : "+french);
        String lowercaseStr = string.toLowerCase(french);

        System.out.println("Lowercase converted string in French : "+lowercaseStr);

        Locale chineesLocale = new Locale("zh", "CN");

        String chineeslowerCase = string.toLowerCase(chineesLocale);
        System.out.println("Chinees locale string : "+chineeslowerCase);

    }

}
