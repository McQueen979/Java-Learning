package com.D2_Loop;

public class P1 {
    //循环
    public class Note4_Loop {
        public static void main(String[] args) {
//案例: for循环案例:求1到100之间的偶数和
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("1到100之间的偶数和:" + sum);

//案例: while循环案例:求1到100之间的奇数和
            int sum1 = 0;
            int j = 1;
            while (j <= 100) {
                if (j % 2 == 1) {
                    sum1 += j;
                }
                j++;
            }
            System.out.println("1到100之间的奇数和:" + sum1);

//案例:  do ... while :求1-100所有数的和

        }
    }
}
