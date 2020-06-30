package com.javaprogramto.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FIlesLIinesExample {

    public static void main(String[] args) {

        String fileLocation = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/resources/dummy.txt";

        Path filePath = Paths.get(fileLocation);

        try {

           Stream<String> allLines = Files.lines(filePath);

            System.out.println("File contents are : ");
           allLines.forEach( line -> System.out.println(line));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
