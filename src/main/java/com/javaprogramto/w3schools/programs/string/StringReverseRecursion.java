package com.javaprogramto.w3schools.programs.string;

public class StringReverseRecursion {

    public static void main(String[] args) {

        String s1 = "Welcome to the javaprogramto.com";

        String reversedS1 = reverseString(s1);
        System.out.println("String s1 before reversing : "+s1);
        System.out.println("Reversed String s1 : "+reversedS1);

        String s2 = "Another String s2";

        String reversedS2 = reverseString(s2);
        System.out.println("String s2 before reversing : "+s2);
        System.out.println("Reversed String s2 : "+reversedS2);
    }


    private static String reverseString(String sentense)
    {
        if (sentense.isEmpty())
            return sentense;

        //Calling method Recursively
        return reverseString(sentense.substring(1)) + sentense.charAt(0);
    }
}
