package com.JiChengDeFangFa;

class Cat extends Animal {

    public void test1() {
        System.out.println("test1 Cat");
    }

    public void test3() {
        System.out.println("test3 Cat");
    }

    public void show() {
        //调用本类test1
        test1();

        //调用父类test1
        super.test1();

        //调用本类test2
        test2();

        //调用本类test3
        test3();
    }
}
