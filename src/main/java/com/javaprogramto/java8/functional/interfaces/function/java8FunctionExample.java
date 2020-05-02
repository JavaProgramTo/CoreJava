package com.javaprogramto.java8.functional.interfaces.function;

import java.util.function.Function;

public class java8FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> function = str -> str.length();

        int length = function.apply("Hello world");
        System.out.println("Fucntion to find string length :" + length);

        Function<Integer, String> function2 = number -> String.valueOf(number) + " is now String";

        String output = function2.apply(1260);
        System.out.println("Funtion to covnert Integer to String : "+output);
    }
}
