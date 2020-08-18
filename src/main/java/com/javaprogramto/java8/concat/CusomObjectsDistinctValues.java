package com.javaprogramto.java8.concat;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CusomObjectsDistinctValues {

    public static void main(String[] args) {

        // Create Employee stream 1
        Stream<Employee> stream1 = getEmployeStream1();

        // Create Employee stream 2
        Stream<Employee> stream2 = getEmployeStream2();

        // Removing duplicate elemetns
        List<Employee> uniqueValues = Stream.concat(stream1, stream2).filter(distinctByKey(Employee::getId)).collect(Collectors.toList());

        // printing sorted merged stream values
        System.out.println("Removed duplicates after merge");
        uniqueValues.forEach(merge -> System.out.println(merge));

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor)
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    private static Stream<Employee> getEmployeStream1() {

        Employee e1 = new Employee(100, "Navamsha");
        Employee e2 = new Employee(101, "dhsamsha");
        Employee e3 = new Employee(103, "Chitra");

        return Stream.of(e1, e2, e3);
    }

    private static Stream<Employee> getEmployeStream2() {

        Employee e1 = new Employee(100, "Navamsha");
        Employee e2 = new Employee(101, "dhsamsha");
        Employee e3 = new Employee(102, "Varshad");
        Employee e4 = new Employee(103, "Chitra");

        return Stream.of(e1, e2, e3, e4);
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}