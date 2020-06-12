package com.javaprogramto.w3schools.programs.string;

import java.util.Scanner;

public class StringReverseRecursionFromUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String One");
        String s1 = scanner.nextLine();

        String reversedS1 = reverseString(s1);
        System.out.println("String s1 before reversing : "+s1);
        System.out.println("Reversed String s1 : "+reversedS1);

        System.out.println("Enter String Two");
        String s2 = scanner.nextLine();

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
