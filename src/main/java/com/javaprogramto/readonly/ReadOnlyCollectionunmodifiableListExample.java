package com.javaprogramto.readonly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReadOnlyCollectionunmodifiableListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("one");

        list.add("two");

        list.add("three");

        list.remove("two");

        System.out.println("List values : " + list);


        List<String> readOnlyList = Collections.unmodifiableList(list);


        System.out.println("Read only collection : " + readOnlyList);


        if (readOnlyList.getClass().getName().contains("Unmodifiable")) {

            System.out.println("readOnlyList is a Read only collections");

        } else {

            System.out.println("This is not Read only collections");

        }

    }
}