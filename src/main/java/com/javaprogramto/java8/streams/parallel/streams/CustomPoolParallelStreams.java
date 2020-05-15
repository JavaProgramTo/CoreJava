package com.javaprogramto.java8.streams.parallel.streams;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomPoolParallelStreams {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        parallelStreamProcess2();
    }

    private static void parallelStreamProcess() throws ExecutionException, InterruptedException {

        int start = 1;
        int end = 10000;

        List<Integer> intList = IntStream.rangeClosed(start, end).boxed()
                .collect(Collectors.toList());
        System.out.println(intList.size());

        ForkJoinPool newCustomThreadPool = new ForkJoinPool(5);
        int actualTotal = newCustomThreadPool.submit(
                () -> {
                     int a = intList.stream().reduce(0, Integer::sum).intValue();
                    System.out.println("------ "+a);
                     return a;
                }).get();

        System.out.println("actualTotal " + actualTotal);

    }

    private static void parallelStreamProcess2() throws ExecutionException, InterruptedException {

        int start = 1;
        int end = 5;

        List<Integer> intList = IntStream.rangeClosed(start, end).boxed()
                .collect(Collectors.toList());
        System.out.println(intList.size());

        ForkJoinPool newCustomThreadPool = new ForkJoinPool(5);
        int actualTotal = newCustomThreadPool.submit(
                () -> {
                    intList.stream().map( nu -> nu).forEach(a -> System.out.println(a));
                  //  System.out.println("------ "+a);
                    return 0;
                }).get();

        System.out.println("actualTotal " + actualTotal);

    }

}
