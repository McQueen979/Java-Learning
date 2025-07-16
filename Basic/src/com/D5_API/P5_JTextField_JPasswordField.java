package com.D5_API;
//显示输入框，输入账号密码  JTextField JPasswordField
import javax.swing.*;

public class P5_JTextField_JPasswordField {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("用户登录");
        jf.setSize(400,400);
        jf.setAlwaysOnTop(true);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);

//用户名文本
        JLabel usernameJLabel = new JLabel("用户名");
        usernameJLabel.setBounds(50, 50, 50, 20);
        jf.add(usernameJLabel);
//密码文本
        JLabel passwordJLabel = new JLabel("密码");
        passwordJLabel.setBounds(50, 100, 50, 20);
        jf.add(passwordJLabel);
//用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        jf.add(usernameField);
//密码输入框
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        jf.add(passwordField);
//登录按钮
        JButton btn = new JButton("登录");
        btn.setBounds(50,200,280,20);
        jf.add(btn);

        jf.setVisible(true);
    }
}
