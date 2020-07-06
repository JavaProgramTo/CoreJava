package com.javaprogramto.exception;

public class FinallyBlockReturnsValue {

    public static void main(String[] args) {

        String returnedStatus = executeReqeust();
        System.out.println("Status of the reqeust: " + returnedStatus);

    }

    public static String executeReqeust() {

        try {

            System.out.println("Executing business logic");
            // doing business logic
            System.exit(1);
            return "Success";
        } catch (Exception e) {
            return "Error";
        } finally {

            System.out.println("Executing Finally block after return statement.");
            return "Good To Go";
        }
    }
}
