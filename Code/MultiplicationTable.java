package com.geren.test;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("乘法口诀表");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
    }
}
