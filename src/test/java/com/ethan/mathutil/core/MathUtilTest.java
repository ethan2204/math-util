package com.ethan.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.ethan.mathutil.core.MathUtil.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
//    nếu n = -1 hy vọng hàm trả về ngoại lệ!!!
//    IllegalArgumentException
//    testcase 2:
    @Test
    void testFactorialGivenValidN5ReturnsWell720() {
        long expected = 720;
        int n = 6;
        long actual = getFactorial(n);
//        so sánh tự động giúp tôi expected có == actual hay không, nếu == thì green, else red
        assertEquals(expected,actual);
    }

//    testcase 1: test hàm với đầu vào hợp lệ, N = 5, hy vọng trả về 120
    @Test
    void testFactorialGivenValidN5ReturnsWell120() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);
//        so sánh tự động giúp tôi expected có == actual hay không, nếu == thì green, else red
        assertEquals(expected,actual);
    }
    @Test
    void testFactorialGivenValidN0ReturnsWell1() {
        long expected = 1;
        int n = 0;
        long actual = getFactorial(n);
//        so sánh tự động giúp tôi expected có == actual hay không, nếu == thì green, else red
        assertEquals(expected,actual);
    }
    @Test
    void testFactorialGivenValidN1ReturnnếuWell1() {
        long expected = 120;
        int n = 5;
        long actual = getFactorial(n);
//        so sánh tự động giúp tôi expected có == actual hay không, nếu == thì green, else red
        assertEquals(expected,actual);
    }
    //test case 4: test hàm với đầu vào ko hợp lệ
    //n = -1, hy vọng hàm: TRẢ VỀ NGOẠI LỆ!!! IllegalArgumentException
    @Test
    void testFactorialGivenInvalidNMinus1ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-1);
        });
    }
}