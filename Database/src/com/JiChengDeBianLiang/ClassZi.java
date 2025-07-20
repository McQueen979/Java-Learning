package com.JiChengDeBianLiang;

class ClassZi extends ClassFu {
    int num = 2;

    public void test() {
        int num = 3;
        System.out.println(num);        // 局部变量 3         局部变量直接访问
        System.out.println(this.num);   // 本类成员变量 2     使用this访问:this.本类成员变量
        System.out.println(super.num);  // 父类成员变量 1     使用super访问:super.父类成员变量
    }
}
/*
    在子类方法中访问一个变量规则:就近原则
        1.先在子类局部范围找
        2.然后子类成员范围找
        3.然后父类成员范围找,如果父类范围还没有找到则报错。
    注意:父类中私有的成员子类不能直接访问。
*/
