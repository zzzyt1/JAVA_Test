package com.geren.test;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 定义二维数组输出每位同学分数的最高分和每一门科目的最低分
        int[][] scores = {{78, 98, 66}, {55, 22, 77}, {61, 43, 99}, {11, 2, 64}};
        for (int i = 0; i < scores.length; i++) {
            int max = 0;
            for (int j = 0; j < scores[i].length; j++) {
                if (max < scores[i][j])
                    max = scores[i][j];
            }
            System.out.println("第" + (i + 1) + "位同学的最高分为：" + max);
        }
        System.out.println();
        for (int j = 0; j < scores[0].length; j++) {
            int min = scores[0][j];
            for (int i = 0; i < scores.length; i++) {
                if (min > scores[i][j])
                    min = scores[i][j];
            }
            System.out.println("第" + (j + 1) + "门科目的最低分为：" + min);
        }
    }
}
