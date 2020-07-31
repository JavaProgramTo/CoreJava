package com.javaprogramto.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class NormalForEachListExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        for (String s : list) {
            System.out.println(s);
        }

    }

}

