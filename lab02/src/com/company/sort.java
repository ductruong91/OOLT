package com.company;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int dolonmang;
        System.out.print("nhập độ lớn mảng:");
        Scanner sc = new Scanner(System.in);
        dolonmang = sc.nextInt();
        int[] array = new int[dolonmang];
        for (int i = 0; i < dolonmang; i++) {
            System.out.print("nhập số thứ" + (i + 1) + ":");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < dolonmang; i++) {
            for (int j = 0; j < dolonmang - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("mảng sau khi sắp xếp:");
        for (int i = 0; i < dolonmang; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
