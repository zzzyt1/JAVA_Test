package com.geren.test;

import java.util.Scanner;

public class ToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String a = sc.next();
        System.out.println(a.toUpperCase());

    }
}
