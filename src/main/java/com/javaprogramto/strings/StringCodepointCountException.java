package com.javaprogramto.strings;

public class StringCodepointCountException {

    public static void main(String[] args) {

        String heartString = "\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93";

        System.out.println("Input string value : "+heartString);

        // Getting count of code points for index 0 to 4
        int countpointsCount = heartString.codePointCount(-10, heartString.length());

        System.out.println("Code points count for indexs range (0, 4) : "+countpointsCount);
    }
}
