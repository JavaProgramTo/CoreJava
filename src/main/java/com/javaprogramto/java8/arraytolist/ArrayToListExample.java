package com.javaprogramto.java8.arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

    public static void main(String[] args) {

        String[] intArray = {"10", "20", "30", "40", "50"};
        System.out.println("Array : " + Arrays.toString(intArray));

        List<String> list = convertArrayToList(intArray);

        System.out.println("COnverted ArrayList : " + list);

    }

    private static <T> List<T> convertArrayToList(T[] array) {

        List<T> outputList = new ArrayList<T>();
        for (T t : array) {

            outputList.add(t);

        }

        return outputList;
    }

}