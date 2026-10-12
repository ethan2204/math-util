package com.ethan.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
//    CHUẨN BỊ RIÊNG DATA TEST RA 1 CHỖ - DDT - DATA DRIVEN TESTING
    public static Object[][] initTestData(){
         Object[][] testData = {{0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}};
         return testData;
    }
//    bây giờ test, nhồi data từ trên vào hàm assertEquals()
@ParameterizedTest // Sánh ngang vai với DDT
@MethodSource("initTestData")
    public void testFactorialGivenValidRunWel(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }

}