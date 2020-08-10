package com.javaprogramto.logging.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoadLoggingPropertiesFIleLogManger {

    private static Logger logger = getLogger(LoadLoggingPropertiesFIleLogManger.class);


    public static void main(String[] args) {

        logger.info("Hello, I am info logger.");

        logger.warning("Hello, no date is provided. So, taking the system date as DOJ");

        logger.severe("Error message. Can not connect to the service DateAPI.");

    }

    private static Logger getLogger(Class classObject) {

        InputStream stream = classObject.getClassLoader().getResourceAsStream("logging.properties");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Logger.getLogger(LoadLoggingPropertiesFIleLogManger.class.getName());
    }
}
