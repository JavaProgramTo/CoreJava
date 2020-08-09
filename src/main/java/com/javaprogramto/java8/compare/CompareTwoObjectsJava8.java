package com.javaprogramto.java8.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CompareTwoObjectsJava8 {

    public static void main(String[] args) {


        System.out.println("Compare with Java 8 API Stream API");
        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(100,"Jhon", 30);

        Employee e2 = new Employee(101,"Amenda", 35);

        Employee e3 = new Employee(102,"Alexa", 40);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        Employee e4 = new Employee(100,"Jhon", 30);

        // Stream api
        boolean e4Exists = Stream.of(e4).anyMatch( e -> empList.contains(e));

        if(e4Exists){
            System.out.println("Stream checking : Employee e4 exists in list");
        } else{
            System.out.println("Stream checking : Emp e4 does not exist in the emp list");
        }

    }
}
