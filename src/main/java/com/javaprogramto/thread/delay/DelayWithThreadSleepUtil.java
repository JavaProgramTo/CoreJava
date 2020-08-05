package com.javaprogramto.thread.delay;

public class DelayWithThreadSleepUtil {

    public static void main(String[] args) {

        System.out.println("Program Started...");

        System.out.println("Started task 1");

        sleep(5000);

        System.out.println("Code delay completed for task 1");

        System.out.println("Started task 2");
        sleep(3000);

        System.out.println("Code delay completed for task 2");

        System.out.println("Program Ended");

    }

    private static void sleep(long millies) {
        try {
            Thread.sleep(millies);
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
            Thread.currentThread().interrupt();
        }
    }

}
