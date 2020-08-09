package com.javaprogramto.collections.compare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEqualsExample {

    public static void main(String[] args) {

        List<Integer> numbers1List = new LinkedList<>();
        numbers1List.add(100);
        numbers1List.add(300);
        numbers1List.add(500);

        List<Integer> numbers2List = new ArrayList<>();
        numbers2List.add(200);
        numbers2List.add(400);
        numbers2List.add(600);

        boolean bothEquals = numbers1List.equals(numbers2List);

        if(bothEquals){
            System.out.println("Both lists are equal");
        } else {
            System.out.println("Both lists are not equal");
        }
    }
}
