package com.geren.test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long i = 1;
        if (n > 0) {
            for (int k = 1; k <= n; k++) {
                i *= k;
            }
            System.out.println(n + "的阶乘为：" + i);
        }
    }
}
