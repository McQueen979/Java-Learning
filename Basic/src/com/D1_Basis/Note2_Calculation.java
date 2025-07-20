package com.D1_Basis;
//数值计算
public class Note2_Calculation {
    public static void main(String[] args) {
// 1.数值拆分
        int num1 = 281;
        int ge = num1 % 10;          //  345%10=34..5
        int shi = num1 / 10 % 10;    //  345/10=34%10=3..4
        int bai = num1 / 100 % 10;   //  345/100=3
        int qian = num1 / 1000 % 10; //  0
        //做后续操作 (打印结果)
        System.out.println("281的个位:" + ge);
        System.out.println("281的十位:" + shi);
        System.out.println("281的百位:" + bai);
        System.out.println("281的千位:" + qian);

/* 2.数字相加 (类型转换)
                1.隐式转换: 小->大 计算机自动完成的（类型转换时有常量优化机制）
                2.强制转换: 大->小 手动书写格式,不推荐
        */
        //1.隐式转换 小->大
        int a = 10;
        double b = 12.3;
        System.out.println(a + b); //22.3 a先提升为double类型,在做运算

        int i = (int) (a + b);
        System.out.println(i); //22 如果使用double想转为int,小数点后面就丢失了

        double num2 = 100; //100默认是int类型,赋值给double,从小到大,属于隐式转换
        System.out.println(num2);    //100.0

        //2.强制转换 大->小
        //格式: 数据类型 变量名 = (目标类型)变量值;
        int j = (int) 3.14;
        System.out.println(j); //3 强转可能会造成数据精度的丢失,不建议!

/*3. 字符相加:当字符参与运算,底层会使用该字符,在ASCII码表中对应的十进制的整数值运算

        A -> 65  A到Z是连续的,逐个+1
        a -> 97  a到z是连续的,逐个+1
        0 -> 48  0到9是连续的,逐个+1 */

        //单独打印,展示的是字符本身
        System.out.println('0'); //0
        System.out.println('A'); //A
        System.out.println('a'); //a

        //参与运算,展示的是字符在ASCII码表中对应的整数相加的结果
        System.out.println('0' + 1); //49
        System.out.println('A' + 1); //66
        System.out.println('a' + 1); //98
        /*当 char 类型参与算术运算（如 +）时，Java 会自动将其转换为 int 类型（即字符的 Unicode 数值）。
        '0' 的 Unicode 值为 48（十进制）。表达式 '0' + 1 实际计算为 48 + 1 = 49。*/

/* 4.字符串相加
    当+号遇到字符串,就不是算数+了,而是字符串连接符
    字符串连接符可以让字符串和任意类型进行数据进行串联(拼接)
 */
        System.out.println("it" + "heima");     // "itheima"
        System.out.println("itheima" + 666);    // "itheima666"
        System.out.println(1 + 99 + "年黑马");   // "100年黑马"
        System.out.println("年黑马" + 1 + 99);   // "年黑马199"
        System.out.println(1 + 99);             // "100"
        System.out.println("5+5=" + 5 + 5);     // "5+5=55"
        /*表达式是从左到右进行计算的。首先字符串 "5+5=" 与数字 5 相加，此时会触发字符串拼接操作，得到字符串 "5+5=5"。
        接着，这个新字符串再和第二个数字 5 相加，继续进行字符串拼接，最终结果为 "5+5=55"。*/
        System.out.println(5 + 5 + "=5+5");     // "10=5+5"
        /*同样从左向右计算。由于前面两个操作数都是数字，所以先进行加法运算，5 + 5 的结果是 10。
        结果 10 再与字符串 "=5+5" 相加，发生字符串拼接，最终输出 "10=5+5"*/
        System.out.println(5 + 5);              // "10"
        //如何让结果满足正常算式的结果?
        System.out.println("5+5=" + (5 + 5));   //"5+5=10"  先算括号内的5+5=10，然后从左往后
    }
}
