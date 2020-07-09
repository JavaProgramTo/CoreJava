package com.javaprogramto.threads;

public class AnonymousRunnableExample {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(
                            "Executing " + i + " thread name - " + Thread.currentThread().getName());
                }
            }
        }).start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(
                    "Executing " + i + " thread name - " + Thread.currentThread().getName());
        }
    }
}
