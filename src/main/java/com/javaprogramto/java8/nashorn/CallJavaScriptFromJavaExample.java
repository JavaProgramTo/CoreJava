package com.javaprogramto.java8.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CallJavaScriptFromJavaExample {

    public static void main(String[] args) throws ScriptException {

        // creating java script engine
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

        // getting the nashorn engine
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        // evaluating the javascript statement  to  print
        nashorn.eval("invoke(10, 20)");

        // summing 2  numbers in  js  from  java code.
        Integer i = (Integer) nashorn.eval("1 + 2");

        System.out.println("sum from javascript : " + i);
    }
}
