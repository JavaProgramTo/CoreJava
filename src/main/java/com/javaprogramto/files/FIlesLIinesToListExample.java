package com.javaprogramto.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FIlesLIinesToListExample {

    public static void main(String[] args) {

        String fileLocation = "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/resources/dummy.txt";

        Path filePath = Paths.get(fileLocation);

        try {

           Stream<String> allLines = Files.lines(filePath);

            List<String> linesList = allLines. collect(Collectors.toList());
            System.out.println("lines list size : "+linesList.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
