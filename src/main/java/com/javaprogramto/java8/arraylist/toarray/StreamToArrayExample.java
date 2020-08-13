package com.javaprogramto.java8.arraylist.toarray;

import java.util.ArrayList;
import java.util.List;

public class StreamToArrayExample {

    public static void main(String[] args) {

        // Created a List with type String
        List<String> listOfStrings = new ArrayList<>();

        // Added 5 string values to ArrayList
        listOfStrings.add("String One");
        listOfStrings.add("String Two");
        listOfStrings.add("String Three");
        listOfStrings.add("String Four");
        listOfStrings.add("String Five");

        // Using Stream api toArray() method and passing the String array object with method reference.
        String[] stringArray = listOfStrings.stream().toArray(String[]::new);

        // Printing the values of Array.
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("String value at index "+i+" is "+stringArray[i]);
        }
    }


}
