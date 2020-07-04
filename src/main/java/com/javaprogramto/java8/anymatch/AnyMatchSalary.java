package com.javaprogramto.java8.anymatch;

import java.util.stream.Stream;

public class AnyMatchSalary {

    public static void main(String[] args) {

        Employee e1 = new Employee(100, 10000, "SE");
        Employee e2 = new Employee(101, 20000, "Manager");
        Employee e3 = new Employee(102, 30000, "manager");

        Stream<Employee> empStream = Stream.of(e1, e2, e3);

        boolean foundEmp = empStream.anyMatch(emp -> emp.getDesgination().equalsIgnoreCase("Manager") && emp.getSalary() > 10000);

        if(foundEmp){
            System.out.println("Found manager salaray > 10000");
        } else {
            System.out.println("No manager with salary > 10000");
        }

        Stream<Employee> empStream2 = Stream.of(e1, e2, e3);

        boolean foundEmp2 = empStream2.anyMatch(emp -> emp.getDesgination().equalsIgnoreCase("SE") && emp.getSalary() > 10000);

        if(foundEmp2){
            System.out.println("Found SE salaray > 10000");
        } else {
            System.out.println("No SE with salary > 10000");
        }

    }
}

class Employee {

    private int id;
    private long salary;
    private String desgination;

    public Employee(int id, long salary, String desgination) {
        this.id = id;
        this.salary = salary;
        this.desgination = desgination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDesgination() {
        return desgination;
    }

    public void setDesgination(String desgination) {
        this.desgination = desgination;
    }
}