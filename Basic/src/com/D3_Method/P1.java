package com.D3_Method;

/*
        1.方法的概述: 一段具有独立功能的代码块, 需要先定义才能调用
        2.方法定义格式:

        public static void 方法名(){
            方法体;
        }

       3.方法调用格式: 方法名();
       4.方法和方法之间的关系? 平级关系,所以不能嵌套定义
        */
public class P1 {
    public static void main(String[] args) {
        // 带参数调用方法
        getMax(10, 20);
    }

    // 带参数定义方法
    public static void getMax(int a, int b) {
        //打印较大值
        if (a > b) {
            System.out.println("max:" + a);
        } else if (a < b) {
            System.out.println("max:" + b);
        } else {
            System.out.println("两数相等");
        }
    }
}

