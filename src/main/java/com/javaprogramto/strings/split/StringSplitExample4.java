package com.javaprogramto.strings.split;

public class StringSplitExample4 {

    public static void main(String[] args) {
        String phoneNo = "123-567-9080";

        String[] spaceBasedSplitArray = phoneNo.split("-");

        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}
