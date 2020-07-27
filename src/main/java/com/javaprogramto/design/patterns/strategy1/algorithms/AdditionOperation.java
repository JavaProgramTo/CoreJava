package com.javaprogramto.design.patterns.strategy1.algorithms;

import com.javaprogramto.design.patterns.strategy1.strategy.IBaseOperation;

public class AdditionOperation implements IBaseOperation {

    @Override
    public int doOperation(int value1, int value2) {
        int sum = value1 + value2;

        return sum;
    }

}
