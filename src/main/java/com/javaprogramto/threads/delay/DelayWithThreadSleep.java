package com.javaprogramto.threads.delay;

public class DelayWithThreadSleep {

    public static void main(String[] args) {

        System.out.println("Program Started...");
        System.out.println("Current Thread name : " + Thread.currentThread().getName());

        // do some task

        try {
            System.out.println("Sleepin for 5 seconds");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
        System.out.println("Code delay completed.");

        System.out.println("Program Ended");

    }

}