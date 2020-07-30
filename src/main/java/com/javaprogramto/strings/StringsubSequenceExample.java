package com.javaprogramto.strings;

public class StringsubSequenceExample {

    public static void main(String[] args) {

        String stringObject = "javaprogramto.com is a java blog";

        CharSequence output1 = stringObject.subSequence(20, stringObject.length());
        System.out.println(output1);

        CharSequence output2 = stringObject.subSequence(0, 18);
        System.out.println(output2);

    }
}
