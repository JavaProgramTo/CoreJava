package com.javaprogramto.strings.split;

public class StringSplitExample1 {

    public static void main(String[] args) {
        String str = "java@program@to.com";

        String[] splitArray = str.split("@");

        for(String value : splitArray){
            System.out.println(value);
        }
    }
}
