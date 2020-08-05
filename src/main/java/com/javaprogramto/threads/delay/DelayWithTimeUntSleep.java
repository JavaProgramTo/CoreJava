package com.javaprogramto.threads.delay;

import java.util.concurrent.TimeUnit;

public class DelayWithTimeUntSleep {

    public static void main(String[] args) {

        System.out.println("Task 1 Started with TimeUnit Seconds");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("Thread is interuppted....");
        }

        System.out.println("Task 1 Ended");

        System.out.println("Task 2 Started with TimeUnit Seconds");

        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Thread is interuppted....");
        }

        System.out.println("Task 2 Ended");

    }

}

