package com.javaprogramto.w3schools.programs.string;

public class PrimitiveToString {

    public static void main(String[] args) {

        int age = 30;

        String ageString = String.valueOf(age);
        System.out.println("String age : "+ageString);

        float PI = 3.14f;

        String floatString = String.valueOf(PI);
        System.out.println("String float : "+floatString);

        double salary = 1000000;

        String doubleString = String.valueOf(salary);
        System.out.println("String double : "+doubleString);

        long size = 15098;

        String longString = String.valueOf(size);
        System.out.println("String Long : "+longString);

        boolean isValid = false;
        String booleanString = String.valueOf(isValid);
        System.out.println("String boolean : "+booleanString);

        char[] chars = {'a', 'e', 'o', 'i', 'u'};
        String stringCharArray = String.valueOf(chars);
        System.out.println("String char array : "+stringCharArray);
    }
}
