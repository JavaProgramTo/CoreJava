package com.javaprogramto.java8.arraytolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListCollectionsAddAllExample {
    public static void main(String[] args) {

// Example using Collections.addAll(outputList, array);

        String[] intArray = {"java", "program", "to.com", "is a ", "java portal"};
        System.out.println("Array : " + Arrays.toString(intArray));

        List<String> list = convertArrayToList(intArray);

        System.out.println("Converted ArrayList : " + list);

    }

    private static <T> List<T> convertArrayToList(T[] array) {

        List<T> outputList = new ArrayList<T>();

        Collections.addAll(outputList, array);

        return outputList;
    }

}
