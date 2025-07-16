package com.D2_Loop;

/*
    案例: for循环案例4(水仙花数)
        水仙花数是一个三位数, 数字每个位置的立方和等于数字本身
*/
public class P2 {
    public static void main(String[] args) {
        for (int i = 100; i < 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i+" ");
            }
        }
    }
}
