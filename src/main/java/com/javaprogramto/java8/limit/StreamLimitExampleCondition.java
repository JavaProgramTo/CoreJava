package com.javaprogramto.java8.limit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitExampleCondition {

    public static void main(String[] args) {

        // Creating List using Arrays.asList() method
        List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "four", "five", "six"));

        System.out.println("Original list before : " + list);

        // Get max 2 objects by limit
        int maxLimit = 2;

        // comparator creation
        Comparator<String> comp = (String::compareTo);

        // reverse sorting
        Comparator<String> comparator = comp.reversed();

        // limit offset based on limit.
        List<String> newList = list.stream().sorted(comparator).limit(maxLimit > 0 ? maxLimit : list.size())
                .collect(Collectors.toList());

        // printing the condition offset output
        System.out.println("limiting to 2 after sorting : " + newList);

    }

}
