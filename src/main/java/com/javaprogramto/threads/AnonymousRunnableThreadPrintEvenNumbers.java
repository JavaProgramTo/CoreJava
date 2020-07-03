package com.javaprogramto.threads;


public class AnonymousRunnableThreadPrintEvenNumbers {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i <= 10; i++) {
                     if(i % 2 == 0){
                         System.out.println(Thread.currentThread().getName() +" - "+i);
                     }
                }

                System.out.println("Child thread ened "+Thread.currentThread().getName());
            }
        }).start();

        System.out.println("main thread ended.");
    }
}
