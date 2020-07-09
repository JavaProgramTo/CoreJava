package com.javaprogramto.readonly;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ReadOnlyCollectionunmodifiableMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "one");
        map.put(200, "two");
        map.put(300, "three");

        map.remove(100);

        System.out.println("Set map : " + map);


        Map<Integer, String> readOnlyMap = Collections.unmodifiableMap(map);


        System.out.println("Read only map : " + readOnlyMap);


        if (readOnlyMap.getClass().getName().contains("Unmodifiable")) {

            System.out.println("readOnlyMap is a Read only collections");

        } else {

            System.out.println("readOnlyMap not Read only collections");

        }
    }
}