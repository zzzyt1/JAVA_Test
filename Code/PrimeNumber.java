package com.geren.test;

public class PrimeNumber {
    public static void main(String[] args) {
        //找出2-1000以内的素数
        int n = 0;
        for (int i = 2; i <= 1000; i++)
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {  //只能被自身整除
                    break;
                }
                if (j == i) {
                    System.out.println(i);
                    n++;
                }
            }
        System.out.println("素数共有:" + n);
    }
}
