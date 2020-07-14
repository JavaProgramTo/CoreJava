package com.javaprogramto.java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8MapExample {

    public static void main(String[] args) {

        System.out.println("Output with simple list");
        List<String> vowels = Arrays.asList("A","E","I","O","U");

        vowels.stream().map( vowel -> vowel.toLowerCase()).forEach(value -> System.out.println(value));

        List<String> haiList = new ArrayList<>();

        haiList.add("hello");
        haiList.add("hai");
        haiList.add("hehe");
        haiList.add("hi");

        System.out.println("Output with nested List of List<String>");
        List<String> welcomeList = new ArrayList<>();

        welcomeList.add("You got it");
        welcomeList.add("Don't mention it");
        welcomeList.add("No worries.");
        welcomeList.add("Not a problem");

        List<List<String>> nestedList = Arrays.asList(haiList, welcomeList);

        nestedList.stream().map( list -> {return list.stream().map(value -> value.toUpperCase());}).forEach(value -> System.out.println(value));



    }
}
