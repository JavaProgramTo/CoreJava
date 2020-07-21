package com.javaprogramto.strings;

public class StringReplaceFirstExample {

    public static void main(String[] args) {

        String str = "Hello BOSS, Welcome to JavaProgramTo.com SUPER-BOSS";

        String replacedString = str.replaceFirst("BOSS", "Boss");

        System.out.println("Output of replaceFirst() method : " + replacedString);

    }
}
