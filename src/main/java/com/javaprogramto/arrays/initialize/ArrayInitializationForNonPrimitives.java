package com.javaprogramto.arrays.initialize;

import com.javaprogramto.models.Employee;

public class ArrayInitializationForNonPrimitives {

    public static void main(String[] args) {

        // Array initialization without the "new" keyword
        String[] stringArray = {};

        // String Array initialization with "new" keyword
        String[] newStringArray = new String[0];

        Employee e1 = new Employee(100, "Jhon", 30);
        Employee e2 = new Employee(101, "Amal", 25);
        Employee e3 = new Employee(102, "Paul", 35);

        // Employee Array initialization with "new" keyword

        Employee[] empArrayWithoutNewKeyword = {};

        Employee[] empArrayWithNewKeyword = new Employee[0];

    }
}
