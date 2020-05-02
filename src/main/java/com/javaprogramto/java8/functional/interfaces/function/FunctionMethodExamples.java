package com.javaprogramto.java8.functional.interfaces.function;

import com.javaprogramto.models.Employee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMethodExamples {

    public static void main(String[] args) {

        Function<Employee, String> empToStringFunction = emp -> emp.getFullName();

        Function<String, Integer> stringToIntFunction = str -> str.length();

        Function<Integer, Integer> squereFunction = numner -> numner * numner;

        // chain() method example
        Integer squere = empToStringFunction.andThen(stringToIntFunction).andThen(squereFunction).apply(new Employee(500, "Lady Gaga", 50));

        System.out.println("andThen() example to get Employee name length squere : " + squere);

        // identity() example
        String input = "aaaaa bbbbb";
        Map chars = input.codePoints().mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println("identity chars "+chars);
    }


}
