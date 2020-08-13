package com.javaprogramto.java8.arraylist.toarray;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {

    public static void main(String[] args) {

        // Created a List with type String
        List<String> listOfStrings = new ArrayList<>();

        // Added 5 string values to ArrayList
        listOfStrings.add("String One");
        listOfStrings.add("String Two");
        listOfStrings.add("String Three");
        listOfStrings.add("String Four");
        listOfStrings.add("String Five");

        // Created string array with the size of List and calling toArray() method
        String[] stringArray = listOfStrings.toArray(new String[listOfStrings.size()]);

        // Printing the values of Array.
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("String value at index "+i+" is "+stringArray[i]);
        }
    }


}
