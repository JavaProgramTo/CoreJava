package com.javaprogramto.java8.streams.conversions;

import com.javaprogramto.models.Employee;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStreamUtility {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(200, "Momanth Soraga", 30));
        list.add(new Employee(201, "Fidha Lady", 25));

        Stream<Employee> empStream = convertIteratorToStream(list);


        System.out.println("Employee Stream Count : " + empStream.count());

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> intStream  = convertIteratorToStream(intList);

        System.out.println("Integer Stream Count : " + intStream.count());

        List<String> countiresList = Arrays.asList("USA", "India","UK","AUS");

        Stream<String> countiresStream  = convertIteratorToStream(countiresList);

        System.out.println("String countries Stream Count : " + countiresStream.count());



    }

    /**
     * Generic method to take any value List type and return a generic Stream.
     * <p>
     * Main goal to convert Iterator to Stream.
     *
     * @param source
     * @param <T>
     * @return
     */
    public static <T> Stream<T> convertIteratorToStream(List<T> source) {

         /*
        List to Iterator
         */
        Iterator<T> it = source.iterator();

        /*
        Iterator to Spliterator
         */
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED);

        /*
        Spliterator to Stream
         */
        Stream<T> oututStream = StreamSupport.stream(spliterator, false);

        return oututStream;
    }
}
