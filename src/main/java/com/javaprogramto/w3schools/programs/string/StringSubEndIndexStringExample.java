package com.javaprogramto.w3schools.programs.string;

public class StringSubEndIndexStringExample {

    public static void main(String[] args) {

        String accountInfo = "Is Active my account?";

        String accountStatus = accountInfo.substring(3, 10);

        System.out.println("Extracted account status from account info text for account 1: "+accountStatus);

        accountInfo = "is my Locked ?";

        accountStatus = accountInfo.substring(6, 12);

        System.out.println("Extracted account status from account info text for account 2: "+accountStatus);

    }
}
