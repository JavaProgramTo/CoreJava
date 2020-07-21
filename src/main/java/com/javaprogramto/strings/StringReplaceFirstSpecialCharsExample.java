package com.javaprogramto.strings;

public class StringReplaceFirstSpecialCharsExample {

    public static void main(String[] args) {

        String str = "How many $$ you have ? Do you have valid $$ amount?";

        String replacedString = str.replaceFirst("\\$\\$", "Dollars");

        System.out.println("replaceFirst() special chars output : " + replacedString);

    }
}
