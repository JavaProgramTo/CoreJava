package com.javaprogramto.java8.compare;

import java.util.ArrayList;
import java.util.List;

public class ArrayListComparisions {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(100,"Jhon", 30);

        Employee e2 = new Employee(101,"Amenda", 35);

        Employee e3 = new Employee(102,"Alexa", 40);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        Employee e4 = new Employee(100,"Jhon", 30);

        boolean e4Exists = empList.indexOf(e4) > -1;

        if(e4Exists){
            System.out.println("Employee e4 exists in list");
        } else{
            System.out.println("Emp e4 does not exist in the emp list");
        }

    }
}
