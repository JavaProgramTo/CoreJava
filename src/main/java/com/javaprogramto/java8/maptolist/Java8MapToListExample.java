package com.javaprogramto.java8.maptolist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MapToListExample {

    public static void main(String[] args) {

        Map<Integer, String> fruites = new HashMap<>();

        fruites.put(15, "apple");
        fruites.put(20, "mango");
        fruites.put(30, "gauva");
        fruites.put(35, "payaya");
        fruites.put(40, "jack fruit");

        //java 8 - convert all keys to map
        List<Integer> keysList = fruites.keySet().stream().collect(Collectors.toList());

        System.out.println("Map keys List :");

        for (Integer integer : keysList) {
            System.out.println(integer);
        }

        // java 8 - convert all keys to map
        List<String> valuesList = fruites.values().stream().collect(Collectors.toList());

        System.out.println("Map values list :");

        for (String s : valuesList) {
            System.out.println(s);
        }

        System.out.println("removing odd even fruit id's as list : ");

        List<Integer> evenList = fruites.keySet().stream().filter(id -> id % 2 == 0).collect(Collectors.toList());
        evenList.forEach(id -> System.out.println(id));
    }
}
