package com.javaprogramto.strings;

public class StringCodepointBeforeException {

    public static void main(String[] args) {

        String str = "hello world";

        System.out.println("Input string value : "+str);

        int codepointBefore = str.codePointBefore(-2);
        System.out.println("Code point for before index 0 : "+codepointBefore);
    }
}
