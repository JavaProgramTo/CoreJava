package com.javaprogramto.w3schools.programs.ascii;

public class CharToASCII {

    public static void main(String[] args) {
        char c = 'A';
        int aAscii = c;
        int castAscii = (int) c;

        System.out.println("Char A ASCII value with variable assignment : "+aAscii);
        System.out.println("Char A ASCII value with casting : "+castAscii);

        char anotherChar = 'Z';

        int anotherCharAscii = c;
        int anotherCharCastAscii = (int) c;

        System.out.println("Char Z ASCII value with variable assignment : "+anotherCharAscii);
        System.out.println("Char Z ASCII value with casting : "+anotherCharCastAscii);

    }
}
