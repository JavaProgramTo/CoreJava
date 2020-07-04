package com.javaprogramto.java8.anymatch;

import java.util.stream.Stream;

public class AnyMatchOnEmptyStream {

    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();

        boolean found = emptyStream.anyMatch(str -> str.length() > 0);

        if(found){
            System.out.println("Stream has values");
        } else {
            System.out.println("Stream is empty and no values");
        }
    }
}
