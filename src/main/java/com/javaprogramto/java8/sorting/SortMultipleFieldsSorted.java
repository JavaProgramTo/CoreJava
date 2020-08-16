package com.javaprogramto.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMultipleFieldsSorted {

    public static void main(String[] args) {


        Employee e1 = new Employee(111, "Hari", 30);
        Employee e2 = new Employee(222, "Jool", 35);
        Employee e3 = new Employee(333, "Hari", 28);
        Employee e4 = new Employee(444, "Jool", 23);

        List<Employee> unsortredList = Arrays.asList(e1, e2, e3, e4);

        Comparator<Employee> idEmployeeComparator = Comparator.comparing(Employee::getName);

        Comparator<Employee> titleEmployeeComparator = Comparator.comparing(Employee::getAge);

        Comparator<Employee> multipleFieldsComparator = idEmployeeComparator.thenComparing(titleEmployeeComparator);

        System.out.println("Unsorted Emp List : ");

        for (Employee e : unsortredList) {
            System.out.println(e);
        }

        List<Employee> sortedList1 = unsortredList.stream().sorted(multipleFieldsComparator).collect(Collectors.toList());

        System.out.println("After sorting books list : ");


        for (Employee e : sortedList1) {
            System.out.println(e);
        }


        List<Employee> unsortredEmpList2 = Arrays.asList(e1, e2, e3, e4);

        System.out.println("Unsorted Books List 2 : ");
        for (Employee e : unsortredEmpList2) {
            System.out.println(e);
        }

        List<Employee> sortedList2 = unsortredEmpList2.stream().sorted(multipleFieldsComparator).collect(Collectors.toList());

        System.out.println("After sorting emp list 2: ");


        for (Employee e : sortedList2) {
            System.out.println(e);
        }
    }
}

class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}