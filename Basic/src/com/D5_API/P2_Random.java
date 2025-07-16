package com.D5_API;

import java.util.Random;
import java.util.Scanner;

/*
     随机数对象Random
        1. 导包
        2. 创建随机数对象
        3. 调用方法,指定范围,生成随机数

     猜数字小游戏:练习目标是熟练的掌握Scanner和Random
 */
public class P2_Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //使用随机数对象生成一个正确答案,范围[1-100]
        Random r = new Random();
        int number = r.nextInt(100) + 1; // [ 0 - bound ) 左闭右开

        //使用循环模拟多次游戏
        while (true) {
            //提示用户猜
            System.out.println("请输入你猜的数字:");
            //接收键盘录入的数据
            int guessNum = sc.nextInt();
            //判断用户猜的guessNum和正确答案number之间的关系
            //做健壮性的判断
            if (guessNum < 1 || guessNum > 100) {
                System.out.println("你输入的数字超出了范围!");
            } else if (guessNum > number) {
                System.out.println("猜大了!");
            } else if (guessNum < number) {
                System.out.println("猜小了!");
            } else {
                System.out.println("恭喜你~猜对了!");
                //结束死循环
                break;
            }
        }
    }
}
