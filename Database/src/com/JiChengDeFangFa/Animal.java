package com.JiChengDeFangFa;

/*
通过子类对象访问一个方法:就近原则
    子类成员范围找
    父类成员范围找
    注意:不能直接访问父类中私有成员

如果子父类中,出现了重名的成员方法,会优先使用子类的,要访问父类相同方法可以使用super关键字,
    如:super.父类成员方法
 */

public class Animal {
    public void test1() {
        System.out.println("test1 Animal");
    }

    public void test2() {
        System.out.println("test2 Animal");
    }
}
