package com.D5_API;
//显示窗口和按钮
import javax.swing.*;

/*
    import javax.swing.*;
        *代表导swing包下所有的类
        javax.swing：在awt的基础上,建立的一套图形界面系统,提供了更多的组件,而且完全由java实现。增强了移植性,属轻量级控件
 */

public class P3_JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();           //创建一个最初不可见的窗体
        jf.setSize(400, 200);   //设置长宽,单位是px(像素)
        jf.setTitle("窗体标题");                //窗体标题
        jf.setAlwaysOnTop(true);            //始终置顶
        jf.setLocationRelativeTo(null);     //在屏幕中央显示
        jf.setDefaultCloseOperation(3);     //窗体关闭停止程序
        jf.setLayout(null);                 //取消默认布局
        //大小 标题 置顶 中央 布局 关闭停止

        JButton btn1 = new JButton("确定");           //创建按钮1
        btn1.setBounds(80,100,100,20);  //设置坐标,大小
        jf.add(btn1);   //将按钮添加到窗体中

        JButton btn2 = new JButton("取消");           //创建按钮2
        btn2.setBounds(200,100,100,20); //设置大小,以及坐标
        jf.add(btn2);

        jf.setVisible(true);                //窗体可见
    }
}
