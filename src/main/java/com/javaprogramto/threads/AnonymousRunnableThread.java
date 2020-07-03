package com.javaprogramto.threads;


public class AnonymousRunnableThread {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+", i value from thread- "+i);
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+", i value from main thread - "+i);
        }
    }
}
