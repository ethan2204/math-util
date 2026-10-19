package com.ethan.mathutil.core;

public class MathUtil {
// TỐI ƯU, TINH CHỈNH CODE BẰNG THUẬT TOÁN KHÁC.
//    VIỆC CHỈNH CODE ĐỂ TỐT HƠN GỌI LÀ REFACTORING
    // ĐỔI HÀM TÍNH THEO ĐỆ QUY
    public static long getFactorial(int i) {
        if(i < 0 || i > 20) {
            throw new IllegalArgumentException("i must be between 0 and 20");
        }

        if(i == 0 || i == 1) {
            return 1;
        }
        // i! = (i - 1)! x i
        return i * getFactorial(i - 1);
//        long result = 1; // CỐ TÌNH THỬ GITHUB ACTIONS CÓ PHÁT HIỆN LỖI LOGIC KHÔNG
//        if( i == 0 ){
//            return 1;
//        }
//        if( i < 0 || i > 20 ){
//            throw new IllegalArgumentException("Invalid i, i must be between 0 and 20");
//        }
//      n đang ổn, làm vòng for mà tính dồn, nhân dồn vào resut
//        for (int j = 1; j <= i ; j++) {
//            result *= j;
//        }
//        return result;
    }
}
