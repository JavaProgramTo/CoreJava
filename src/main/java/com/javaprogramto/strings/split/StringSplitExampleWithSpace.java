package com.javaprogramto.strings.split;

public class StringSplitExampleWithSpace {

    public static void main(String[] args) {
        String coutries = "TR TM TC TV UG UA AE GB UM US UY UZ VU VE";

        String[] spaceBasedSplitArray = coutries.split(" ");

        System.out.println("Splitting string with space 1");
        for (String value : spaceBasedSplitArray) {
            System.out.println(value);
        }

        coutries = "TUR TKM TCA TUV UGA UKR ARE GBR UMI USA URY UZB VUT VEN";

        spaceBasedSplitArray = coutries.split("\\s+");

        System.out.println("\nSplitting string with space 1");
        for (String value : spaceBasedSplitArray) {
            System.out.println(value);
        }
    }
}
