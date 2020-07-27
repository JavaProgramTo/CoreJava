package com.javaprogramto.design.patterns.strategy1.context;

import com.javaprogramto.design.patterns.strategy1.strategy.IBaseOperation;

public class OperationContext {

    private IBaseOperation iBaseOperation;

    public OperationContext(IBaseOperation iBaseOperation) {
        this.iBaseOperation = iBaseOperation;
    }

    public int executeStrategy(int value1, int value2) {
        return iBaseOperation.doOperation(value1, value2);
    }
}
