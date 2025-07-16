package com.D5_API;
//显示窗口以及图像和文本
import javax.swing.*;

public class P4_JLabel {
    public static void main(String[] args) {
        JFrame jf = new JFrame();           //创建窗体
        jf.setSize(700, 700);   //设置长宽,单位是px(像素)
        jf.setTitle("JFrame的基本设置");         //窗体标题
        jf.setLocationRelativeTo(null);     //在屏幕中央显示
        jf.setAlwaysOnTop(true);            //始终置顶
        jf.setDefaultCloseOperation(3);     //窗体关闭停止程序
        jf.setLayout(null);                 //取消默认布局

        //创建JLabel对象 -> 显示文本
        JLabel text = new JLabel("宋雨琦头像");
        text.setBounds(30, 5, 200, 20);    //在左上角起(10,10)处起显示文本
        jf.add(text);

        //创建JLabel对象 -> 显示图片
        //ImageIcon ii = new ImageIcon("Z:\@Code\JavaNote\Basic\Static_files\\D5_API_01.jpeg");    //绝对路径。不推荐。
        ImageIcon ii = new ImageIcon("Basic\\Static_files\\D5_API_01.jpeg");    //相对路径
        //一般从模块下新建文件夹保存静态文件，然后相对路径也是从模块下开始“相对”

        JLabel img = new JLabel(ii);
        img.setBounds(30, 30, 600, 600);
        jf.add(img);

        jf.setVisible(true);                //窗体可见
    }
}

