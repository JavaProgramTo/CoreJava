package com.javaprogramto.arrays.find;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {6, 7, 10, 5, 70, 9};

        boolean found = false;

        int valueToBeFound = 5;

        for(int value : array){

            if( value == valueToBeFound){
                found = true;
            }
        }

        if(found){
            System.out.println("value 5 is present");
        } else {
            System.out.println("value 5 is not present");
        }
    }
}
