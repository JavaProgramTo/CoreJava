package com.javaprogramto.arrays.setall;

import com.javaprogramto.models.Employee;

import java.util.Arrays;

public class EmployeeArraySetAllExample {

    public static void main(String[] args) {

        // Creating a Employee array with default values
        Employee[] employeeArray = new Employee[7];

        System.out.println("original Employee array with default values : "+ Arrays.toString(employeeArray));

        // setting values to employeeArray using setAll() method
        Arrays.setAll(employeeArray, i -> new Employee(i+1, "Index "+i, i+30));

        System.out.println("Employee array.setAll(Employee) output: "+ Arrays.toString(employeeArray));
    }
}
