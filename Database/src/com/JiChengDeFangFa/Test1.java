package com.JiChengDeFangFa;

class Test1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.test1();    // 子类,优先访问
        cat.test2();    // 直接访问父类
        cat.test3();    // 子类有,直接访问子类
        cat.show();     // 见 Cat
    }
}
