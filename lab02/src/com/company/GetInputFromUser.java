package com.company;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args) {
        //sủ dụng Scaner để nhập vào từ bàn phím
        //khởi tạo đối tượng scaner
        Scanner sc = new Scanner(System.in);
        //in ra thông báo và lệnh đọc dữ liệu
        System.out.println("tên của bạn là gì");
        String strName= sc.nextLine();
        System.out.println("nhập tuổi");
        int age = sc.nextInt();
        System.out.println("nhập chiều cao:");
        Double height=sc.nextDouble();
        System.out.println("thông tin của bạn đã nhập:");
        System.out.println("Họ tên: "+strName+", "+age+"tuổi, cao "+height+" met");


    }
}
