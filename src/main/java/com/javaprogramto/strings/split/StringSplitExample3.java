package com.javaprogramto.strings.split;

public class StringSplitExample3 {

    public static void main(String[] args) {
        String str = "java programs for freshers";

        String[] spaceBasedSplitArray = str.split(" ");

        for(String value : spaceBasedSplitArray){
            System.out.println(value);
        }
    }
}
