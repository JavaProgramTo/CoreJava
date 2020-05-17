package com.javaprogramto.jackson.datetime;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BookToString {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


        try {
            // JSON file to Java object
            Book book = mapper.readValue(new File("/Users/CoreJava/src/main/resources/book.json"), Book.class);

            System.out.println("book object from josn : " + book);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
