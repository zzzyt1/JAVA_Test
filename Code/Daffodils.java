package com.geren.test;

public class test02 {
    public static void main(String[] args) {
        //水仙花
        int a = 0, b = 0, c = 0,number=0; //a是百位，b是十位，c是个位
        for (int i = 100; i < 999; i++) {
            a = i / 100;
            b = i / 10 % 10;
            c = i % 10;
            if (i == (a * a * a + b * b * b + c * c * c)) {
                System.out.println(i);
                number++; //记录个数
            }
        }
        System.out.println("水仙花的个数是："+number); 

    }
}
