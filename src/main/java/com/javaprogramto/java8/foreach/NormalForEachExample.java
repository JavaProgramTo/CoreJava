package com.javaprogramto.java8.foreach;


import java.util.ArrayList;
import java.util.List;

public class NormalForEachExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            list.add("Item " + i + 1);
        }

        System.out.println("Normal for loop program : " + list);

    }

}

