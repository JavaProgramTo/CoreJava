package com.javaprogramto.java8.compare.set;

import java.util.HashSet;
import java.util.Set;

public class SetEqualsMethodExample {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Set 2 values : "+set1);

        Set<Integer> set2 = new HashSet<>();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set 2 values : "+set2);

        boolean isEquals = set1.equals(set2);

        System.out.println("Are both sets equal ? : "+isEquals);

    }
}
