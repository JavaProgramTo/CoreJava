package com.javaprogramto.design.patterns.strategy1.test;

import com.javaprogramto.design.patterns.strategy1.algorithms.AdditionOperation;
import com.javaprogramto.design.patterns.strategy1.context.OperationContext;

public class TestCalculationStrategy {

    public static void main(String[] args) {

        OperationContext addContext = new OperationContext(new AdditionOperation());
        int add = addContext.executeStrategy(10, 20);
        System.out.println("Addition Operation strategy output : "+add);

        // write there for the reamining three.


    }
}
