package com.javaprogramto.logging.util;

import java.util.logging.Logger;

public class LoadLoggingPropertiesFIle {

    private static Logger logger;


    public static void main(String[] args) {

        logger.info("Hello, I am info logger.");

        logger.warning("Hello, no date is provided. So, taking the system date as DOJ");

        logger.severe("Error message. Can not connect to the service DateAPI.");

    }

    static {

        // Setting the log file location to the system varaible.
        System.setProperty("java.util.logging.config.file",
                "/Users/venkateshn/Documents/VenkY/blog/workspace/CoreJava/src/main/resources/logging.properties");


        logger = Logger.getLogger(LoadLoggingPropertiesFIle.class.getName());
    }
}
