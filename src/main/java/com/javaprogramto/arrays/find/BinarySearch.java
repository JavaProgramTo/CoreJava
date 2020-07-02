package com.javaprogramto.arrays.find;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {6, 7, 10, 15, 70, 90};

        int found = -1;

        int valueToBeFound = 15;

        found = Arrays.binarySearch(array, valueToBeFound);

        if(found >= 0){
            System.out.println("value 15 is present");
        } else {
            System.out.println("value 15 is not present");
        }

        String[] names = {"ram", "sita", "zuga"};

        found = Arrays.binarySearch(names, "yama");


        if(found >= 0){
            System.out.println("String yama is present");
        } else {
            System.out.println("String yama is not present");
        }

    }
}
