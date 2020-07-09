package com.javaprogramto.readonly;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;


public class ReadOnlyCollectionunmodifiableSetExample {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>();

        set.add("one");
        set.add("two");
        set.add("three");

        set.remove("two");


        System.out.println("Set values : " + set);


        Set<String> readOnlySet = Collections.unmodifiableSet(set);


        System.out.println("Read only collection : " + readOnlySet);


        if (readOnlySet.getClass().getName().contains("Unmodifiable")) {

            System.out.println("readOnlySet is a Read only collections");

        } else {

            System.out.println("readOnlySet not Read only collections");
        }

    }
}