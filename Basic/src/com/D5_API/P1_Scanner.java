package com.D5_API;

import java.util.Scanner;

/*
    键盘录入对象Scanner
        1. 导包
        2. 创建键盘对象
        3. 控制台提示
        4. 调用方法接收数据
 */
public class P1_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小数:");
        double d = sc.nextDouble();
        System.out.println("输入的小数是:" + d);

        System.out.println("请输入整数:");
        int i = sc.nextInt();
        System.out.println("输入的整数是:" + i);

        System.out.println("请输入字符串:");
        if(sc.hasNextLine()) sc.nextLine();  //如果之前使用过nextInt()等方法，添加这一行来消耗换行符
        //String s = sc.next(); //碰到空格停止录入
        String s = sc.nextLine(); //碰到回车停止录入
        System.out.println("输入的字符串是:" + s);
    }
}
