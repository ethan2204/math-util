package com.ethan.mathutil;

import com.ethan.mathutil.core.MathUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        TDD - Viết code bắt đầu từ viết test
        testFactorialGivenValidN5ReturnsWell120();

    }
    public static void testFactorialGivenValidN5ReturnsWell120(){
        long expected = 120;
        long actual = MathUtil.getFactorial(5);

    }
}
