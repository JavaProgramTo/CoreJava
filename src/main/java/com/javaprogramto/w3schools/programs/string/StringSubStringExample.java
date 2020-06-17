package com.javaprogramto.w3schools.programs.string;

public class StringSubStringExample {

    public static void main(String[] args) {

        String accountInfo = "In Active";

        String accountStatus = accountInfo.substring(3);

        System.out.println("Extracted account status from account info text for account 1: "+accountStatus);

        accountInfo = "Is Locked";

        accountStatus = accountInfo.substring(3);

        System.out.println("Extracted account status from account info text for account 2: "+accountStatus);

    }
}
