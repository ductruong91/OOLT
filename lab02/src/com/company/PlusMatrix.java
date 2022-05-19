package com.company;

import java.util.Scanner;

public class PlusMatrix {
    int i = 0;
    public static void main(String[] args) {
        int Cot;
        int Hang;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cột của matrix:");
        Cot = sc.nextInt();
        System.out.print("nhập số hàng của matrix:");
        Hang = sc.nextInt();

        int[][] array1 = new int[Hang][Cot];
        int[][] array2 = new int[Hang][Cot];
        int[][] array3 = new int[Hang][Cot];
        System.out.println("nhập ma trận thứ nhất");
        for (int i = 0; i < Hang; i++) {
            for (int j = 0; j < Cot; j++) {
                System.out.print("a" + i + j + ":");
                array1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("nhập ma trận thứ hai");
        for (int i = 0; i < Hang; i++) {
            for (int j = 0; j < Cot; j++) {
                System.out.print("a" + i + j + ":");
                array2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("kết quả khi cộng hai ma trận");
        for (int i = 0; i < Hang; i++) {
            for (int j = 0; j < Cot; j++) {
                array3[i][j] = array1[i][j]+array2[i][j];
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }

    }
}

