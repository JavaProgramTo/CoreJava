package com.javaprogramto.threads.delay;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayWithExecutorService {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(new NewTask2(), 1000, TimeUnit.MILLISECONDS);

    }

}

class NewTask implements Runnable {

    @Override
    public void run() {

        System.out.println("Task completed");
    }

}

