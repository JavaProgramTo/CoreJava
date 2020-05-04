package com.javaprogramto.w3schools.programs.ascii;

public class StringToAscii {

    public static void main(String[] args) {
        String str = "hello javaprogramto.com";

        char[] array = str.toCharArray();

        System.out.println("ASCII codes for string  "+str+" are : ");
        for (char c : array) {

            System.out.println((int)c);

        }
    }
}
