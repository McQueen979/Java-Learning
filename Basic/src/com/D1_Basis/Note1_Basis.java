package com.D1_Basis;
//基础
public class Note1_Basis {
    public static void main(String[] args) {
        System.out.println("让她杀了你！！！");

        //3.定义long类型,要在数据后加L(大小写都行,一般大写)
        long l1 = 10000; //将int类型的10000常量,赋值给long类型的变量l1
        //long l2 = 2200000000; //22个亿超出了默认int类型的范围,需要将它声明为更大的类型
        long l2 = 2200000000L;

        //4.定义float类型,要在数据后加F(大小写都行,一般大写)
        double d = 3.14; //将double类型的3.14赋值给了double类型的变量d
        //float f = 3.14; //将double类型的数据, 赋值给float类型的变量, float装不下! 报错
        //float f = (float)3.14; 强制类型转换, 不允许

        //5.可以在一行定义多个变量,数据类型必须一致(不推荐,但是最好能识别)
        int a1 = 10, a2 = 20, a3 = 30;
        double d1 = 3.0, d2 = 4.1, d3 = 5.2;
    }
}

/*
    项目project  模块module  包package  类class
    IDEA中,HelloWorld的开发步骤
        1.创建空项目JavaSE
        2.在项目下,创建新模块day01
        3.在自动生成的src下创建包com.itheima(.代表文件夹的分级)
        4.再 new class. Java程序中最基本的组成单位是类 class
*/

/*
编写 Java 代码的三个步骤
1. 编写代码 : 将代码写到 .java的源文件中
2. 编译代码 : 使用javac.exe(编译工具)对源文件进行编译, 从而产生.class字节码文件
				使用方式: javac Xxx.java
3. 运行代码 : 使用java.exe(运行工具)运行字节码文件
				使用方式: java Xxx
				运行的时候, 不要带后缀.class
两个工具的使用, 需要在DOS中, 通过指令进行使用.
 */