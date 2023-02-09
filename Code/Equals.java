package com.geren.test;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd, pwd2;
        System.out.println("请输入密码：");
        pwd = sc.next();
        if (true) {
            System.out.println("请再次输入密码：");
            pwd2 = sc.next();
            while (!pwd.equals(pwd2)) {
                System.out.println("两次输入的密码不一致，请重新输入：");
//                System.out.println("请输入新密码：");
//                pwd = sc.next();
                System.out.println("请再次输入密码：");
                pwd2 = sc.next();
            }
            System.out.println("密码设置成功");
        }
    }
}
