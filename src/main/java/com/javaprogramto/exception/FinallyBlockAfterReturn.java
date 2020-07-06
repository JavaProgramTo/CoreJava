package com.javaprogramto.exception;

public class FinallyBlockAfterReturn {

    public static void main(String[] args) {

        int returnedStatus = process();
        System.out.println("Returned value : "+returnedStatus);

    }
    public static int process() {

        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            System.out.println("Executing Finally block after return statement.");
        }
    }
}
