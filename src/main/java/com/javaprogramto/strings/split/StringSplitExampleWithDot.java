package com.javaprogramto.strings.split;

public class StringSplitExampleWithDot {

    public static void main(String[] args) {
        String multipleDelimiters = "hello.world.learn.java";

        String[] spaceBasedSplitArray = multipleDelimiters.split("[.]");

        System.out.println("Splitting string with dot using regex 1");
        for (String value : spaceBasedSplitArray) {
            System.out.println(value);
        }

        multipleDelimiters = "welcome.to.the.javaprogramto.com";

        spaceBasedSplitArray = multipleDelimiters.split("[.]");

        System.out.println("\nSplitting string with dot using regex 2 \n");
        for (String value : spaceBasedSplitArray) {
            System.out.println(value);
        }


    }
}
