package com.D5_API;

/*
    我们自己起的类名,不能使用java用过的!!
    这里相当于自己定义了一个类叫Random
*/
public class Random {
    public static void main(String[] args) {
    //创建自己类的对象
        Random r = new Random();
        // int number = r.nextInt(100) + 1;
        // 这一行会报错：无法在 “Random” 中解析方法 “nextlnt” :11
        // 因为就近使用了咱自己创建的 Random, 而这个 Random 里面啥也没有
    }
}