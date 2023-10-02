//这是一个主类

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        for (int i = 1; i<=100 ; i++) {

            //当数字中含有7时跳过并打印“过”的语句。
            int temp1 = 0;
            int temp = 0;
            temp = i % 10;
            temp1 = i / 10;


            if (temp == 7 || temp1 == 7) {
                System.out.println("过！");
                continue;
            }


            //7的倍数跳过，并打印“过”的语句。
            if (i%7==0) {
                System.out.println("过！");
                continue;
            }
            System.out.println(i);

        }
    }
}