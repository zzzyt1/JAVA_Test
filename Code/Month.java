package com.geren.test;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(;;){
            System.out.println("请输入月份：");
            int month=sc.nextInt();
            if(month==0){
                System.out.println("结束");
                break;
            }else{
                switch(month){
                    case 12:
                        System.out.println("December");
                        System.out.println(month+"月有31天");
                        break;
                    case 1:
                        System.out.println("January");
                        System.out.println(month+"月有31天");
                        break;
                    case 2:
                        System.out.println("February");
                        System.out.println(month+"月有28天");
                        break;
                    case 3:
                        System.out.println("March");
                        System.out.println(month+"月有31天");
                        break;
                    case 4:
                        System.out.println("April");
                        System.out.println(month+"月有30天");
                        break;
                    case 5:
                        System.out.println("May");
                        System.out.println(month+"月有31天");
                        break;
                    case 6:
                        System.out.println("June");
                        System.out.println(month+"月有30天");
                        break;
                    case 7:
                        System.out.println("July");
                        System.out.println(month+"月有31天");
                        break;
                    case 8:
                        System.out.println("August");
                        System.out.println(month+"月有31天");
                        break;
                    case 9:
                        System.out.println("September");
                        System.out.println(month+"月有30天");
                        break;
                    case 10:
                        System.out.println("October");
                        System.out.println(month+"月有31天");
                        break;
                    case 11:
                        System.out.println("November");
                        System.out.println(month+"月有30天");
                        break;
                    default:
                        System.out.println("输入不正确");
                }
            }
        }
    }
}
