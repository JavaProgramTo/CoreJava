package com.javaprogramto.java8.maptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8EntrySetMapToListExample {

    public static void main(String[] args) {

        Map<Integer, String> fruites = new HashMap<>();

        fruites.put(15, "apple");
        fruites.put(20, "mango");
        fruites.put(30, "gauva");
        fruites.put(35, "payaya");
        fruites.put(40, "jack fruit");

        List<String> valuesList = new ArrayList<>();

        List<Integer> keyList = fruites.entrySet().stream().filter(e -> e.getKey() % 15 == 0).peek(
                e -> valuesList.add(e.getValue())
        ).map(e-> e.getKey()).collect(Collectors.toList());

        System.out.println("Keys list : "+keyList);
        System.out.println("Values list : "+valuesList);
    }
}
