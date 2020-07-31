package com.javaprogramto.java8.foreach;

import java.util.ArrayList;
import java.util.List;

public class Java8ForEachDrawBack1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("you");
        list.add("me");
        list.add("learn");
        list.add("java");

        String newString = "I am newly created";

        list.forEach(value -> {
            System.out.println(value);
            //newString = "I am modified";
        });

        boolean hasLength5 =list.stream().filter( value -> value.length() >=5).findFirst().orElse(null).length() > 0;


        list.forEach(value -> {

            if (value.length() == 2) {
               // Class.forName("com.NoClass");
			//	throws new RuntimeException("Length should be min 3 characters");
            }
        });
    }

    private static boolean hasListHasValueLengh5(List<String> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).length() >= 5) {
                return true;
            }

        }
        return false;
    }

}

