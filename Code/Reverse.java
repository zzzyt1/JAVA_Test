package com.geren.test;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        //数组倒序输出

        //1、直接倒序输出
//        int[] arr = new int[100];
//        int n = 0;  //记录数组长度
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数组元素：");
//        for (int i = 0; i < arr.length; i++) {
//            int number = sc.nextInt();
//            if (number == -1)
//                break;
//            else {
//                arr[i] = number;
//                n++;
//            }
//        }
//        for (int i = n-1; i >= 0; i--) {
//            System.out.print(arr[i]+" ");
//        }
        //2、数组元素对换
        String[] strings = {"one", "two", "three"};
        System.out.println("交换前：" + Arrays.toString(strings));//Arrays.toString()将数组转换成String类型输出的
        for (int start = 0, end = strings.length - 1; start < end; start++, end--) {
            String temp = strings[end];
            strings[end] = strings[start];
            strings[start] = temp;
        }
        System.out.println("交换后：" + Arrays.toString(strings));
    }
}
