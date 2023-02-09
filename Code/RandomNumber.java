package com.geren.test;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int i = 0, j = 0;
        Random r = new Random(); //1、Random 创建随机数
        for (; ; ) {
            int number1 = 1 + r.nextInt(10);
            int number2 = (int) (Math.random() * 10);//2、Math.random()创建随机数
            System.out.println(number1 + "*" + number2 + "=?");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
            if (answer == number1 * number2) {
                System.out.println("√");
                j += 1;
            } else {
                System.out.println("×");
            }
            i++;
            if (i == 5) { //设置题数
                break;
            }
        }
        System.out.println("一共答对" + j + "道题");
    }
}
