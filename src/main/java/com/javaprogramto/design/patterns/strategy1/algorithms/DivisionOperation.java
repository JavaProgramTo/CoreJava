package com.javaprogramto.design.patterns.strategy1.algorithms;

import com.javaprogramto.design.patterns.strategy1.strategy.IBaseOperation;

public class DivisionOperation implements IBaseOperation {

    @Override
    public int doOperation(int value1, int value2) {
        int div = value1 / value2;

        return div;
    }

}
