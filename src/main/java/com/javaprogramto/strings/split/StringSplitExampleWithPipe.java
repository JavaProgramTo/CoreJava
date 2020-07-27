package com.javaprogramto.strings.split;

import java.util.regex.Pattern;

public class StringSplitExampleWithPipe {

    public static void main(String[] args) {
        String countryNames = "Turkey|Turkmenistan|Turks and Caicos Islands (the)|Tuvalu|Uganda|Ukraine|United Arab Emirates (the)|United Kingdom of Great Britain and Northern Ireland (the)|United States Minor Outlying Islands (the)|United States of America (the)|Uruguay|Uzbekistan|Vanuatu|Venezuela (Bolivarian Republic of)";

        String[] pipeBasedSplitArray = countryNames.split("\\|");

        System.out.println("Splitting string with pipe 1");
        for (String value : pipeBasedSplitArray) {
            System.out.println(value);
        }

        String countryCodes = "792|795|796|798|800|804|784|826|581|840|858|860|548|862";

        pipeBasedSplitArray = countryCodes.split(Pattern.quote("|"));

        System.out.println("\nSplitting string with pipe 2");
        for (String value : pipeBasedSplitArray) {
            System.out.println(value);
        }

        print(countryCodes, countryCodes);
    }

    private static void print(String v1, String v2) {

    }
}
