package com.company;

import java.util.Scanner;

public class popupWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao của tam giác:");

        int chieucao = sc.nextInt();

        for (int i = 1; i <=chieucao ; i++) {
            for (int j = 1; j <= chieucao-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= chieucao-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
