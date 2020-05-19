package com.javaprogramto.jackson.annotations.jsonany;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class Table {

    private int id;
    private String modelName;


    private Map<String, String> otherProperties = new HashMap<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@JsonAnyGetter
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @JsonAnyGetter
    public Map<String, String> getOtherProperties() {
        return otherProperties;
    }


    public void setOtherProperties(Map<String, String> otherProperties) {
        this.otherProperties = otherProperties;
    }
}
