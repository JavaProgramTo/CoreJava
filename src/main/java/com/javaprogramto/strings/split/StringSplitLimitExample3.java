package com.javaprogramto.strings.split;

public class StringSplitLimitExample3 {

    public static void main(String[] args) {
        String stringWithEndingWithDelimiter = "Java:Program:::to:.com:::";

        String[] arrayWithoutLimitValue = stringWithEndingWithDelimiter.split(":");

        String[] arrayWithLimitValue = stringWithEndingWithDelimiter.split(":", -2);

        System.out.println("returned array size with limit parameter : "+arrayWithLimitValue.length);
        for(String value : arrayWithLimitValue){
            System.out.println(value);
        }
        System.out.println("Done");
    }
}
