package com.javaprogramto.java8.limit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamLimitExampleBeforeJava8 {

    public static void main(String[] args) {

        // Creating List using Arrays.asList() method
        List<String> strings = new ArrayList<String>(Arrays.asList("java 8", "programs", "on", "javaprogram.com", "new", "blog"));

        System.out.println("Original list before limit logic " + strings);

        // creating iterator object
        Iterator<String> it = strings.iterator();

        // creating limit and current index.
        int limit = 3;
        int index = 0;

        // Iterating the iterator
        while (it.hasNext()) {

            // Moving the iterator point to the next element. If you comment this line the it will give java.lang.IllegalStateException.
            it.next();

            index++;

            // checking the current index is higher than limit.
            if (index > limit) {
                it.remove();
            }

        }

        System.out.println("After limiting to 5 strings : "+strings);


    }

}
