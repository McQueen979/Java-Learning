package com.D5_API;
/*
    基本数据类型都有一个包装类：
            byte -> Byte    short -> Short      long -> Long
            float -> Float  double -> Double    boolean -> Boolean
            int -> Integer  char -> Character
    包装类常见操作——用于基本数据类型与字符串(引用)之间的转换

    Integer构造方法(过时)
        Integer(int value);
        Integer(String str);

    Integer 主要用于  String -> int (用于猜数字小游戏，输入的数字"50"是字符串，要转换为int类型才能比)
                    int -> String ()

     Integer构造方法(推荐)
        static Integer valueOf(int value); 返回指定int值的Integer对象
        static Integer valueOf(String str); 返回指定String值的Integer对象
 */
public class P9_Integer {
    public static void main(String[] args) {

    }
}
