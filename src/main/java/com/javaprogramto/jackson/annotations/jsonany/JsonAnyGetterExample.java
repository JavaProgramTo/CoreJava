package com.javaprogramto.jackson.annotations.jsonany;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class JsonAnyGetterExample {

    // comment the @JsonAnyGetter annoation from the Table class.
    public static void main(String[] args) throws JsonProcessingException {

        Table table = getTable();

        ObjectMapper mapper = new ObjectMapper();
        String tableAsJson = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(table);
        System.out.println("Table as json : "+tableAsJson);


    }

    private static Table getTable() {

        Table table = new Table();

        table.setId(100);
        table.setModelName("Laptop Table");

        Map<String, String> otherProperties = new HashMap<>();

        otherProperties.put("NoOfLegs", "4");
        otherProperties.put("PreferredColor", "White");

        table.setOtherProperties(otherProperties);

        return table;
    }

}


