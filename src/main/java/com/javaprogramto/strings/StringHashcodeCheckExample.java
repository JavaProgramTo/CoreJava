package com.javaprogramto.strings;

public class StringHashcodeCheckExample {

    public static void main(String[] args) {

        String str1 = "FB";

        int hashCode1 = str1.hashCode();

        System.out.println("hash code of str 1 : " + hashCode1);

        String str2 = "FB";

        int hashCode2 = str2.hashCode();

        System.out.println("hash code of str 2 : " + hashCode2);

        if(hashCode1 == hashCode2){
            System.out.println("Hashcodes of str1 and str2 are same");
        } else{
            System.out.println("str1 and str2 hashcodes are not same");
        }
    }
}
