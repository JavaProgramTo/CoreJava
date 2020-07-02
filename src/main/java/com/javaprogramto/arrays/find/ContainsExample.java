package com.javaprogramto.arrays.find;

import java.util.Arrays;
import java.util.List;

public class ContainsExample {

    public static void main(String[] args) {

        Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> intList = Arrays.asList(values);

        if (intList.contains(7)) {
            System.out.println("7 is present in the values array");
        } else {
            System.out.println("7 is not present in the values array");
        }

        String[] fruites = {"banana", "jack fruit", "orange", "mango", "apple"};

        List<String> fruitesList = Arrays.asList(fruites);

        if (fruitesList.contains("apple")) {
            System.out.println("apple is present in the fruitesList array");
        } else {
            System.out.println("apple is not present in the fruitesList array");
        }
    }
}
