package com.wbl.stream;

import java.util.function.BinaryOperator;

public class BinaryExample {

    public final Integer additionTwoNum(final int num1, final int num2) {
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
        return func2.apply(num1, num2);
    }
}
