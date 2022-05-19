package com.company;

import java.sql.SQLOutput;

public class JavaFundaamental {
    public static void main(String[] args) {
        //  chú ý khi tính toán với kiểu số thực
        System.out.println(5.0-4.1);
        //lệnh printf trong java
        System.out.printf("%.2f\n", 2.0-1.1);
        //khai báo hằng trong java
        final Double PI = 3.14159;
        System.out.println(PI);

        final long MICRO = 24*60*60*1000000; // đã tràn long
         // lưu ý phong chữ
        //lưu ý trong chuyển dổi kiểu
        System.out.println((int) (char) (byte) -1);
        //char vaf string trong pheps cộng
        System.out.println("H" + "a");
        System.out.println('H'+'a');

        System.out.println(1+2+"3");
        System.out.println("1"+2+3);

    }
}
