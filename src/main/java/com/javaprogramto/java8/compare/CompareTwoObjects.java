package com.javaprogramto.java8.compare;

public class CompareTwoObjects {

    public static void main(String[] args) {

        // create two Employee Objects
        Employee e1 = new Employee(100,"Jhon", 30);

        Employee e2 = new Employee(101,"Amenda", 35);

        // Compare two employee e1, e2 objects

        boolean isSame = e1.equals(e2);

        if(isSame){
            System.out.println("e1 and e2 are same objects and have the same values");
        } else {
            System.out.println("e1 and e2 are not same objects");
        }

        Employee e3 = new Employee(100,"Jhon", 30);

        if(e1 == e3){
            System.out.println("e1, e3 references are same");
        } else {
            System.out.println("e1, e3 references are different");
        }

        if(e1.equals(e3)){
            System.out.println("e1, e3 objects are same");
        } else {
            System.out.println("e1, e3 objects are different");
        }


    }
}
