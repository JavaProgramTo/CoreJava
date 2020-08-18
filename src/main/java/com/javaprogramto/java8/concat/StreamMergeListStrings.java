package com.javaprogramto.java8.concat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMergeListStrings {

    public static void main(String[] args) {

        // Creating list 1 with string values
        List<String> list1 = Arrays.asList("hello", "how", "are", "you", "doing", "?");

        // Creating list 2 with string values
        List<String> list2 = Arrays.asList("I", "am", "doing", "great", "!");

        // Merging list of strings with concat method
        List<String> mergedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        // Merged list values
        System.out.println("Final merged list values are ");
        mergedList.forEach(finalValue -> System.out.println(finalValue));
    }

}