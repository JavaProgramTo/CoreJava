package com.javaprogramto.java8.functional.interfaces.function;

import com.javaprogramto.models.Employee;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionListToMap {

  static Logger logger = LoggerFactory.getLogger(FunctionListToMap.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        // Createing a list
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(100, "Jhon Paul", 25));
        list.add(new Employee(101, "Narmad Rao", 30));

        // Creating Function to convert List to Map.
        Function<List<Employee>, Map<Integer, Employee>> listToMap = employees -> {

            Map<Integer, Employee> newMap = new HashMap<>();
            for (Employee e : employees
            ) {
                newMap.put(e.getId(), e);
            }
            return newMap;
        };

        Map<Integer, Employee> empMap = listToMap.apply(list);
        logger.info("List to Map : " + empMap);
    }
}
