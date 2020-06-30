package com.javaprogramto.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FIlesLIinesBufferedReaderExample {

    public static void main(String[] args) {

        String fileLocation = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/resources/dummy.txt";

        Path filePath = Paths.get(fileLocation);

        try {

            BufferedReader bufferedReader = Files.newBufferedReader(filePath);

           Stream<String> allLines = bufferedReader.lines();

            List<String> uppperCaseList = allLines.map(value -> value.toUpperCase()).collect(Collectors.toList());

            uppperCaseList.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
