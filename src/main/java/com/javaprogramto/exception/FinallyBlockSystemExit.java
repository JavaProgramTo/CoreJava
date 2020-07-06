package com.javaprogramto.exception;

public class FinallyBlockSystemExit {

    public static void main(String[] args) {

        executeReqeust();
        System.out.println("Execution of main method is done");

    }

    public static void executeReqeust() {

        try {

            System.out.println("Executing business logic Started");
            // doing business logic
            //System.exit(1);
            Runtime.getRuntime().halt(2);
            System.out.println("Executing business logic Ended");
        } catch (Exception e) {

        } finally {

            System.out.println("Executing Finally block after return statement.");

        }
    }
}
