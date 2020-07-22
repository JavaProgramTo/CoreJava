package com.javaprogramto.strings.split;

public class StringSplitExample6 {

    public static void main(String[] args) {
        String delimitetAtEndString = "1235--------89";

        String[] spaceBasedSplitArray = delimitetAtEndString.split("-");

        System.out.println("returned array size : "+spaceBasedSplitArray.length);
        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}
