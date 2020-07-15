package com.javaprogramto.strings;

public class StringCodepointBeforeExample {

    public static void main(String[] args) {

        String str = "JavaProgramTo.com";

        System.out.println("Input string value : "+str);

        int codepointBefore = str.codePointBefore(2);
        System.out.println("Code point for before index 2 : "+codepointBefore);

        codepointBefore = str.codePointBefore(str.length());
        System.out.println("Code point for before index "+str.length()+": "+codepointBefore);
    }
}
