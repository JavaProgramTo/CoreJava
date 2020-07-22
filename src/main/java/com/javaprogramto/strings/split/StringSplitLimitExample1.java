package com.javaprogramto.strings.split;

public class StringSplitLimitExample1 {

    public static void main(String[] args) {
        String stringWithEndingWithDelimiter = "Java:Program:to:.com:::";

        String[] arrayWithoutLimitValue = stringWithEndingWithDelimiter.split(":");

        System.out.println("returned array size without limit parameter : "+arrayWithoutLimitValue.length);
        for(String value : arrayWithoutLimitValue){
            System.out.println(value);
        }

        String[] arrayWithLimitValue = stringWithEndingWithDelimiter.split(":", 7);

        System.out.println("returned array size with limit parameter : "+arrayWithLimitValue.length);
        for(String value : arrayWithLimitValue){
            System.out.println(value);
        }
        System.out.println("Done");
    }
}
