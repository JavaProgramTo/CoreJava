package com.javaprogramto.java8.maptolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValuesToListExample {

    public static void main(String[] args) {

        Map<Integer,String> idNames = new HashMap<>();

        idNames.put(100, "modi");
        idNames.put(101, "trump");
        idNames.put(102, "putin");

        //converting all values from map to list.
        List<String> ids =new ArrayList<>(idNames.values());

        ids.forEach(id -> System.out.println(id));
    }
}
