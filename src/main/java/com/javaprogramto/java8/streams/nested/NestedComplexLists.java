package com.javaprogramto.java8.streams.nested;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NestedComplexLists {

    public static void main(String[] args) {

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Address 1 Line 1", "Address 1 Line 2", "Address 1  town", "Address 1 city", "12345"));
        addresses.add(new Address("Address 2 Line 1", "Address 2 Line 2", "Address 2 town", "Address 2 city", "22222"));
        addresses.add(new Address("Address 3 Line 1", "Address 3 Line 2", "Address 3 town", "Address 3 city", "33333"));

        Employee employee1 = new Employee(100, "Emp 1", addresses);

        List<Address> addresses2 = new ArrayList<>();

        addresses2.add(new Address("Address 4 Line 1", "Address 4 Line 2", "Address 4 town", "Address 4 city", "444444"));
        addresses2.add(new Address("Address 5 Line 1", "Address 5 Line 2", "Address 5 town", "Address 5 city", "55555"));
        addresses2.add(new Address("Address 6 Line 1", "Address 6 Line 2", "Address 6 town", "Address 6 city", "66666"));

        Employee employee12 = new Employee(101, "Emp 2", addresses2);
        List<Employee> empList = Arrays.asList(employee1, employee12);

        EmployeeFactory employeeFactory = new EmployeeFactory(empList);

        List<EmployeeFactory> employeeFactories = Arrays.asList(employeeFactory);

        List<String> citiesList = employeeFactories.stream()
                .flatMap(factory -> factory.getEmployees().stream())
                .flatMap(emp -> emp.getAddresses().stream())
                .filter(address -> (address.getPincode().indexOf("5") >= 0 || address.getPincode().indexOf("3") >= 0))
                .map(address -> address.getCity())
                .collect(Collectors.toList());

        System.out.println("Cities list : " + citiesList);

    }
}


class EmployeeFactory {
    private List<Employee> employees;


    public EmployeeFactory(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

class Employee {

    private int id;
    private String name;
    private List<Address> addresses;

    public Employee(int id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}

class Address {
    private String line1;
    private String line2;
    private String town;
    private String city;
    private String pincode;

    public Address(String line1, String line2, String town, String city, String pincode) {
        this.line1 = line1;
        this.line2 = line2;
        this.town = town;
        this.city = city;
        this.pincode = pincode;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}