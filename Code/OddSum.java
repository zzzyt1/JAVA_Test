package com.geren.test;

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        int sum = 0, k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int num = sc.nextInt();
        do {
            if (k % 2 != 0) {
                sum += k;
            }
            k++;
        } while (k <= num);
        System.out.println(num + "以内的奇数和为：" + sum);
    }
}
