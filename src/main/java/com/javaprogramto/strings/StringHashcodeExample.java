package com.javaprogramto.strings;

public class StringHashcodeExample {

    public static void main(String[] args) {

        String str = "hello string fan";

        int hashValue = str.hashCode();

        System.out.println("hash code of string : "+hashValue);

        String newString = "this is a new string";

        int newStrHashValue = newString.hashCode();

        System.out.println("New string hash value : "+newStrHashValue);
    }
}
