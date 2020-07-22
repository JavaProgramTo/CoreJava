package com.javaprogramto.strings.split;

public class StringSplitExample5 {

    public static void main(String[] args) {
        String delimitetAtEndString = "1235-567-9080-1234-----";

        String[] spaceBasedSplitArray = delimitetAtEndString.split("-");

        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}
