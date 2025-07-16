package com.D5_API;
/*
    String类成员方法
        1. int length(); 返回字符串长度 (包含字符的个数)
        2. boolean equals(字符串); 比较字符串内容
        3. boolean equalsIgnoreCase(字符串); 比较字符串内容忽略大小写
        4. String trim(); 去除字符串首、尾的空格
 */
public class P8_String {
    public static void main(String[] args) {
        // 定义字符串
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";

        //1. int length(); 返回字符串长度
        System.out.println(s1.length()); //3

        //2. boolean equals(字符串); 比较引用类型数据的内容
        System.out.println(s1.equals(s2)); //比内容,true
        System.out.println(s1.equals(s3)); //比内容,false
        // 比较引用类型数据的地址,使用==
        System.out.println(s1 == s1);
        // true 的原因是，双引号创建的对象不在堆也不再栈，被放在字符串常量池中，如果有内容一样的字符串被创建，地址也会被复用！！！！！

        //3. boolean equalsIgnoreCase(字符串); 比较引用类型数据的内容忽略大小写 (验证码)
        System.out.println(s1.equalsIgnoreCase(s3)); //比内容忽略大小写,true

        //4. String trim(); 去除字符串首、尾的空格 (不能去除中间的空格)
        String str = " user name ";
        System.out.println(str);
        System.out.println(str.trim());
    }
}

