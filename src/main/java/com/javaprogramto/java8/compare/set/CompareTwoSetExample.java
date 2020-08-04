package com.javaprogramto.java8.compare.set;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoSetExample {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        set1.add("Hello");
        set1.add("Java Developer");
        set1.add("Welcome");
        set1.add("To");
        set1.add("JavaProgramTo.com");


        Set<String> set2 = new HashSet<>();

        set2.add("Hello");
        set2.add("Java Developer");
        set2.add("Welcome");
        set2.add("To");
        set2.add("JavaProgramTo.com");

        boolean isEquals = set1.equals(set2);

        System.out.println("Is set 1 and set 2 equal ? : "+isEquals);

    }
}
