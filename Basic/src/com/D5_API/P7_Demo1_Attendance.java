package com.D5_API;
//考勤案例
import javax.swing.*;

public class P7_Demo1_Attendance {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("考勤查询");//设置窗体标题
        jf.setLocationRelativeTo(null);//设置窗体位置在中央弹出
        jf.setDefaultCloseOperation(3);//设置窗体关闭停止程序
        jf.setAlwaysOnTop(true);//设置窗体置顶
        jf.setLayout(null);//取消默认布局

        //创建日期选择器对象，指定日期字符串格式
        DateChooser dateChooser1 = DateChooser.getInstance("yyyy-MM-dd");
        DateChooser dateChooser2 = DateChooser.getInstance("yyyy-MM-dd");

        //考勤日期文本
        JLabel date = new JLabel("考勤日期");
        date.setBounds(50,20,100,20);
        jf.add(date);

        //开始时间文本
        JLabel startTime = new JLabel("开始时间");
        startTime.setBounds(50,70,100,20);
        jf.add(startTime);
        //开始时间文本框
        JTextField startTimeText = new JTextField();
        startTimeText.setBounds(50,100,100,20);
        //把日历控件和文本框进行绑定
        dateChooser1.register(startTimeText);
        jf.add(startTimeText);

        //结束时间文本
        JLabel endTime = new JLabel("结束时间");
        endTime.setBounds(250,70,100,20);
        jf.add(endTime);
        //结束时间文本框
        JTextField endTimeText = new JTextField();
        endTimeText.setBounds(250,100,100,20);
        //把日历控件和文本框进行绑定
        dateChooser2.register(endTimeText);
        jf.add(endTimeText);

        //确定按钮
        JButton btn = new JButton("确定");
        btn.setBounds(250,180,60,20);
        jf.add(btn);

        jf.setVisible(true);//设置显示窗体(一般写在最后)
    }
}
