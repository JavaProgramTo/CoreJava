package com.javaprogramto.strings;

public class StringStartsWithIndexExample {

    public static void main(String[] args) {

        String s1 = "hello world";

        boolean isStringStartsWithHello = s1.startsWith("hello", 5);

        System.out.println("String starts with hello or not : "+isStringStartsWithHello);
        System.out.println("Phone number starts with +91 "+"+91 12345678".startsWith("+678", 2));

        System.out.println("javaprogramto.com starts with java : "+"javaprogramto.com".startsWith("program",4));

        System.out.println("starts with index : "+"phone: +91 123456789".startsWith("+91", 7));
    }
}
