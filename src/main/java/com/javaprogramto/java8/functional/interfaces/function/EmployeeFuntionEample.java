package com.javaprogramto.java8.functional.interfaces.function;

import com.javaprogramto.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeFuntionEample {

    public static void main(String[] args) {

        Function<Employee, String> empString = employee -> employee.getAge() + " - " + employee.getFullName();

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(100, "Jhon Paul", 25));
        list.add(new Employee(101, "Narmad Rao", 30));

        for (Employee emp : list) {
            String empInStr = empString.apply(emp);
            System.out.println(empInStr);
        }

    }
}
