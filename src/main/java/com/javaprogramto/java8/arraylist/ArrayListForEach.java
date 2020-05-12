package com.javaprogramto.java8.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListForEach {

    public static void main(String[] args) {

        List<String> freshVegs = new ArrayList<>();

        freshVegs.add("tomato");
        freshVegs.add("potato");
        freshVegs.add("Beans");

        freshVegs.forEach(fruitName -> {
            System.out.println(fruitName);
            // uncomment to throw ConcurrentModificationException
            freshVegs.add("Bitter Guard");
        });

        List<String> names = new ArrayList<>();
        names.add("rama");
        names.add("sita");

        Consumer<String> upperCase = string -> System.out.println(string.toUpperCase());

        names.forEach(upperCase);

        // NullPointerException
        freshVegs.forEach(null);
        names.forEach(null);
    }
}
