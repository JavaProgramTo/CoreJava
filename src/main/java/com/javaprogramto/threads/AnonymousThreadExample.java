package com.javaprogramto.threads;

public class AnonymousThreadExample {
    public static void main(String[] args) {
        new Thread() {

            public void run() {

                for (int i = 0; i <= 10; i++) {
                    System.out.println(
                            "Executing " + i + " thread name - " + Thread.currentThread().getName());
                }

            }

        }.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(
                    "Executing " + i + " thread name - " + Thread.currentThread().getName());
        }
    }
}
