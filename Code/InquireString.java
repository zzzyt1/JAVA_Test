package com.geren.test;

import java.util.Scanner;

public class InquireString {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("请输入想查询的字符串：");
        String str2 = sc.next();
        int num = new InquireString().countStr(str1, str2);
        System.out.println(str2 + "共出现" + num + "次");
    }

    private int countStr(String str1, String str2) { //构造一个方法
        int num = 0;
        while (str1.contains(str2)) {
            str1 = str1.substring(str1.indexOf(str2) + str2.length());
            num++;
        }
        return num;
    }
}
