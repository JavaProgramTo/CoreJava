package com.javaprogramto.w3schools.programs.ascii;

public class StringToAsciiByteCasting {

    public static void main(String[] args) {

        String input = "byte casting";

        char[] array = input.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (char ch: array) {
            sb.append((byte)ch).append(" ");

        }

        System.out.println("byte casting output : "+sb);
    }
}
