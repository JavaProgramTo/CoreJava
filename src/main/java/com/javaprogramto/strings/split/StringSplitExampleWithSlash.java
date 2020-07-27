package com.javaprogramto.strings.split;

public class StringSplitExampleWithSlash {

    public static void main(String[] args) {
        String fileLocation = "/Users/javaprogramto/Documents/course/blog/workspace/CoreJava/split.java";

        String[] slashBasedSplitArray = fileLocation.split("/");

        System.out.println("Splitting string with dot using regex 1");
        for (String value : slashBasedSplitArray) {
            System.out.println(value);
        }

        System.out.println("No of folders in the path : " + (slashBasedSplitArray.length - 1));


    }
}
