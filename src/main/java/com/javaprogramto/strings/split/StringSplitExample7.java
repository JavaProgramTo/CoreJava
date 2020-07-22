package com.javaprogramto.strings.split;

public class StringSplitExample7 {

    public static void main(String[] args) {
        String multipleDelimiters = "hello,welcome to;java$program#to.com";

        String[] spaceBasedSplitArray = multipleDelimiters.split("[, ;$#]");

        System.out.println("returned array size : "+spaceBasedSplitArray.length);
        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}
