package com.javaprogramto.java8.streams.conversions;

import com.javaprogramto.models.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStream {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(100, "Santa Clara", 30));
        list.add(new Employee(101, "Sameera Bell", 25));
        list.add(new Employee(102, "Jhon Cena", 33));
        list.add(new Employee(103, "Tubel Nohn", 35));
        list.add(new Employee(104, "Meen Joseph", 31));

        System.out.println("original List : " + list);

        /*
        List to Iterator
         */
        Iterator<Employee> it = list.iterator();

        /*
        Iterator to Spliterator
         */
        Spliterator<Employee> employeeSpliterator = Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED);

        /*
        Spliterator to Stream
         */
        Stream<Employee> employeeStream = StreamSupport.stream(employeeSpliterator, false);


        List<Employee> ageGt30List = employeeStream.peek(e -> System.out.println(e)).filter(e -> e.getAge() > 30).collect(Collectors.toList());

        System.out.println("Employee age > 30 size: " + ageGt30List.size());
        System.out.println("Employee age > 30 : " + ageGt30List);


    }
}
