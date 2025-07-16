package com.D5_API;
//聊天框案例
import javax.swing.*;

public class P6_JTextArea {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setTitle("聊天室");
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

//文本域对象
        JTextArea textArea = new JTextArea();
        textArea.setBounds(10,10,360,200);
        jf.add(textArea);
//文本框
        JTextField text = new JTextField();
        text.setBounds(10,230,180,20);
        jf.add(text);
//发送按钮
        JButton send = new JButton("发送");
        send.setBounds(200,230,70,20);
        jf.add(send);
//清空聊天按钮
        JButton clear = new JButton("清空聊天");
        clear.setBounds(280,230,100,20);
        jf.add(clear);

        jf.setVisible(true);
    }
}
