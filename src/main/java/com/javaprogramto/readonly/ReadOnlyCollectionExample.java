package com.javaprogramto.readonly;

import java.util.ArrayList;

import java.util.Collection;

import java.util.Collections;

import java.util.List;


public class ReadOnlyCollectionExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("one");

        list.add("two");

        list.add("three");


        list.remove("two");


        System.out.println("List values : " + list);


        Collection<String> readOnlyList = Collections.unmodifiableCollection(list);


        System.out.println("Read only collection : " + readOnlyList);

    }
}