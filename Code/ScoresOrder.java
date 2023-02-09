package com.geren.test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//接收用户从键盘输入成绩
        int[] scores = new int[100];//定义数组，不超过100
        int index = 0; //保存数组长度
        double sum = 0; //统计成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "学生的成绩");
            int number = sc.nextInt();
            if (number == -1)
                break;
            else {
                sum += number; //算和
                index = i + 1;  //记录数组长度
                scores[i] = number; //将输入的成绩保存在数组中
            }
        }
        for (int i = 1; i < index; i++) //冒泡排序
            for (int j = 0; j < index - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int tmp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tmp;
                }
            }
        System.out.println("最高分为：" + scores[0]);
        System.out.println("最低分:" + scores[index - 1]);//数组从0开始所以-1
        System.out.println("成绩由高到低排序：");
        for (int i = 0; i < index; i++) {    //循环输出数组
            System.out.println(scores[i] + " ");
        }
    }
}
