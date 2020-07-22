package com.javaprogramto.strings.split;

public class StringSplitExample2 {

    public static void main(String[] args) {
        String str = "javaprogramto.comisfordevelopersandforfreshers";

        String[] splitArray = str.split("for");

        for(String value : splitArray){
            System.out.println(value);
        }
    }
}
