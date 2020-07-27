package com.javaprogramto.strings;

public class StringStartsWithExample {

    public static void main(String[] args) {

        String s1 = "hello world";

        boolean isStringStartsWithHello = s1.startsWith("hello");

        System.out.println("String starts with hello or not : "+isStringStartsWithHello);
        System.out.println("Phone number starts with +91 "+"+91 12345678".startsWith("+678"));

        System.out.println("javaprogramto.com starts with java : "+"javaprogramto.com".startsWith("java"));
    }
}
