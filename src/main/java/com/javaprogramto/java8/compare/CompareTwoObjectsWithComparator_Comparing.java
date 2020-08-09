package com.javaprogramto.java8.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTwoObjectsWithComparator_Comparing {

    public static void main(String[] args) {


        System.out.println("Example with Custom comparator with for Sorting");
        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(100,"Jhon", 30);

        Employee e2 = new Employee(101,"Amenda", 35);

        Employee e3 = new Employee(102,"Alexa", 40);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        Employee e4 = new Employee(103,"Jhon Abraham", 33);

        empList.add(e4);

        Comparator<Employee> nameComparator = Comparator.comparing( emp -> emp.getName());

        System.out.println("before sorting by name : "+empList);

        Collections.sort(empList, nameComparator);

        System.out.println("Sorting by name comparing objects  : "+empList);


    }
}
