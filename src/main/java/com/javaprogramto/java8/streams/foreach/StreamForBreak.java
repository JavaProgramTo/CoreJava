package com.javaprogramto.java8.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class StreamForBreak {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three", "seven", "nine", "ten");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 3) {

                break;
            }
            System.out.println(list.get(i));

        }

    }
}
