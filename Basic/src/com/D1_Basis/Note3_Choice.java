package com.D1_Basis;

//条件语句
public class Note3_Choice {
    public static void main(String[] args) {
// if
        int age = 17;
        if (age >= 18) {
            System.out.println("可以上网");
        } else {
            System.out.println("不可以上网!");
        }
// if else
        int l = 1; //红灯
        if (l == 1) {
            System.out.println("红灯停");
        } else if (l == 2) {
            System.out.println("绿灯行");
        } else if (l == 3) {
            System.out.println("黄灯注意");
        } else if (l == 4) {
            System.out.println("故障");
        }
// 三元运算符
        int a = 10, b = 20, c = 30;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("max:" + max);
// switch case break

    }
}
