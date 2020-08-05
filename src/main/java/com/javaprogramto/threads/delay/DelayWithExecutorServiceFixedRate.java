package com.javaprogramto.threads.delay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayWithExecutorServiceFixedRate {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(new NewTask2(), 1000, 5000, TimeUnit.MILLISECONDS);

    }

}

class NewTask2 implements Runnable {

    @Override
    public void run() {

        System.out.println("Task started");

        try {
            System.out.println("sleeping 7 seconds..");
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            System.out.println("thread is interrputed");
        }

        System.out.println("Task completed");
    }

}

