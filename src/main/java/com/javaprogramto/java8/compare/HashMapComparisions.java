package com.javaprogramto.java8.compare;

import java.util.HashMap;
import java.util.Map;

public class HashMapComparisions {

    public static void main(String[] args) {

        // key is employee and value is Salary as long.
        Map<Employee, Long> empMap = new HashMap<>();

        Employee e1 = new Employee(100,"Jhon", 30);

        Employee e2 = new Employee(101,"Amenda", 35);

        Employee e3 = new Employee(102,"Alexa", 40);


        empMap.put(e1, 5000l);
        empMap.put(e2, 15000l);
        empMap.put(e3, 25000l);

        System.out.println("Employee values are : "+empMap);

        // adding again the same object with different salary

        Employee e4 = new Employee(100,"Jhon", 30);

        empMap.put(e4, 35000l);

        System.out.println("After adding the duplicate employee object with new salary. \nMap Employee objects and values are : "+empMap);

        boolean e4Exists = empMap.containsKey(e4);

        if(e4Exists){
            System.out.println("Employee e4 exists in list");
        } else{
            System.out.println("Emp e4 does not exist in the emp list");
        }

    }
}
