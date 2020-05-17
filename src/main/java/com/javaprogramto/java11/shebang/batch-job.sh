#!/usr/local/bin/java --source 11

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sum {
    public static void main(String[] args) {

        Stream<String> stream = Arrays.stream(args);

        int sum = stream.mapToInt(Integer::parseInt).sum();
        System.out.println("Total sum : "+sum);
    }
}
