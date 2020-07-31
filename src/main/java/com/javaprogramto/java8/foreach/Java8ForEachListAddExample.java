package com.javaprogramto.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEachListAddExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");

        list.forEach((s) -> list.add(s + 1));

        System.out.println("Final list : " + list);

    }

}

